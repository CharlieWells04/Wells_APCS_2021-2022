public class SweetGarage {
    public static void main(String[] args)
    {
        //The cars and their specs
        Car car1 = new Car(2018, 32000, "Ford", "F150", false);
        Car car2 = new Car(2021, 6, "Honda", "Civic", false);
        Car car3 = new Car(2004, 123213, "Toyota", "Camari", true);
        Car car4 = new Car(2068, 4000, "Telsa", "Huvverkraft", true);
        Car car5 = new Car(308, 736, "Thouroughbred", "Horse", true);

        // Print Descriptions, describe cars
        System.out.println("My First car is a " + car1.year + " " + car1.manufacturerName + " " + car1.modelName + " and its has " + car1.milesDriven + " miles on it");
        System.out.println("My Second car is a " + car2.year + " " + car2.manufacturerName + " " + car2.modelName + " and its has " + car2.milesDriven + " miles on it");
        System.out.println("My Third car is a " + car3.year + " " + car3.manufacturerName + " " + car3.modelName + " and its has " + car3.milesDriven + " miles on it");
        System.out.println("My Fourth car is a " + car4.year + " " + car4.manufacturerName + " " + car4.modelName + " and its has " + car4.milesDriven + " miles on it");
        System.out.println("My Fifth car is a " + car5.year + " " + car5.manufacturerName + " " + car5.modelName + " and its has " + car5.milesDriven + " miles on it");

        //Rev engine and turbo print statements
        car5.revEngine();
        car5.engageTurbo();


    }
    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/