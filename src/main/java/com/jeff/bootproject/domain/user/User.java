package com.jeff.bootproject.domain.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jeff
 * <p>Date 2018/3/16 17:28</p>
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private String id;
    private String userName;
    private String password;

}
