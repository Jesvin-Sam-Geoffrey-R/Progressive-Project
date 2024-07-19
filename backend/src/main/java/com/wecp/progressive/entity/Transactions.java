package com.wecp.progressive.entity;
import java.sql.Timestamp;
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
//@Entity
public class Transactions {
 
 
    private int transactionId;
    private int accountId;
    private double amount;
    private Date transactionDate;
    private String transactionType;
 
 public int getTransactionId() {
        return transactionId;
    }
 
 
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
 
 
    public int getAccountId() {
        return accountId;
    }
 
 
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
 
 
    public double getAmount() {
        return amount;
    }
 
 
    public void setAmount(double amount) {
        this.amount = amount;
    }
 
 
    public Date getTransactionDate() {
        return transactionDate;
    }
 
 
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
 
 
    public String getTransactionType() {
        return transactionType;
    }
 
 
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
 
 
    //   @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
   
   
   public Transactions()
   {
 
   }
 
 
public Transactions(int transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
    this.transactionId = transactionId;
    this.accountId = accountId;
    this.amount = amount;
    this.transactionDate = transactionDate;
    this.transactionType = transactionType;
}
 
   
 
 
// public int getTransaction_id() {
//     return transactionId;
// }
 
// public void setTransaction_id(int transactionId) {
//     this.transactionId = transactionId;
// }
 
// public int getAccount_id() {
//     return accountId;
// }
 
// public void setAccount_id(int account_id) {
//     this.accountId = account_id;
// }
 
// public Double getAmount() {
//     return amount;
// }
 
// public void setAmount(Double amount) {
//     this.amount = amount;
// }
 
// public Date getTransaction_date() {
//     return transactionDate;
// }
 
// public void setTransaction_date(Date transaction_date) {
//     this.transactionDate = transaction_date;
// }
 
// public String getTransaction_type() {
//     return transactionType;
// }
 
// public void setTransaction_type(String transaction_type) {
//     this.transaction_type = transaction_type;
// }
 
 
}