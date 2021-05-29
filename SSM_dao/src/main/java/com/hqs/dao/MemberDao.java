package com.hqs.dao;

import com.hqs.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberDao {
    //通过id查找一个Member对象
//    @Select ("select * from `member` where id = #{id}")
//    Member findById(String id);
    @Select ("select * from db1.tab_user where uid = #{id}")
    Member findById(String id);
}
