package com.jeff.bootproject.domain.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jeff
 * <p>Date 2018/3/16 17:54</p>
 */
@Entity
@Table(name = "user_role")
@Data
public class UserRole {

    @Id
    private String id;
    private String userId;
    private String roleId;

}
