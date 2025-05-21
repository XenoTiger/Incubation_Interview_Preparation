package vendingMachine;

public class ReturnChangeState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already collected. Please collect change.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Product already collected. Please collect change.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product already collected. Please collect change.");
    }

    @Override
    public void returnChange() {
        double change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().getPrice();
        if (change > 0) {
            System.out.println("Change returned : " + change);
            vendingMachine.resetPayment();
        } else {
            System.out.println("No change to return.");
        }
        vendingMachine.resetSelectedProduct();
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
