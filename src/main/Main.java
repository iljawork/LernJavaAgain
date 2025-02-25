package main;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 200,2,250);
        basket.add("Slivka", 300,34.5);
        Basket basket2 = new Basket();
        basket2.add("Milk1", 300,3,30);
        basket.print("Milk");
        basket2.print("Slivka");
        Basket.getAllCount();
        Basket.getAllPrice();
        System.out.println("Средняя цена во всех корзинах: " + Basket.getAveragePriceALLBasket());
        System.out.println("Средняя стоимость корзины: " + Basket.getAveragePriceOneBasket());
    }
}