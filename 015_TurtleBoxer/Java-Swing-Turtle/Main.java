import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //world and turtle creating
    World world = new World(220,220);
    Turtle yertle = new Turtle(world);

    //start drawing, start by moving to center, and putting pen down
    yertle.moveTo(110,110);
    yertle.penDown();
    //box 1 (topright box)
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    // ends up facing west, start of box 2 (top left box)
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    //ends up facing south, start of box 3 (bottom left box)
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    //ends up facing east, start of box 4 (bottom left box)
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    yertle.turnRight();
    yertle.forward();

    //set world show to true
    world.show(true);

   //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
