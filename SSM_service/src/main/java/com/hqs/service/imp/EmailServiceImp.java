package com.hqs.service.imp;

import com.hqs.dao.EmailDao;
import com.hqs.domain.Email;
import com.hqs.service.EmailService;
import com.hqs.util.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("emailService")
public class EmailServiceImp implements EmailService{
    @Autowired
    private EmailDao emailDao;

    public int findNewEmailNum(String userId) {
        return emailDao.findNewEmailNum (userId);
    }

    public List < Email > findNewEmail(String userId) {
        return emailDao.findNewEmail (userId);
    }

    public List < Email > findAll(String userId) {
        return emailDao.findAll(userId);
    }

    public void save(Email email) {
        email.setId (GetUUID.get ());
        email.setSendId ("a");
        email.setSendTime (new Date ());
        email.setReadStatus (0);
        emailDao.save(email);
    }

    public void setRead(String id) {
        emailDao.setRead(id);
    }
}
