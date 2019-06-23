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
@Table(name = "order_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    @Id
    private String orderId;
    private String chanId;
    private String productId;
    private String chanUserId;
    private String orderType;
    private String orderStatus;
    private String outerOrderId;
    private BigDecimal amount;
    private String memo;
    private Date createAt;
    private Date updateAt;


}