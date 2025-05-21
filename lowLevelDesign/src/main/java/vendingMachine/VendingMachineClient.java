package vendingMachine;

public class VendingMachineClient {
    public static void main(String[] args) {

        VendingMachine vendingMachine = VendingMachine.getInstance();

        Product coke = new Product("Coke", 22.0);
        Product pepsi = new Product("Pepsi", 20.0);
        Product water = new Product("Water", 10.0);

        vendingMachine.inventory.addProduct(coke, 3);
        vendingMachine.inventory.addProduct(pepsi, 2);
        vendingMachine.inventory.addProduct(water, 5);

        vendingMachine.selectProduct(coke);

        vendingMachine.insertCoin(Coin.TEN);
        vendingMachine.insertCoin(Coin.TEN);
        vendingMachine.insertCoin(Coin.FIVE);

        vendingMachine.dispenseProduct();

        vendingMachine.returnChange();


    }
}
