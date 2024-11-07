package se.danielk.model;

public interface Main {

    void addMoney(int amount);
    double getBalance();
    Product request (int id);
    double endSession();
    String getDescription(int id);
    String[] getProducts();


}