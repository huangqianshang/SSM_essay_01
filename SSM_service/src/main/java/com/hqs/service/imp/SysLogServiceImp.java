package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
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

    public List < SysLog > findAll(int pageNum, int pageSize,String keyValue) {
        PageHelper.startPage (pageNum,pageSize);
        return sysLogDao.findAll("%"+keyValue+"%");
    }

    public int findTotalLog(String keyValue) {
        return sysLogDao.findTotalLog("%"+keyValue+"%");
    }
}
