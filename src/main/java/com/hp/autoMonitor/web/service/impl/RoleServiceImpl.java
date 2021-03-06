package com.hp.autoMonitor.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hp.autoMonitor.core.generic.GenericDao;
import com.hp.autoMonitor.core.generic.GenericServiceImpl;
import com.hp.autoMonitor.web.dao.RoleMapper;
import com.hp.autoMonitor.web.model.Role;
import com.hp.autoMonitor.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
