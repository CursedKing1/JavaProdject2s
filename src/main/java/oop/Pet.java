package oop;

public class Pet implements PetActions {
    // Todo note that variables are private but methods/getters and setters are public
    private boolean hasTail;
    private String name;
    private int age;
    private Breed breed; //Composition is closely connected with
    private String barcode;
    private Address address; //Aggregation address human or dog can have it

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid data");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)) {
            this.breed = breed;
        } else {
            System.out.println("Invalid data");
        }
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void printData() {
        System.out.printf(("\n") +"This dog age is: %d.%n This dog breed is: %s.%n This dog name is: %s.%n",age,breed,name );
        if (hasTail) {
            System.out.println("This dog has tail");
        } else {
            System.out.println("This dog haven't got a tail");

        }
    }

    @Override
    public void run() {
        System.out.println(name + " is running....");
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping.....");

    }
}