package solidPrinciples.isp;

/*
This class is not following ISP, bcoz BhimUpi doesn't support all features.
The corrected version is in PaymentApp class
 */
public interface UPIPay {

    void payMoney();

    void getScratchCard();

    void getCashBackAsCreditBalance();

}

class Gpay implements UPIPay {

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {

    }
}

class BhimUpi implements UPIPay {

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {

    }
}
