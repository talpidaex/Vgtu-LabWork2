/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;

public class Item implements Comparable<Item>{
        
        private String title;
        private String producer;
        private String  countryOfOrigin;
        private double price;
        private int productionYear;

    public Item(String title, String producer, String countryOfOrigin, double price, int productionYear) {
        this.title = title;
        this.producer = producer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.productionYear = productionYear;
    }
    public Item(){
        title = "title_name";
        producer = "producer_name";
        countryOfOrigin="count_of_origin_name";
        price=0.0;
        productionYear=0;
    }
    public String getTitle() {
        return title;
    }
    public String getProducer() {
        return producer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

 @Override
    public String toString() {

        return "\n{"+"Title :"+title+"\tProducer:"+producer+"\tOrigin : "+countryOfOrigin+"\tPrice : "+price+"\tYear :"+productionYear+"}";
        
    }

    @Override
    public int compareTo(Item t) {
        
        int years = t.getProductionYear();
        return this.productionYear-years;
    }

}
