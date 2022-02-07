package com.lahmxu.fsm.spring.service;

import com.lahmxu.fsm.spring.domain.Order;

import java.util.Map;

public interface OrderService {

    Order creat();

    Order pay(int id);

    Order deliver(int id);

    Order receive(int id);

    Map<Integer, Order> getOrders();

}
