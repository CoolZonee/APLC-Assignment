package main.java;

public class Payment {
    private String date;
    private double totalPrice, totalPaid;

    public Payment(String date, double totalPrice, double totalPaid) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalPaid = totalPaid;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public String getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalPaid() {
        return totalPaid;
    }
}
