package com.potec.controller;

import com.potec.constant.CommonStatusEnum;
import com.potec.constant.DataStatusEnum;
import com.potec.pojo.User;
import com.potec.exception.PasswordException;
import com.potec.message.Message;
import com.potec.service.UserService;
import com.potec.vo.LoginVo;
import com.potec.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by pohoulong on 2018/1/15.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Login message.
     *
     * @param vo      the vo
     * @param result  the result
     * @param session the session
     * @return the message
     * @throws PasswordException the password exception
     */
    @PostMapping("/login")
    public Message login(@RequestBody @Valid LoginVo vo, BindingResult result, HttpSession session) throws PasswordException {
        if (result.hasErrors()) {
            ObjectError error = result.getFieldError();
            return Message.error(error.getDefaultMessage());
        }
        String code = vo.getCode();
        String generatorCode = session.getAttribute("generateCode").toString();
        if (!code.equals(generatorCode)) {
            return Message.error(CommonStatusEnum._CODE_ERROR.getCode(),
                    CommonStatusEnum._CODE_ERROR.getContent());
        }
        User user = new User(vo.getLoginName(), vo.getPassword());
        Integer id = userService.confirm(user);
        session.setAttribute("userId", id);
        return Message.success();
    }

    /**
     * Register message.
     *
     * @param vo      the vo
     * @param result  the result
     * @param session the session
     * @return the message
     */
    @PostMapping("/register")
    public Message register(@RequestBody @Valid RegisterVo vo, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            ObjectError error = result.getFieldError();
            return Message.error(error.getDefaultMessage());
        }
        String code = vo.getCode();
        String generatorCode = session.getAttribute("generateCode").toString();
        if (!code.equals(generatorCode)) {
            return Message.error(CommonStatusEnum._CODE_ERROR.getCode(),
                    CommonStatusEnum._CODE_ERROR.getContent());
        }
        User user = new User(vo.getLoginName(), vo.getPassword(), vo.getRealName());
        userService.insert(user);
        return Message.success();
    }

    @GetMapping("/{loginName}/find")
    public Message findLoginName(@PathVariable String loginName) {
        if (loginName == null) {
            return Message.error(CommonStatusEnum._NO_DATA.getCode(),CommonStatusEnum._NO_DATA.getContent());
        }
        userService.findByLoginName(loginName);
        return Message.success();
    }

    @PostMapping("/user/update")
    public Message updateUser(@RequestBody User user,HttpSession session){
        Integer id = Integer.parseInt(session.getAttribute("userId").toString());
        user.setId(id);
        userService.update(user);
        return Message.success();
    }

    @PostMapping("/user/get")
    public Message getUser(HttpSession session){
        Integer id = Integer.parseInt(session.getAttribute("userId").toString());
        User user  = userService.selectById(id, DataStatusEnum._USE.getCode());
        return Message.success(user);
    }

    @PostMapping("/update/user")
    public Message update(@RequestBody User user){
        userService.update(user);
        return Message.success();
    }


}
