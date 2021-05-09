package com.hqs.service;

import com.hqs.domain.SysLog;

import java.util.List;

public interface SysLogService {
    void save(SysLog sysLog);

    //分页查询所有
    List< SysLog> findAll(int pageNum, int pageSize,String keyValue);

    //查询总数目
    int findTotalLog(String keyValue);
}
