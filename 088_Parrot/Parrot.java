import java.util.Scanner;
public class Parrot{
    String endPhrase = "STOP";//this phrase will stop the prgram
    public static void main(String[] args){
        Parrot p = new Parrot();
        p.talkingParrot();
    }
    public void talkingParrot()
    {
        System.out.println("Speak Human");//asks question
        Scanner scan = new Scanner(System.in);//makes scanner
        String phrase = scan.nextLine();
        if(phrase.equals(endPhrase))//uses logic
        {
            System.out.println("Fine");
        }
        else{
            System.out.println(phrase);
            talkingParrot();//recusrion
        }
    }

}