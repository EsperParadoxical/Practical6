package demo;

/**
 * Created by 151260d on 11/21/2016.
 */

public class Book {
    String id, description, surname, first_name, title;
    double price;
    int calendar_year, inventory;

    public Book(){

    }

    public Book(String id, String description, String surname, String first_name, String title, double price, int calendar_year, int inventory) {
        this.id = id;
        this.description = description;
        this.surname = surname;
        this.first_name = first_name;
        this.title = title;
        this.price = price;
        this.calendar_year = calendar_year;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalendar_year() {
        return calendar_year;
    }

    public void setCalendar_year(int calendar_year) {
        this.calendar_year = calendar_year;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}