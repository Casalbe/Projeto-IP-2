package br.ufrpe.rubank.api.helpers;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import br.ufrpe.rubank.api.models.Account;
import br.ufrpe.rubank.api.models.Admin;
import br.ufrpe.rubank.api.models.Person;
import br.ufrpe.rubank.api.models.Transaction;

public class Database {
  private static final String URL = "master.fgn2nfr.mongodb.net/?retryWrites=true&w=majority";
  private static final String USER = "teste";
  private static final String PASSWORD = "E9Np3HAVojEs47o4";
  private static final String DATABASE  = "RuBank";

  public MongoCollection<Admin> Admins = null;
  public MongoCollection<Person> People = null;
  public MongoCollection<Account> Accounts = null;
  public MongoCollection<Transaction> Transactions = null;

  public Database() {
    String URI = "mongodb+srv://" + USER + ":" + PASSWORD + "@" + URL;
    MongoClient mongoClient = MongoClients.create(URI);
    MongoDatabase database = mongoClient.getDatabase(DATABASE);

    this.Admins = database.getCollection("Admins", Admin.class);
    this.People = database.getCollection("People", Person.class);
    this.Accounts = database.getCollection("Accounts", Account.class);
    this.Transactions = database.getCollection("Transactions", Transaction.class);
  }
}