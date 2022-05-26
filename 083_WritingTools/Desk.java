public class Desk{
    public static void main(String args[]){
        Pen pen1 = new Pen();//making the instances
        Pencil pencil1 = new Pencil();
        WritingTool lebron = new WritingTool();
        //found this easier way on google to print instance of
        System.out.print("Is WritingTool an instace of pen?: ");
        System.out.println(lebron instanceof Pen);//the first part is the object made, second is the class
        System.out.print("Is WritingTool an instace of pencil?: ");
        System.out.println(lebron instanceof Pencil);
        System.out.print("Is Pencil an instace of WritingTool?: ");
        System.out.println(pencil1 instanceof WritingTool);
        System.out.print("Is Pen an instace of WritingTool?: ");
        System.out.println(pen1 instanceof WritingTool);
        System.out.print("Is Pencil an instace of Pen?: ");//breaks
        //System.out.println(pencil1 instanceof Pen);these lines of code break, so false
        System.out.print("Is Pen an instace of Pencil?: ");//breaks
        //System.out.println(pen1 instanceof Pencil); breaks
        
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/