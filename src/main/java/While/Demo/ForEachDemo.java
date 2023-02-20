package While.Demo;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {4 , 9 ,16 ,20 ,6};
        String [] cities = {"Sofia","Plovdiv", "Burgas", "Varna"};

        // in for each construction we don't need to type for - each the conception is
        // for (int where : what)

        for(int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n"+"------------------"+"\n");

        for(String city : cities) {
            System.out.println(city);
        }

        System.out.println("\n"+"------------------"+"\n");
        for (int i=0; i< cities.length; i++) {
            System.out.println(cities [i] );

        }
    }
}
