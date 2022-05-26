public class FatorialRecursion{
    public static void main(String[] args){
        FatorialRecursion f = new FatorialRecursion();
        System.out.println(f.factorialize(6, 6));//runs methods
        System.out.println(f.factorialize(10, 10));
        System.out.println(f.factorialize(88, 88));
    }
    public int factorialize(int num, int counter)
    {
        if(counter > 1)  //makes sure doesnt end up multiplying by 0
        {  
            num = num * (counter - 1);//multiplies, di=oing factorial thing
            counter--;
            return factorialize(num, counter);//returns and recurses
        }   
        else{
            return num;//sends final result
        }
    }
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/