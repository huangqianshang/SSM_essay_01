package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.RoleDao;
import com.hqs.domain.Role;
import com.hqs.service.RoleService;
import com.hqs.util.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleDao roleDao;

    public List < Role > findAll(int pageNum, int pageSize) {
        PageHelper.startPage (pageNum,pageSize);
        return roleDao.findAll();
    }

    public void save(Role role) {
        role.setId (GetUUID.get ());
        roleDao.save(role);
    }

    public List < Role > findOtherRole(String id) {
        return roleDao.findOtherRole(id);
    }

    public Role findById(String id) {
        return roleDao.findByRoleId (id);
    }

    public void addPermissionToRole(String roleId, String ids) {
        roleDao.addPermissionToRole(roleId,ids);
    }

    public int findTotalRole() {
        return roleDao.findTotalRole();
    }
}
