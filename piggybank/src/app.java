public class app {
    public static void main(String[] args) throws Exception {
        
    PiggyBank piggy = new PiggyBank(10, 5, 5, 10); 

    piggy.printCoins();

    piggy.withdrawValue(1.49);
    
    piggy.printCoins();

    }
}
