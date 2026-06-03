package model;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int foodAmount, double foodPrice, boolean foodIsVegetarian) {
        this.amount = foodAmount;
        this.price = foodPrice;
        this.isVegetarian = foodIsVegetarian;
    }
        public int getAmount () {
            return amount;
        }

        public double getPrice () {
        return price;
    }

        public boolean isVegetarian () {
        return isVegetarian;
    }
        public double getDiscount () {
            return 0;
    }

    }

