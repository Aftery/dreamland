package top.aftery.service;


import top.aftery.entity.RoleUser;
import top.aftery.entity.User;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.List;

@SuppressWarnings("all")
public interface RoleUserService {
    /**
     * 根据用户查询角色用户集合
     * @param user
     * @return
     */
    List<RoleUser> findByUser(User user);

    /**
     * 添加用户角色中间对象
     * @param roleUser
     * @return id
     */
    int add(RoleUser roleUser);


    /**
     * 根据用户id删除
     * @param uid
     */
    void deleteByUid(Long uid);
}
