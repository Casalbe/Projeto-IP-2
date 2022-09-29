package br.ufrpe.rubank.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Transaction {

    private Account sender;
    private Account receiver;
    private LocalDate date;
    private Double value;
    private String description;
    private String type;

    public Transaction(
            Account sender,
            Account receiver,
            LocalDate date,
            Double value,
            String description,
            String type
    ) {
        this.setSender(sender);
        this.setReceiver(receiver);
        this.setDate(date);
        this.setValue(value);
        this.setDescription(description);
        this.setType(type);
    }

    public Account getSender() { return sender; }
    public void setSender(Account sender) { this.sender = sender; }

    public Account getReceiver() { return receiver; }
    public void setReceiver(Account receiver) { this.receiver = receiver; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Double getValue() { return value; }
    public void setValue(Double value) { this.value = value; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
