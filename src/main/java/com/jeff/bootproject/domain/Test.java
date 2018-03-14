package com.jeff.bootproject.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author jeff
 * <p>Date 2018/3/14 14:14</p>
 */
@Entity
@Table(name = "test")
@Data
public class Test implements Serializable{

    @Id
    private String id;
    private String name;
}
