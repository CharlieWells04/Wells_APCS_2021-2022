public class Pencil extends WritingTool{//extend in the class syntax
    boolean isSharp;
    public static void main(String[] args){}
    public Pencil()
    {
        isSharp = true;
    }
    public Pencil(boolean isSharp)
    {
        this.isSharp = isSharp;
    }
    public void Sharpen()
    {
        if(isSharp == true)
        {
            System.out.println("Your pencil is already sharp");
        }
        else
        {
            System.out.println("BZZZZZZZZZZZ");
            isSharp = true;
        }
    }
}