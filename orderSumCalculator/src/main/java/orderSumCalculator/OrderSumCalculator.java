package orderSumCalculator;

public class OrderSumCalculator {
    public double getSumAfterDiscount(double orderSumBeforeDiscount) {


        return orderSumBeforeDiscount * getPriceMultiplayer(orderSumBeforeDiscount);
    }

    public double getPriceMultiplayer(double orderSumBeforeDiscount) {
        double priceMultiplayer = 1d;
        if (orderSumBeforeDiscount >= 1000 && orderSumBeforeDiscount < 5000) {
            priceMultiplayer = priceMultiplayer - 0.03;
        }
        if (orderSumBeforeDiscount >= 5000 && orderSumBeforeDiscount < 7000) {
            priceMultiplayer = priceMultiplayer - 0.05;
        }
        if (orderSumBeforeDiscount >= 7000 && orderSumBeforeDiscount < 10000) {
            priceMultiplayer = priceMultiplayer - 0.07;
        }
        if (orderSumBeforeDiscount >= 10000 && orderSumBeforeDiscount < 15000) {
            priceMultiplayer = priceMultiplayer - 0.1;
        }
        if (orderSumBeforeDiscount >= 15000) {
            priceMultiplayer = priceMultiplayer - 0.15;
        }
        return priceMultiplayer;
    }
}
