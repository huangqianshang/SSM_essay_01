package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.PermissionDao;
import com.hqs.domain.Permission;
import com.hqs.service.PermissionService;
import com.hqs.util.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImp implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    public List < Permission > findAll(int pageNum, int pageSize,String keyValue) {
        PageHelper.startPage (pageNum,pageSize);
        return permissionDao.findAll("%"+keyValue+"%");
    }

    public void save(Permission permission) {
        permission.setId (GetUUID.get ());
        permissionDao.save(permission);
    }

    public List < Permission > findByRoleId(String id) {
        return permissionDao.findNotInByRoleId (id);
    }

    public List<Permission> findMyByRoleId(String id){
        return permissionDao.findInByRoleId (id);
    }

    public int findTotalPermission(String keyValue) {
        return permissionDao.findTotalPermission("%"+keyValue+"%");
    }

    public int deleteByIds(String ids){
        ids = ids.substring(0,ids.length()-1);
        return permissionDao.deleteByIds(ids);
    }
}
