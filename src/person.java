public class Person {
    protected String age;
    protected String name;
    protected int age;
    protected int height;
    protected int stamina;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getStamina() {
        return stamina;
    }

    public Person(String name, int age, int height, int stamina) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = stamina;
    }

    public void run() {
        stamina--;
    }

    public void sleep() {
        stamina += 12;
    }

    public boolean eatBanana() { return age >= 1500; }

    public int getAge() {
        return age;
    }


}
