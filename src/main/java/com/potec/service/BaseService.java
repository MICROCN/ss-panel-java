package com.potec.service;

import com.potec.exception.ConnectionRefusedException;

import java.util.List;

/**
 * Created by pohoulong on 2018/1/15.
 */
public interface BaseService<T> {
    /**
     * 插入所有对象属性到数据库
     *
     * @param entity,返回的的主键id在entity对应的主键属性中
     * @return 返回插入的记录数
     * @throws Exception
     */
    public void insert(T entity) throws ConnectionRefusedException;

    /**
     * 批量插入数据到数据库
     *
     * @param
     * @return
     * @throws Exception
     */
    public void insertBatch(List<T> entityList) throws ConnectionRefusedException;

    /**
     * 根据id查询实体对象所有属性
     *
     * @param id
     * @return 返回查询记录
     * @throws Exception
     */
    public T selectById(Integer id, String dataStatus) throws ConnectionRefusedException;

    /**
     * 查找所有记录
     *
     * @return
     * @throws Exception
     */
    public List<T> selectAll(String dataStatus) throws ConnectionRefusedException;

    /**
     * 根据id删除记录
     *
     * @param id
     * @return 返回删除的条数
     * @throws Exception
     */
    public int deleteById(Integer id, Object userId) throws ConnectionRefusedException;

    /**
     * 根据实体类id更新实体所有属性
     *
     * @param entity
     * @return 返回更新的记录数
     * @throws Exception
     */
    public int update(T entity) throws ConnectionRefusedException;

    public T find(Object str) throws ConnectionRefusedException;

}
