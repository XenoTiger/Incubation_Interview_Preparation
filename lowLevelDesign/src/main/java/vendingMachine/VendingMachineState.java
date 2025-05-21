package vendingMachine;

public interface VendingMachineState {

    void selectProduct(Product product);

    void insertCoin(Coin coin);

    void dispenseProduct();

    void returnChange();

}
