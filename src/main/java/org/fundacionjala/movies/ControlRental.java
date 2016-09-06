package org.fundacionjala.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Control Rental.
 */
public class ControlRental {
    private List<Rental> rentals;
    private Customer customer;

    /**
     * Builder to Control rental object.
     *
     * @param customer Customer object.
     */
    public ControlRental(Customer customer) {
        this.rentals = new ArrayList<Rental>();
        this.customer = customer;
    }

    /**
     * Obtain count rentals.
     *
     * @return count rentals.
     */
    public int countRentals() {
        return this.rentals.size();
    }

    /**
     * Add rental at set Rental object.
     *
     * @param rental Rental Object.
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Obtain calculateTotalAmount the set Rentals.
     *
     * @return Total amount.
     */
    public double calculateTotalAmount() {
        return rentals.stream()
                .mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Calculated frequent renter points.
     *
     * @return frequent renter points.
     */
    public int calculateFrequentRenterPoints() {
        return rentals.stream()
                .mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }
}
