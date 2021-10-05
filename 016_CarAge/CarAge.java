public class CarAge {
    public static void main(String[] args)
    {
        //The cars and their specs
        Car car1 = new Car(2018, 32000, "Ford", "F150", false);
        Car car2 = new Car(2021, 6, "Honda", "Civic", false);
        Car car3 = new Car(2004, 123213, "Toyota", "Camari", true);
        Car car4 = new Car(2068, 4000, "Telsa", "Huvverkraft", true);
        Car car5 = new Car(308, 736, "Thouroughbred", "Horse", true);

        // Current year variable
        int currentYear = 2021;

        //call calculator
        ReturningCalculator calc = new ReturningCalculator();

        //variables for car ages
        int car1Age = calc.integerSubtractor(currentYear, car1.year);
        int car2Age = calc.integerSubtractor(currentYear, car2.year);
        int car3Age = calc.integerSubtractor(currentYear, car3.year);
        int car4Age = calc.integerSubtractor(currentYear, car4.year);
        int car5Age = calc.integerSubtractor(currentYear, car5.year);

        //print statements for cars
        System.out.println("Car 1 is " + car1Age + " years old");
        System.out.println("Car 2 is " + car2Age + " years old");
        System.out.println("Car 3 is " + car3Age + " years old");
        System.out.println("Car 4 is " + car4Age + " years old");
        System.out.println("Car 5 is " + car5Age + " years old");

        //

    }    
}
