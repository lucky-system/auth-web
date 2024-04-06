package cn.luckyneko.web.service;

import cn.luckyneko.web.dao.SysUserDao;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    private final SysUserDao userDao;

    public SysUserService(SysUserDao userDao) {
        this.userDao = userDao;
    }

}
