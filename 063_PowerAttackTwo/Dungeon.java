public class Dungeon {
    public static void main(String[] args)
    {
        /*  Feel free to experiemnet with the stats on the hero and the monster, here is the key for editing the stats
        (Name, health, speed, armor, critchance, strength)
        
        Functionality
        - if armor is higher than strength, all damage reduced by 50%
        - speed detirmmines who attacks first
        - crit chance detirmines how many times out of 100 that criical hits strike(crits do 200% damage)
        - */
        //i know that the formatting under this is bad, but it lines up the stats so tht manipulation is easier
        Hero h = new Hero("Fred", 67, 12, 11, 14, 15);
  Monster m = new Monster("Chad", 45, 13, 7, 33, 12);
    //starting attack sequence
    //declaring speed winner
    if (m.getSpeed() > h.getSpeed())
    {
        System.out.println("The monsters speed is higher, the monster attacks first");
    }
    else if(m.getSpeed() < h.getSpeed())
    {
        System.out.println("The heros speed is higher, so the hero attacks first");
    }
    else
    {
        System.out.println("The opponents have equal speed, and becuase life is tough, the monster attacks first");
    }
    while(m.getHealth() > 0 || h.getHealth() > 0)
    {
        
        //checking speed, whoever has higher speed attacks first
        if (m.getSpeed() >= h.getSpeed())
        {
            int mdam = m.attack();//mobster attack, hero takes damage
            System.out.println("The moster attacks, doing " + mdam + " damage");
            h.takeDamage(mdam);
            if(h.getHealth() <= 0)//if statemnet, checks if dead
            {   h.defeat();
                m.victory();
                break;
            }
            else{
                System.out.println("The hero has " + h.getHealth() + " health remianing");
            }
            int hdam = h.attack();//hero attacks, monster takes damage
            System.out.println("The hero attacks, doing " + hdam + " damage");
            m.takeDamage(hdam);
            if(m.getHealth() <= 0)
            {   m.defeat();
                h.victory();
                break;
            }
            else{
                System.out.println("The monster has " + m.getHealth() + " health remianing");
            }
        }
        //this code executes if the hero has higher speed
        else if(m.getSpeed() < h.getSpeed())
        {
            int hdam = h.attack();//hero attack, monster takes damage
            System.out.println("The hero attacks, doing " + hdam + " damage");
            m.takeDamage(hdam);
            if(m.getHealth() <= 0)//if statemnet, checks if dead
            {   m.defeat();//runs victory and defeat commandes
                h.victory();
                break;
            }
            else{
                System.out.println("The monster has " + m.getHealth() + " health remianing");
            }
            int mdam = m.attack();//monster attacks, hero takes damage
            System.out.println("The monster attacks, doing " + mdam + " damage");
            h.takeDamage(mdam);
            if(h.getHealth() <= 0)
            {   h.defeat();
                m.victory();
                break;
            }
            else{
                System.out.println("The hero has " + h.getHealth() + " health remianing");
            }
        }
    }
    }
}


/*
-I love that your monster is a Chad.

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/