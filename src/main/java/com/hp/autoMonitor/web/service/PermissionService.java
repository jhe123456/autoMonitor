package com.hp.autoMonitor.web.service;

import java.util.List;

import com.hp.autoMonitor.core.generic.GenericService;
import com.hp.autoMonitor.web.model.Permission;

/**
 * 权限 业务接口
 * 
 * @author StarZou
 * @since 2014年6月10日 下午12:02:39
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
