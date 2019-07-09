package top.aftery.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aftery.dao.RoleMapper;
import top.aftery.entity.Role;
import top.aftery.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(long id) {
        Role role = new Role();
        role.setId( id );
        return roleMapper.selectOne( role );
    }

    @Override
    public int add(Role role) {
        return roleMapper.insert(role);
    }
}
