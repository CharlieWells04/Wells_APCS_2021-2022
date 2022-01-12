public class Monster {
    private String name;
    private int health;
    private int speed;
    private int armor;
    private int critChance;
    //creaing constructor
    public Monster(String name, int health, int speed, int armor, int critChance)
    {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.armor = armor;
        this.critChance = critChance;
    }
    //creating getters
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
    {
        if(armor > amount)
        {
            health = health - (amount/2);
        }
        else{
            health = health - amount;
        }
    }

    //empty main method
    public static void main(String[] args)
    {
        //empty
    }
}
