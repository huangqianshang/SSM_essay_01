package com.hqs.service.imp;

import com.github.pagehelper.PageHelper;
import com.hqs.dao.UserDao;
import com.hqs.domain.Role;
import com.hqs.domain.UserInfo;
import com.hqs.service.UserService;
import com.hqs.util.GetUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userDao.loadUserByUsername (username);
        List < Role > roles = userInfo.getRoles ();
        List< SimpleGrantedAuthority > authorities = getGrantedAuthorities(roles);
        User user = new User (userInfo.getUsername (),userInfo.getPassword (),userInfo.getStatus ()==0?false:true,true,true,true,authorities);
        return user;
    }

    //创建authorities对象
    private List< SimpleGrantedAuthority > getGrantedAuthorities(List<Role> roles){
        List< SimpleGrantedAuthority > authorities = new ArrayList < SimpleGrantedAuthority > ();
        for (Role role:
             roles) {
            authorities.add (new SimpleGrantedAuthority (role.getRoleName ()));
        }
        return authorities;
    }

    public List < UserInfo > findAll(int pageNum,int pageSize,String keyValue) {
        PageHelper.startPage (pageNum,pageSize);
        return userDao.findAll("%"+keyValue+"%");
    }

    public void save(UserInfo user) {
        user.setId (GetUUID.get ());
        user.setPassword (bCryptPasswordEncoder.encode (user.getPassword ()));
        userDao.save(user);
    }

    public UserInfo findById(String id) {
        UserInfo user = userDao.findById(id);
        return user;
    }

    public void addRole(String ids, String userId) {
        String[] idList = ids.split(",");
        for(String id:
            idList){
            userDao.addRole(id,userId);
        }
    }

    public void delRole(String ids, String userId){
        String[] idList = ids.split(",");
        for(String id:
                idList){
            userDao.delRole(id,userId);
        }
    }

    public List < UserInfo > findOtherUsernameByUsername(String username) {
        return userDao.findOtherUsernameByUsername(username);
    }

    public String findIdByUsername(String receiveName) {
        return userDao.findIdByUsername(receiveName);
    }

    public int findTotalUser(String keyValue) {
        return userDao.findTotalUser("%"+keyValue+"%");
    }

    public void update(UserInfo user){
        if( !user.getPassword().contains("$2a") ){
            user.setPassword (bCryptPasswordEncoder.encode (user.getPassword ()));
        }
        userDao.update(user);
    }

    public int deleteByIds(String ids){
        ids = ids.substring(0,ids.length()-1);
        return userDao.deleteByIds(ids);
    }
}
