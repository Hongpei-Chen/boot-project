package com.jeff.bootproject.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeff
 * <p>Date 2018/3/14 14:27</p>
 */
public interface TestRepository extends JpaRepository<Test, String> {
}
