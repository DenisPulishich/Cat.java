package model;


public class Kotik {
    private Double originWeight;
    private Double weight;
    private String name;
    private String Meow;
    //Сытость котика
    private double catSatiety;

    private final Double MIN_WEIGHT = 1000.0;
    ;
    private final Double MAX_WEIGHT = 9000.0;
    ;
    // Счет созданных котов
    private static int count;


    public Kotik() {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catSatiety = 10.0 + 20.0 * Math.random();

    }

    public Kotik(String name, Double weight, Double catSatiety, String Meow) {
        count++;
        this.name = name;
        this.weight = weight;
        this.catSatiety = catSatiety;
        this.Meow = Meow;
    }

    public void setKotik(int prettiness, String name, Double weight, String Meow) {
        this.weight = weight;
        this.Meow = Meow;
    }


    public double getCatSatiety() {
        return catSatiety;
    }

    public boolean meow() {
        if (catSatiety > 0) {
            weight = weight - 1;
            System.out.println("Meow");
            return true;
        } else {
            System.out.println("Сначала покорми");
            return false;
        }
    }

    // Три метода eat
    public void eat(Double amount) {
        catSatiety = catSatiety + amount;
        System.out.println("Cat eating");
    }

    public void eat(Double amount, String foodName) {
        catSatiety = catSatiety + amount;
        System.out.println("Cat eating " + foodName);
    }

    public void eat() {
        eat();
    }

    public boolean drink(Double amount) {
        if (catSatiety > 0) {
            weight = weight + amount;
            System.out.println("Cat drinking");
            return true;
        } else {
            System.out.println("Сначала покорми");
            return false;
        }
    }

    public boolean play() {
        if (catSatiety > 0) {
            System.out.println("Cat playing");
            return true;
        } else {
            System.out.println("Сначла покорми");
            return false;
        }
    }


    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return Meow;
    }


    public double amountOfFoodEaten() {
        double result = weight - originWeight;
        return result;
    }

    public boolean pee() {
        if (catSatiety > 0) {
            weight = weight - 5;
            System.out.println("Hozyin, davai ubirai");
            return true;
        } else {
            System.out.println("Сначала покорми");
            return false;
        }
    }

    public static int getCount() {
        return count;
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            int r = (int) (Math.random() * 5);
            switch (r) {
                case 0:
                    eat(10.0);
                    break;
                case 1:
                    if (catSatiety <= 0) {
                        System.out.println("Сначала покорми");
                        eat(10.0);
                    } else {
                        drink(10.0);
                    }
                    break;
                case 2:
                    if (catSatiety <= 0) {
                        System.out.println("Сначала покорми");
                        eat(10.0);
                    } else {
                        pee();
                    }
                    break;
                case 3:
                    if (catSatiety <= 0) {
                        System.out.println("Сначала покорми");
                        eat(10.0);
                    } else {
                        play();
                    }
                    break;
                case 4:
                    if (catSatiety <= 0) {
                        System.out.println("Сначала покорми");
                        eat(10.0);
                    } else {
                        meow();
                    }
                    break;
            }

        }
    }

}