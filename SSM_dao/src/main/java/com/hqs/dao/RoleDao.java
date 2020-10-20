package com.hqs.dao;

import com.hqs.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleDao {
    @Select ("select * from role where id in(select roleId from users_role where userId = #{userId})")
    @Results({
            @Result(property = "permissions",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.PermissionDao.findByRoleId"))
    })
    List < Role > findByUserId(String userId);

    @Select ("select * from role")
    List< Role> findAll();

    @Insert ("insert into role values (#{id},#{roleName},#{roleDesc})")
    void save(Role role);

    @Select ("select * from role where id not in(select roleId from users_role where userId = #{userId})")
    List< Role> findOtherRole(String userId);

    @Select ("select * from role where id = #{id}")
    @Results({
            @Result(property = "permissions",column = "id",javaType = List.class,many = @Many(select = "com.hqs.dao.PermissionDao.findByRoleId"))
    })
    Role findByRoleId(String id);

    @Insert ("insert into role_permission values (#{permissionId},#{roleId})")
    void addPermissionToRole(@Param ("roleId") String roleId,@Param ("permissionId") String ids);

    @Select ("select count(*) from role")
    int findTotalRole();
}
