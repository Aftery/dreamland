package top.aftery.dao;


import tk.mybatis.mapper.common.Mapper;
import top.aftery.entity.LoginLog;

public interface LoginLogMapper extends Mapper<LoginLog> {
    int deleteByPrimaryKey(Long id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}