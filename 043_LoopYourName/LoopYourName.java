public class LoopYourName {
    public static void main(String[] args){
        //variable to contain name
        String myName = "Charlie";
        //for loop
        for(int i = 0; i < myName.length(); i++)
        {
            System.out.println(myName.substring(i, i +1));
        }
    }
    
}
