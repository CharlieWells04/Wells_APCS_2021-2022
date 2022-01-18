public class HandsTwo {
    public static void main(String[] args)
    {
        //creating phones
        PhoneTwo p1 = new PhoneTwo();
        PhoneTwo p2 = new PhoneTwo(400);
        PhoneTwo p3 = new PhoneTwo(48, "Lightning", 12, "Blue", 0, 250);
        //using to string methods
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        //using methods
        p1.On();
        p2.Commercial();
        p3.IsItGreen();
        p2.New();
        p1.BrokeCheck();
    }
}
