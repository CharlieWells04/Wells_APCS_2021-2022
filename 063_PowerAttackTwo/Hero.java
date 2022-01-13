public class Hero {
    //class variables for hero
    private String name;
    private int health;
    private int speed;
    private int armor;
    private int strength;
    private int critChance;
    //creaing constructor
    public Hero(String name, int health, int speed, int armor, int critChance, int strength)
    {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.armor = armor;
        this.critChance = critChance;
        this.strength = strength;
    }
    //creating getters, reutrn stuff
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getArmor()
    {
        return armor;
    }
    public int getCritChance()
    {
        return critChance;
    }
    //creating setters
    public void takeDamage(int amount)
    {if(armor > amount)
        {
            health = health - (amount/2);
        }
        else{
            health = health - amount;
        }
    }
    //creating attack method
    public int attack()
    {
        int damageDone = strength;
        int rando = (int)(Math.random() * 100);
        if (rando <= critChance)
        {
            damageDone = damageDone * 2;
        }
        return damageDone;

    }
    //victory and defeat methods
    public void defeat()
    {
        System.out.println("The hero dies, oh no");
    }
    public void victory()
    {
        System.out.println("The hero wins, cheer!!!");
    }
    //empty main method
    public static void main(String[] args)
    {
        //empty
    } 
}
    

