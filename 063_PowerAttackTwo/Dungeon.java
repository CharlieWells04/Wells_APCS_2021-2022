public class Dungeon {
    public static void main(String[] args)
    {
        Hero h= new Hero("Fred", 22, 10, 11, 14, 15);
        Monster m = new Monster("Chad", 25, 12, 4, 33, 10);
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
            if(h.getHealth() <= 0)
            //add defeat
            //add victory
            //break loop
            int hdam = h.attack();//hero attacks, monster takes damage
            m.takeDamage(hdam);
        }
        else if(m.getSpeed() < h.getSpeed())
        {
            int hdam = h.attack();
            m.takeDamage(hdam);
            int mdam = m.attack();
            m.takeDamage(mdam);
        }
    }
    }
    
    
}
