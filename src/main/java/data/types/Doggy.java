package data.types;

public class Doggy {
    private String name;
    private byte age;
    private static String breed;

    public static final String TAIL= "short";

    public String getBreed(){
        return breed;
    }
    public void setBreed (String breed){
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void barf(){
        String dogAction = "Bau Bau...";
        System.out.println( "The dog named: " + name + "and age: " +age +"" + dogAction);
    }

}
