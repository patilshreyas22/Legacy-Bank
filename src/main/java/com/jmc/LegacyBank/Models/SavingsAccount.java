package com.jmc.LegacyBank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingsAccount extends Account{

    //This will be withdrawal limit from the savings

    private final DoubleProperty withdrawalLimit;

    public SavingsAccount(String owner , String accountNumber , double balance , double withdrawalLimit) {
        super(owner , accountNumber , balance);
        this.withdrawalLimit = new SimpleDoubleProperty(this , "Withdrawal Limit " , withdrawalLimit);
    }

    public DoubleProperty withdrawalLimitProp() {
        return withdrawalLimit;
    }
}
