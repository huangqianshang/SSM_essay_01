package com.hqs.dao;

import com.hqs.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysLogDao {
    @Insert ("insert into syslog values (#{id}," +
            "#{visitTime}," +
            "#{username}," +
            "#{ip}," +
            "#{url}," +
            "#{executionTime}," +
            "#{method})")
    void save(SysLog sysLog);

    @Select ("select * from syslog where visitTime like #{keyValue} or username like #{keyValue}  ORDER BY visitTime DESC")
    List< SysLog> findAll(String keyValue);

    @Select ("select count(*) from syslog where visitTime like #{keyValue} or username like #{keyValue} ")
    int findTotalLog(String keyValue);
}
