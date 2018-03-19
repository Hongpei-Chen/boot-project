package com.jeff.bootproject.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeff
 * <p>Date 2018/3/16 17:29</p>
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserName(String userName);
}
