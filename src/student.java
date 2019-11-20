public class student extends Person {
    private string classGroup;
    public student(String name, int age, int height, int stamina, String string classGroup)
        super(name,age,height,stamina);
        this.classGroup = classGroup;
    }

    @Override
    public String toString() {
        return "student{" +
                "classGroup=" + classGroup +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", stamina=" + stamina +
                '}';
    }

    public void grow(int size)
    {
        height += size;
    }
}
