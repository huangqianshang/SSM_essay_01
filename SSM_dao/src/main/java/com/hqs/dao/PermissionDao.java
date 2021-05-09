package com.hqs.dao;

import com.hqs.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionDao {
    @Select ("select * from permission where id in (select permissionId from role_permission where roleId = #{roleId})")
    List < Permission > findByRoleId(String roleId);

    @Select ("select * from permission where permissionName like #{keyValue}")
    List<Permission> findAll(String keyValue);

    @Insert ("insert into permission values (#{id},#{permissionName},#{url})")
    void save(Permission permission);

    @Select ("select * from permission where id not in (select permissionId from role_permission where roleId = #{roleId})")
    List< Permission> findNotInByRoleId(String id);

    @Select ("select count(*) from permission where permissionName like #{keyValue}")
    int findTotalPermission(String keyValue);

    @Delete("delete from permission where id in (#{ids}) ")
    int deleteByIds(String ids);
}
