package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Created by AldoBalderrama on 8/23/2016.
 */
public class ControlRental {
    private List<Rental> rentals;
    private Customer customer;

    /**
     * Obtain customer object.
     * @return Customer object.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Builder to Control rental object.
     * @param customer Customer object.
     */
    public ControlRental(Customer customer) {
        this.rentals = new ArrayList<Rental>();
        this.customer = customer;
    }

    /**
     * Obtain count rentals.
     * @return count rentals.
     */
    public int countRentals() {
        return this.rentals.size();
    }

    /**
     * Add rental at set Rental object.
     * @param rental Rental Object.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Obtain calculateStatement the set Rentals.
     * @return Total amount.
     */
    public double calculateStatement() {
        double totalAmount = 0;
        for (Rental rental: rentals) {
            double thisAmount;
            thisAmount = rental.calculateAmount();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    /**
     * Calculated frequent renter points
     * @return frequent renter points
     */
    public int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental: rentals) {
            frequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}