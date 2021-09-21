package sample;

import java.util.Date;

public class RentedItem {
    private int customerID;
    public int itemID;
    private Date DueDate;

    public RentedItem(int customerID, int itemID, Date dueDate) {
        this.customerID = customerID;
        this.itemID = itemID;
        DueDate = dueDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }
}
