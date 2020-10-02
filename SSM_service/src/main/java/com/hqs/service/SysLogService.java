package com.hqs.service;

import com.hqs.domain.SysLog;

import java.util.List;

public interface SysLogService {
    void save(SysLog sysLog);

    List< SysLog> findAll();
}
