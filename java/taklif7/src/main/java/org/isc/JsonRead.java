package org.isc;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRead {

    public static void main(String[] args) throws JsonProcessingException {
        String json = """
                {
                   "name": "Atefeh",
                   "balances": 500,
                   "transaction": {
                     "to": 101213,
                     "amount": 500.0,
                     "desc": "receive"
                   }
                }
                """;
        ObjectMapper mapper = new ObjectMapper();
        Account account = mapper.readValue(json, Account.class);
        System.out.println("------- action ------");
        System.out.println("Name: " + account.getName());
        System.out.println("Balances: " + account.getBalances());
        System.out.println("Transaction: " + account.getTransaction());
    }
}


class Account {

    @JsonProperty("name")
    private String name;
    @JsonProperty("balances")
    private double balances;
    @JsonProperty("transaction")
    private Transaction transaction;

    public Account() {}

    public String getName() {
        return name;
    }

    public double getBalances() {
        return balances;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balances=" + balances +
                ", transaction=" + transaction +
                '}';
    }
}


class Transaction {

    @JsonProperty("to")
    private String to;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("desc")
    private String desc;

    public Transaction() {}

    @Override
    public String toString() {
        return "Transaction{" +
                "to='" + to + '\'' +
                ", amount=" + amount +
                ", desc='" + desc + '\'' +
                '}';
    }
}