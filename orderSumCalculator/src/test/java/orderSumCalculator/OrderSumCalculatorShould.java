package orderSumCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderSumCalculatorShould {

    @Test
    void return970then1000() {

        double orderSumBeforeDiscount = 1000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(970d, result);
    }

    @Test
    void return4750then5000() {

        double orderSumBeforeDiscount = 5000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(4750d, result);
    }

    @Test
    void return6510then7000() {

        double orderSumBeforeDiscount = 7000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(6510d, result);
    }

    @Test
    void return9000then10000() {

        double orderSumBeforeDiscount = 10000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(9000d, result);
    }

    @Test
    void return12750then15000() {

        double orderSumBeforeDiscount = 15000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(12750d, result);
    }

    @Test
    void return17000then20000() {

        double orderSumBeforeDiscount = 20000;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(17000d, result);
    }

    @Test
    void returnSameFor900() {

        double orderSumBeforeDiscount = 900;

        final OrderSumCalculator orderSumCalculator = new OrderSumCalculator();
        double result = orderSumCalculator.getSumAfterDiscount(orderSumBeforeDiscount);
        assertEquals(900d, result);
    }
}
