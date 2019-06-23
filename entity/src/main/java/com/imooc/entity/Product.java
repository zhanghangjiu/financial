package com.imooc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    private String id;
    private String name;
    private BigDecimal thresholdAmoount;
    private BigDecimal stepAmount;
    private Integer lockTerm;
    private BigDecimal rewardRate;
    private String status;
    private String memo;
    private Date createAt;
    private String createUser;
    private Date updateAt;
    private String updateUser;
}