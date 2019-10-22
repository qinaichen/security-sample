package org.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.security.dao.UserDao;
import org.security.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecuritySampleApplicationTests {


    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testAddUser() {

        SysUser user = new SysUser();
        user.setUsername("admin");
        user.setPassword(passwordEncoder.encode("123456"));
        user.setAccountNonExpired(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonLocked(true);
        user.setEnabled(true);
        userDao.save(user);
    }

}
