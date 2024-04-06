package cn.luckyneko.web.dao;


import cn.luckyneko.web.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao extends JpaRepository<SysUser, Integer> {
    SysUser findByUsername(String username);

    SysUser findByEmail(String email);
}
