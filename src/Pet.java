import java.util.Random;

public class Pet {
    private int age=generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random=new Random();
        return random.nextInt(10)+1;
    }

    public String getInfo(){
        return "Age: "+ age+
                "\nColor: "+colorEnum+
                "\nShelter name: "+shelter.getName()+
                "\nShelter address: "+shelter.getAddress();
    }
}
