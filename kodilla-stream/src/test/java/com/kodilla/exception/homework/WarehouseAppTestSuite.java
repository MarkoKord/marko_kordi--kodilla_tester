package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {
    @Test
    public void getOrderTest_ExistOrder() throws OrderDoesentExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5"));
        String result = warehouse.getOrder("5").getNumber();
        assertEquals("5",  result);

    }

    @Test
    public void getOrderTest_withThrowException()  {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesentExistException.class, () -> warehouse.getOrder("10"));


   }

}



