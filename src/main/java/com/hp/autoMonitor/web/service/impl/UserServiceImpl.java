package com.hp.autoMonitor.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hp.autoMonitor.core.generic.GenericDao;
import com.hp.autoMonitor.core.generic.GenericServiceImpl;
import com.hp.autoMonitor.web.dao.SysUserMapper;
import com.hp.autoMonitor.web.model.SysUser;
import com.hp.autoMonitor.web.service.UserService;

/**
 * 用户Service实现类
 *
 * @author zl
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<SysUser, Long> implements UserService {

	  @Resource
	    private SysUserMapper sysUserMapper;

	
	@Override
	public SysUser authentication(SysUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser selectByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysUser> getAllUsers() {
		return sysUserMapper.selectAllUsers();
	}

	@Override
	public GenericDao<SysUser, Long> getDao() {
		return sysUserMapper;
	}

	@Override
	public void insertUser(SysUser user) {
		sysUserMapper.insert(user);
	} 
	
	
}
