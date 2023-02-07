package data.types;

public class Variables {
    public static void main(String[] args)
    { byte age = 121;
        char someRandomChar = 'g';
        Doggy myDog = new Doggy();
        myDog.setName("Patric");
        myDog.setAge((byte) 1);
        myDog.setBreed("French Bulldog");

        System.out.println("My dog name is:"+ myDog.getName());
        System.out.println("My dog age is:"+ myDog.getAge());
        System.out.println("My first dog breed is:"+ myDog.getBreed());
        Doggy myDog2 = new Doggy();
        myDog2.setName ("Rexi");
        myDog2.setAge((byte) 5);
        myDog2.setBreed("German Sheppard");
        System.out.println("My dog name is:"+ myDog2.getName());
        System.out.println("My dog age is:"+ myDog2.getAge());


        System.out.println("My first dog breed is:"+ myDog2.getBreed());
    }
}
