package top.aftery.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aftery.dao.RoleUserMapper;
import top.aftery.entity.RoleUser;
import top.aftery.entity.User;
import top.aftery.service.RoleUserService;

import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserMapper roleUserMapper;

    public List<RoleUser> findByUser(User user) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( user.getId() );
        return roleUserMapper.select( roleUser );
    }

    public int add(RoleUser roleUser) {
        return roleUserMapper.insert( roleUser );
    }

    public void deleteByUid(Long uid) {
        RoleUser roleUser = new RoleUser();
        roleUser.setuId( uid );
        roleUserMapper.delete( roleUser );
    }
}
