public class NameData {
    public static void main(String[] args)
    {
        //create thing that holds my name
        NameTransmogrifier myName = new NameTransmogrifier("Charlie");
        //print statements based off of my constructor
        System.out.println(myName.name);
        System.out.println(myName.nameReversed);
        System.out.println(myName.nameUpperCase);
        System.out.println(myName.nameLowerCase);
        System.out.println(myName.nameLength);
        System.out.println(myName.nameFirstLetter);
        System.out.println(myName.nameLastLetter);
        }
}
