package machine;
public class MachineInterface {
    private int water;
    private int milk;
    private int coffee;
    private int dispCups;
    private int money;

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

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getDispCups() {
        return dispCups;
    }

    public void setDispCups(int dispCups) {
        this.dispCups = dispCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
