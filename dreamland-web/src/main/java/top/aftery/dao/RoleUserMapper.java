package top.aftery.dao;


import tk.mybatis.mapper.common.Mapper;
import top.aftery.entity.RoleUser;

public interface RoleUserMapper extends Mapper<RoleUser> {
    int deleteByPrimaryKey(Long id);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}