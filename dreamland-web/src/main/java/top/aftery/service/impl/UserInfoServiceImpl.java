package top.aftery.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aftery.dao.UserInfoMapper;
import top.aftery.entity.UserInfo;
import top.aftery.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    public UserInfo findByUid(Long id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setuId(id);
        return userInfoMapper.selectOne(userInfo);
    }

    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    public void add(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }
}
