package main;

public class Warehouse {

    private final Dimensions gabarit;
    private final int massa;
    private final String deliveryAddress;
    private final boolean canCoup;
    private final String registrNumber;
    private final boolean fragile;

    public Warehouse(Dimensions gabarit, int massa, String deliveryAddress, boolean canCoup, String registrNumber, boolean fragile) {
        this.gabarit = gabarit;
        this.massa = massa;
        this.deliveryAddress = deliveryAddress;
        this.canCoup = canCoup;
        this.registrNumber = registrNumber;
        this.fragile = fragile;
    }

    public Dimensions getGabarit() {
        return gabarit;
    }

    public int getMassa() {
        return massa;
    }

    public Warehouse setMassa(int massa) {
        return new Warehouse(gabarit, massa, deliveryAddress, canCoup, registrNumber, fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Warehouse setDeliveryAddress(String deliveryAddress) {
        return new Warehouse(gabarit, massa, deliveryAddress, canCoup, registrNumber, fragile);
    }

    public String getRegistrNumber() {
        return registrNumber;
    }

    public Warehouse setRegistrNumber(String registrNumber) {
        return new Warehouse(gabarit, massa, deliveryAddress, canCoup, registrNumber, fragile);
    }

    public boolean isCanCoup() {
        return canCoup;
    }

    public Warehouse setCanCoup(boolean canCoup) {
        return new Warehouse(gabarit, massa, deliveryAddress, canCoup, registrNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public Warehouse setFragile(boolean fragile) {
        return new Warehouse(gabarit, massa, deliveryAddress, canCoup, registrNumber, fragile);
    }




}
