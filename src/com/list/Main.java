// Java program to demonstrate ArrayList<>

package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating ArrayList<> to store beauty salons
        List<BeautySalon> list = new ArrayList<>();

        // Creating instance of BeautySalon class
        BeautySalon beautySalon = new BeautySalon();
        beautySalon.setName("Beautiful People");

        // Calling method toDoPedicure()
        beautySalon.toDoPedicure();

        // Creating instance of BeautySalon class
        BeautySalon beautySalon1 = new BeautySalon();
        beautySalon1.setName("Chocolate");

        // Creating instance of BeautySalon class
        BeautySalon beautySalon2 = new BeautySalon();
        beautySalon2.setName("Muss");

        // Creating instance of BeautySalon class
        BeautySalon beautySalon3 = new BeautySalon();
        beautySalon3.setName("Foam");

        // Creating instance of BeautySalon class
        BeautySalon beautySalon4 = new BeautySalon();
        beautySalon4.setName("Soap");

        // Adding beauty salons to a list
        list.add(beautySalon);
        list.add(beautySalon1);
        list.add(beautySalon2);
        list.add(beautySalon3);
        list.add(beautySalon4);

        // Printing the list to console
        System.out.println(list);

        // Removing beauty salon Beautiful People
        list.remove(beautySalon);

        // Printing the list to console
        System.out.println(list);
    }
}

// BeautySalon class
class BeautySalon {

    // Field name
    String name;

    // Default constructor
    public BeautySalon() {
    }

    // Constructor with argument name
    public BeautySalon(String name) {
        this.name = name;
    }

    // SetName() method to set value for field name
    public void setName(String name) {
        this.name = name;
    }

    // GetName() method to get value of field name
    public String getName() {
        return name;
    }

    // ToCutHair() method
    public void toCutHair(){
        System.out.println("Hair dress is done!");
    }

    // ToDoManicure() method
    public void toDoManicure(){
        System.out.println("Manicure is done!");
    }

    // ToDoPedicure() method
    public void toDoPedicure(){
        System.out.println("Pedicure is done!");
    }

    // ToDoShugaring() method
    public void toDoShugaring(){
        System.out.println("Shugaring is done!");
    }

    // ToDoPeeling() method
    public void toDoPeeling(){
        System.out.println("Peeling is done!");
    }

    // ToDoChocolateCovering() method
    public void toDoChocolateCovering(){
        System.out.println("Chocolate Covering is done!");
    }

    // ToDoCrealifting() method
    public void toDoCrealifting(){
        System.out.println("Crealifting is done!");
    }

    // Equals() method to compare objects of BeautySalon
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BeautySalon that = (BeautySalon) o;
        return Objects.equals(name, that.name);
    }

    // HashCode() method to compare objects of BeautySalon correct
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    // ToString() method to print BeautySalon instances correct
    @Override
    public String toString() {
        return "Beauty Salon \"" +
                name + "\"";
    }
}