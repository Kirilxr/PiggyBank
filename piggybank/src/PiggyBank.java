public class PiggyBank {
    int quarters, dimes, nickels, pennies;

    public PiggyBank(int q, int d, int n, int p) {

        if (q < 0 || d < 0 || n < 0 || p < 0) {
            System.out.println("You have submitted an incorrect input, try again.");
        } else {
            this.quarters = q;
            this.dimes = d;
            this.nickels = n;
            this.pennies = p;

        }
    }

    public void printCoins() {

        System.out.println("Quarters: " + this.quarters);
        System.out.println("Dimes: " + this.dimes);
        System.out.println("Nickels: " + this.nickels);
        System.out.println("Pennies: " + this.pennies);

    }

    public void totalValue() {
        double money = this.quarters * 0.25 + this.dimes * 0.1 + this.nickels * 0.05
                        + this.pennies * 0.01;
        System.out.println("Your Total Value: " + money);
        
    }

    public void insertChange(int q, int d, int n, int p) {

        if (q < 0 || d < 0 || n < 0 || p < 0) {
            System.out.println("You have submitted an incorrect input, try again.");
        } else {
        this.quarters += q;
        this.dimes += d;
        this.nickels += n;
        this.pennies += p;
        }

    }

    public void withdrawValue(double money) {

        while (Math.round(money * 100.0) / 100.0 != 0.00) {
            if (money > this.quarters * 0.25 + this.dimes * 0.1 + this.nickels * 0.05
            + this.pennies * 0.01) { 
                System.out.println("Sorry, there are not enough coins here.");
                break;
            } else if (this.quarters > 0 && money >= 0.25) {
                this.quarters -= 1;
                money -= 0.25;
                continue;
            } else if (this.dimes > 0 && money >= 0.1) {
                this.dimes -= 1;
                money -= 0.1;
                continue;
            } else if (this.nickels > 0 && money >= 0.05) {
                this.nickels -= 1;
                money -= 0.05;
                continue;
            } else if (this.pennies > 0 && money >= 0.01) {
                this.pennies -= 1;
                money -= 0.01;
                continue;
            }
        }
    }

    public void combineBanks(PiggyBank right) {

        this.quarters += right.quarters;
        this.dimes += right.dimes;
        this.nickels += right.nickels;
        this.pennies += right.quarters;

        right.quarters -= right.quarters;
        right.dimes -= right.dimes;
        right.nickels -= right.nickels;
        right.pennies -= right.pennies;

        printCoins();

    }

}