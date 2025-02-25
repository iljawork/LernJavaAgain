package main;

public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static double allPrice;
    private static int allCount;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price,double weight) {
        add(name, price,1,weight);
    }


    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. - " + weight + " г.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;
        allCount = allCount + count;
        allPrice = allPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        if (totalWeight > 0) {
            System.out.println("Масса товаров в корзине - " + totalWeight);
        } else {
            System.out.println("Корзина пуста");
        }
    }

    public static void getAllPrice() {
        if (allPrice > 0) {
            System.out.println("Общая стоимость всех корзин: " + allPrice);
        }
    }

    public static void getAllCount() {
        if (allCount > 0) {
            System.out.println("Общее количество товаров в корзинах: " + allCount);
        }
    }

    public static double getAveragePriceALLBasket() {
        return allPrice / allCount;
    }

    public static double getAveragePriceOneBasket() {
        return allPrice / Basket.count;
    }

}
