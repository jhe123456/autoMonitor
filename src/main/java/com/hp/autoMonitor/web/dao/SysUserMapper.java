package com.hp.autoMonitor.web.dao;

import java.math.BigDecimal;
import java.util.List;

import com.hp.autoMonitor.core.generic.GenericDao;
import com.hp.autoMonitor.web.model.SysUser;

public interface SysUserMapper extends GenericDao<SysUser, Long> {
    int insert(SysUser record);

    int insertSelective(SysUser record);
    
    List<SysUser> selectAllUsers();
    
    SysUser selectByPrimaryKey(BigDecimal id);

}