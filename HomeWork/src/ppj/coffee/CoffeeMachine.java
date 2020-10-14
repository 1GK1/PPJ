package ppj.coffee;

public class CoffeeMachine extends Coffee implements Programs {
	
	
    public CoffeeMachine(boolean isOn, String water, String beans) {
        this.isOn = isOn;
        this.water = water;
        this.beans = beans;
    }

    public String getWaterLevel() {
        return water;
    }

    public void setWaterLevel(String water) {
        this.water = water;
    }

    public String getBeansLevel() {
        return beans;
    }

    public void setBeansLevel(String beans) {
        this.beans = beans;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void switchOn() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Turning on...");
        } else {
            System.out.println("You can't switch me on, cause I am already operating...");
        }
    }

    @Override
    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Turning off...");
        } else {
            System.out.println("You can't switch me off, cause I am already off...");
            ;
        }
    }

    @Override
    // water level: empty, half, full
    public void addWater() {
        if (isOn) {
            if (getWaterLevel().equals("full")) {
                System.out.println("You can't add more water. The water container is already full.");
            } else if (getWaterLevel().equals("half")) {
                setWaterLevel("full");
                System.out.println("The water has been added. Current water level is: " + getWaterLevel());
            } else {
                setWaterLevel("half");
                System.out.println("The water has been added. Current water level is: " + getWaterLevel());
            }
        } else {
            System.out.println("You can't add water while the machine is off. First switch it on!");
        }
    }

    @Override
    // beans level: empty, half, full
    public void addBeans() {
        if (isOn) {
            if (getBeansLevel().equals("full")) {
                System.out.println("You can't add more beans. The bean container is already full.");
            } else if (getBeansLevel().equals("half")) {
                setBeansLevel("full");
                System.out.println("The beans have been added. Current bean level is: " + getBeansLevel());
            } else {
                setBeansLevel("half");
                System.out.println("The beans have been added. Current bean level is: " + getBeansLevel());
            }
        } else {
            System.out.println("You can't add beans while the machine is off. First switch it on!");
        }
    }

    @Override
    public void prepareCoffee() {
        if (!isOn) {
            System.out.println("You can't make your coffee while the machine is off. First switch it on!");
        } else if (isOn && !getBeansLevel().equals("empty") && !getWaterLevel().equals("empty")) {
            System.out.println("Preparing coffee. Done!");
        } else {
            System.out.println("I can't prepare your coffee. Check water and bean container.");
        }
    }
}
