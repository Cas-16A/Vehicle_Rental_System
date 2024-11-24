package Vehicle_Rental_System;


import java.util.Date;

public class Cash extends Payment {
    private double cashReceived;

    public Cash(double totalAmount, String currency, Date paymentDate, double cashReceived) {
        super(totalAmount, currency, paymentDate);
        this.cashReceived = cashReceived;
    }

    public void setCashReceived(double cashReceived) {
        this.cashReceived = cashReceived;
    }

    public double getCashReceived() {
        return cashReceived;
    }
}



