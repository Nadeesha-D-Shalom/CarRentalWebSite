import java.util.Date;

public class Payment {
    private String paymentID;
    private double paymentAmount;
    private Date paymentDate;

    int amountPerDay = 10000;

    ///  get data from the user or the car class and other classes
    public Payment(Date paymentDate, int amountPerDay, double paymentAmount, String paymentID) {
        this.paymentDate = paymentDate;
        this.amountPerDay = amountPerDay;
        this.paymentAmount = paymentAmount;
        this.paymentID = paymentID;
    }

    public void ViewPayment(){
        ///  display the payment
    }

    public void MakePayment(){

    }

    public void CheckVehicleType(){

    }

    public void CalculatePayment(){

    }


}
