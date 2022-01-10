package machine;

public class MachineInterface {
    private int water;
    private int milk;
    private int coffee;
    private int dispCups;
    private int money;

    public MachineInterface() {
        water = 400;
        milk = 540;
        coffee = 120;
        money = 550;
        dispCups = 9;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void addWater(int add) {
        water += add;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void addMilk(int add) {
        milk += add;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void addCoffee(int add) {
        coffee += add;
    }

    public int getDispCups() {
        return dispCups;
    }

    public void setDispCups(int dispCups) {
        this.dispCups = dispCups;
    }

    public void addDispCups(int add) {
        dispCups += add;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void makeEspresso(int portions) {
        if (water >= 250 * portions && coffee >= 16 * portions && dispCups >= portions) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250 * portions;
            coffee -= 16 * portions;
            dispCups -= portions;
            money += 4 * portions;
        } else {
            String problem = new String();
            if (water < 250 * portions) {
                problem = "water";
            } else if (coffee < 16 * portions) {
                problem = "coffee";
            } else if (dispCups < portions) {
                problem = "disposable cups";
            }
            System.out.printf("Sorry, not enough %s!", problem);
        }
    }

    public void makeLatte(int portions) {
        if (water >= 350 * portions && milk >= 75 * portions && coffee >= 20 * portions && dispCups >= portions){
            water -= 350 * portions;
            milk -= 75 * portions;
            coffee -= 20 * portions;
            dispCups -= portions;
            money += 7 * portions;
        } else {
            String problem = new String();
            if (water < 350 * portions) {
                problem = "water";
            } else if (milk < 75 * portions) {
                problem = "milk";
            } else if (coffee < 20 * portions) {
                problem = "coffee";
            } else if (dispCups < portions) {
                problem = "disposable cups";
            }
            System.out.printf("Sorry, not enough %s!", problem);
        }
    }

    public void makeCappuchino(int portions) {
        if ( water >= 200 * portions && milk >= 100 * portions && coffee >= 12 * portions && dispCups >= portions){
            water -= 200 * portions;
            milk -= 100 * portions;
            coffee -= 12 * portions;
            dispCups -= portions;
            money += 6 * portions;
        } else {
            String problem = new String();
            if (water < 200 * portions) {
                problem = "water";
            } else if (milk < 100 * portions) {
                problem = "milk";
            } else if (coffee < 12 * portions) {
                problem = "coffee";
            } else if (dispCups < portions) {
                problem = "disposable cups";
            }
            System.out.printf("Sorry, not enough %s!", problem);
        }
    }

    public int takeMoney() {
        int cash = getMoney();
        setMoney(0);
        return cash;
    }

    public void printInfo() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of of coffee beans%n", coffee);
        System.out.printf("%d disposable cups%n", dispCups);
        System.out.printf("$%d of money%n", money);
    }
}