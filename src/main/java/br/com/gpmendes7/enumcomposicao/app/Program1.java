package br.com.gpmendes7.enumcomposicao.app;

import br.com.gpmendes7.enumcomposicao.entities.Order;
import br.com.gpmendes7.enumcomposicao.entities.enums.OrderStatus;

import java.util.Date;

public class Program1 {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }

}
