package se.danielk.model;

public class Candy extends Product{


    public Candy(int id, String items, int price) {
        super(id, items, price);
    }

    @Override
    public String examine() {
        String infoCandy = getItems() + " " + getId() + "for: " + getPrice();
        return infoCandy;
    }

    @Override
    public String getItems(){
        return super.getItems();
    }
}
