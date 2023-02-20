package oop;

public class Test{
    public static void main(String[] args) {
        Dog frenchie = new Dog();
        Address dogAddress = new Address();
        dogAddress.setCity("Sofia");
        dogAddress.setPostalcode(1000);
        dogAddress.setStreetname("Alexander Stambolov");
        frenchie.setAge(2);
        Breed frBulldog = new Breed("French Bulldog");
        frenchie.setBreed(new Breed("French Bulldog")); //calling a method with parameter
        frenchie.setBreed(frBulldog);
        //which is a new object of type Breed
        frenchie.setName("Spike");
        frenchie.setHasTail(false);
        frenchie.printData();


        Parrot parrot = new Parrot();
        Address parrotAddress = new Address();
        parrotAddress.setCity("Asenovgrad");
        parrotAddress.setPostalcode(4230);
        parrotAddress.setStreetname("Han Krum");
        parrot.setAge(2);
        parrot.setBreed(new Breed("Cocoduluty"));
        parrot.setName("Polly");
        parrot.setHasTail(true);
        parrot.printData();


        Breed Cocoduluty = new Breed("Cocoduluty");
        Breed small = new Breed("Small");
        System.out.println(parrot.isExpensive(Cocoduluty));
        System.out.println(parrot.isExpensive(small));

        if (parrot.isExpensive(Cocoduluty)) {
            System.out.println(" You can't afford that");
        }else{
            System.out.println(" You can afford that"); 
        }


        frenchie.run();
        parrot.run();
    }
}
