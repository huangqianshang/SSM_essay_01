package com.hqs.service.imp;

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

    public List < Permission > findAll() {
        return permissionDao.findAll();
    }

    public void save(Permission permission) {
        permission.setId (GetUUID.get ());
        permissionDao.save(permission);
    }

    public List < Permission > findByRoleId(String id) {
        return permissionDao.findNotInByRoleId (id);
    }
}
