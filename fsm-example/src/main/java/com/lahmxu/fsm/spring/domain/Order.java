package com.lahmxu.fsm.spring.domain;

import lombok.Data;

@Data
public class Order {

    private Integer id;

    private OrderStatus status;
}
