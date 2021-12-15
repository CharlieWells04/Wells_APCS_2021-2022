public class Hands {
    public static void main(String[] args)
    {
        //setting up cables
        ChargingCable cable1 = new ChargingCable();
        cable1.cableInfo("Amazon Basics", 22, "Lightning");//brand, length, type
        ChargingCable cable2 = new ChargingCable();
        cable2.cableInfo("Off-brand", 6, "USC-C");//brand, length, type
        ChargingCable cable3 = new ChargingCable();
        cable1.cableInfo("Apple", 10, "Lightning");//brand, length, type
    }
    
}
