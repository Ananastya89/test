package machine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MachineInterface coffeMachine = new MachineInterface();
        System.out.println("Write action (buy, fill, take, remaining, exit) ");
        String action = sc.next();
        while (!action.equals("exit")) {
            switch (action) {
                case "remaining":
                    coffeMachine.printInfo();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeType = sc.next();
                    switch (coffeeType) {
                        case "1":
                            coffeMachine.makeEspresso(1);
                            break;
                        case "2":
                            coffeMachine.makeLatte(1);
                            break;
                        case "3":
                            coffeMachine.makeCappuchino(1);
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    coffeMachine.addWater(sc.nextInt());
                    System.out.println("Write how many ml of milk  you want to add: ");
                    coffeMachine.addMilk(sc.nextInt());
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    coffeMachine.addCoffee(sc.nextInt());
                    System.out.println("Write how many disposable cups of coffee you you want to add: ");
                    coffeMachine.addDispCups(sc.nextInt());
                    break;
                case "take":
                    System.out.printf("I gave you %d$", coffeMachine.takeMoney());
                    break;
            }
            System.out.println("");
            System.out.println("Write action (buy, fill, take, remaining, exit) ");
            action = sc.next();
        }
    }
}
