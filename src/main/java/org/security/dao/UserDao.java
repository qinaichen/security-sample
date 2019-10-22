package org.security.dao;

import org.security.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<SysUser,Long> {

    SysUser findByUsername(String username);
}
