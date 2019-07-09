package top.aftery.dao;


import tk.mybatis.mapper.common.Mapper;
import top.aftery.entity.Resource;

public interface ResourceMapper extends Mapper<Resource> {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}