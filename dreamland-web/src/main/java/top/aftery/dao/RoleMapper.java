package top.aftery.dao;


import tk.mybatis.mapper.common.Mapper;
import top.aftery.entity.Role;

public interface RoleMapper extends Mapper<Role> {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}