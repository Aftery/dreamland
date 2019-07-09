package top.aftery.service;

import top.aftery.entity.LoginLog;

import java.util.List;

@SuppressWarnings("all")
public interface LoginLogService {
    /**
     * 添加登录日志
     * @param loginLog
     * @return
     */
    int add(LoginLog loginLog);

    /**
     * 查询所有日志
     * @return
     */
    List<LoginLog> findAll();

    /**
     * 根据用户id查询日志集合
     * @param uid
     * @return
     */
    List<LoginLog> findByUid(Long uid);


}
