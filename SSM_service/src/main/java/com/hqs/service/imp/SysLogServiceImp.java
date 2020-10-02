package com.hqs.service.imp;

import com.hqs.dao.SysLogDao;
import com.hqs.domain.SysLog;
import com.hqs.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysLogService")
public class SysLogServiceImp implements SysLogService {
    @Autowired
    private SysLogDao sysLogDao;

    public void save(SysLog sysLog) {
        sysLogDao.save(sysLog);
    }

    public List < SysLog > findAll() {
        return sysLogDao.findAll();
    }
}
