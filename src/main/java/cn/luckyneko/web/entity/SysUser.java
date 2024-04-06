package cn.luckyneko.web.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "sys_user")
@Entity
@Data
public class SysUser {
    // basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username", unique = true, updatable = false, nullable = false, length = 30)
    private String username;
    @Column(name = "email", length = 30, unique = true, nullable = false)
    private String email;
    @Column(name = "password", length = 128, nullable = false)
    private String password;
    @Column(name = "salt", length = 64, nullable = false)
    private String salt;

    // info
    @Column(name = "gender", length = 10)
    private String gender;
    @Column(name = "sign", length = 1000)
    private String sign;
}
