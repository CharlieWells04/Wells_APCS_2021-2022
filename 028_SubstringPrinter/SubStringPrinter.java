public class SubStringPrinter {
    public static void main(String[] args)
    {
        // store sentence in variable
        String sentence = "The quick brown fox jumped over the lazy dog";

        //store substring variables in variables
        String dog = sentence.substring(41);
        String fox = sentence.substring(16, 19);
        String zy = sentence.substring(38, 40);
        String ox_jum = sentence.substring(17, 23);
        String g = sentence.substring(43);

        //print statements
        System.out.println(dog);
        System.out.println(fox);
        System.out.println(zy);
        System.out.println(ox_jum);
        System.out.println(g);
    }
    
}
