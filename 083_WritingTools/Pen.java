public class Pen extends WritingTool{//extends goes into the class syntax
    boolean isClicky;
    public static void main(String[] args){}
    public Pen()
    {
        isClicky = true;///making default constructor
    }
    public Pen(boolean isClicky)
    {
        this.isClicky = isClicky;
    }
    public void Click()
    {
        if(isClicky == true)//if statement, checks if pen is clicky, prints off appropriate statemnet
        {
            System.out.println("Click Click");
        }
        else
        {
            System.out.println("not happening");
        }
    }
}