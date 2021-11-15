public class PowerAttack {
    public static void main(String[] args)
    {
        //declare nessicary numbers
        int randoStrength = 0;
        int baseStrength = 3;
        int monsterHealth = 13;
        int finalStrength = 0;
        int damage = 0;
        while(monsterHealth > 0)//while loop,repeates until monster is dead
        {
            randoStrength = (int)(Math.random() * 10 + 1);
            finalStrength = randoStrength + baseStrength;
            if(finalStrength >= 11)//success role
            {
                damage = (int)(Math.random() * 3 + 4);
                monsterHealth = monsterHealth - damage;
                System.out.println("The attack was successful, you did " + damage + " damage, the monster has " + monsterHealth + " health left");
            }
            else
            {
                System.out.println("The attack failed, the monster has " + monsterHealth + " health left");
            }
        }
        System.out.println("The monster has been slain!, good luck on further ventures");//final print statement
    }   
}
