package main;

public class Main {

    public static void main(String[] args) {
        Dimensions box = new Dimensions(10,20,30);
        box.setHeight(30);
        box.setWidth(20);
        box.setLength(40);

        Warehouse bigBox = new Warehouse(box,200,"Самара, улю пупкина", true,"3457FRG",true);
        System.out.println(box.volume());
    }

}