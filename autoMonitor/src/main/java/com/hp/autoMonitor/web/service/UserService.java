package com.hp.autoMonitor.web.service;

import java.util.List;


import com.hp.autoMonitor.core.generic.GenericService;
import com.hp.autoMonitor.web.model.SysUser;

/**
 * 用户 业务 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:53:33
 **/
public interface UserService extends GenericService<SysUser, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
	SysUser authentication(SysUser user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
	SysUser selectByUsername(String username);
    
    List<SysUser> getAllUsers();
    
    void insertUser(SysUser user); 
}
