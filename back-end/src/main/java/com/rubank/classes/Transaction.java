package br.ufrpe.rubank.api.models;

public class Transaction {
  private String originAccountNumber;
  private String destinationAccountNumber;
  private String transactionType;
  private String description;
  private double value;
  private String date;

  public Transaction(String originAccountNumber, String destinationAccountNumber, String transactionType, String description, double value, String date) {
    setOriginAccountNumber(originAccountNumber);
    setDestinationAccountNumber(destinationAccountNumber);
    setTransactionType(transactionType);
    setDescription(description);
    setValue(value);
    setDate(date);
  }

  public String getOriginAccountNumber() { return originAccountNumber; }
  public void setOriginAccountNumber(String originAccountNumber) { this.originAccountNumber = originAccountNumber; }

  public String getDestinationAccountNumber() { return destinationAccountNumber; }
  public void setDestinationAccountNumber(String destinationAccountNumber) { this.destinationAccountNumber = destinationAccountNumber; }

  public String getTransactionType() { return transactionType; }
  public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }

  public double getValue() { return value; }
  public void setValue(double value) { this.value = value; }

  public String getDate() { return date; }
  public void setDate(String date) { this.date = date; }
}
