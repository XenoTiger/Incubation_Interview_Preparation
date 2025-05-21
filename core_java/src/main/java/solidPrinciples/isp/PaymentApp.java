package solidPrinciples.isp;

interface BasicUPIPayments {
    void payMoney();

    void getScratchCard();
}

interface CashbackUPIPayments {
    void getCashBackAsCreditBalance();
}

class GooglePay implements BasicUPIPayments, CashbackUPIPayments {

    @Override
    public void payMoney() {
        System.out.println("Paying money via GooglePay.");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Getting scratch card via GooglePay.");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Getting cashback as credit balance via GooglePay.");
    }
}

class ABCPay implements BasicUPIPayments {
    @Override
    public void payMoney() {
        System.out.println("Paying money via ABC UPI App.");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Getting scratch card via ABC UPI App.");
    }
}

public class PaymentApp {

    public static void main(String[] args) {
        BasicUPIPayments googlePayBasic = new GooglePay();
        CashbackUPIPayments googlePayCashback = new GooglePay();

        googlePayBasic.payMoney();
        googlePayBasic.getScratchCard();
        googlePayCashback.getCashBackAsCreditBalance();

        // ABC UPI App supports only basic features
        BasicUPIPayments abcUPIApp = new ABCPay();
        abcUPIApp.payMoney();
        abcUPIApp.getScratchCard();
    }
}
