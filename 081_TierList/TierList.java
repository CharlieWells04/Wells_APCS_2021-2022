public class TierList{
    public static void main(String[] args)
    {
        String[][] tierList = {//making the tierlist
        {"S", "Band Room"},
        {"A", "Jazz Band Room", "FeildHouse"},
        {"B", "Math Room"},
        {"C", "APCS Dungeon"},
        {"D", "Physics Room"},
        {"F", }
        };
        //printing off the thing
        for (int i = 0; i < tierList.length; i++) { //outer for loop, runs the inner for loop
            for (int j = 0; j < tierList[i].length; j++) { //inner for loop
                System.out.print(tierList[i][j] + " ");//prints out at the specific spot
         }
         System.out.println(); //makes line 
      }
    }
}