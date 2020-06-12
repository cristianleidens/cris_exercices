package leidens.cris.testelombok.model;

import lombok.*;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category modal
 */
@ToString
@AllArgsConstructor @NoArgsConstructor
public class GameStore {

    @Getter
    @Setter
    private String nameOfGame;

    @Getter
    @Setter
    private String category;

    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    private int amount;

    @Getter
    @Setter
    private int rentHours;


    /**
     * if game are rented subtract the number of amount
     */
    public void gameRent() {
        if (getAmount() > 0) {
            setAmount(this.amount - 1);
        } else {
            getAmount();
        }
    }

    /**
     * if game are back add to amount
     */
    public void gameBack() {
        setAmount(this.amount + 1);
    }

    /**
     * the metod calculate the value on stock of gamestore
     * @return the multiply of amount and price
     */
    public double valueInStock() {
        return amount * price;
    }

    /**
     * This metod calculate the value the client will pay
     * @param hours
     * @return the result from price multiply by hours
     */
    public double priceToPay(int hours) {
        return getPrice() * hours;
    }

    /**
     * register the hours the game are rented all the time
     * @param hours
     */
    public void rentedHours(int hours) {
        this.setRentHours(hours + this.rentHours);
    }
}