
/**
 * Made the objects Rectangle, Lines, and Ellipses
 * then used those objects to make the shapes that 
 * resulted in the snowman being created in the terminal
 *
 * @author Umasathvik Pantham
 * @version 02/13/2021
 */
public class SnowmanViewer
{
     public static void main(String[] args) 
    {
        //Step 1: Draw a rectangle of size 20 x 20 as the hat at position (50, 10)
        Rectangle rectangle1 = new Rectangle(50, 10, 20, 20);
        rectangle1.draw();

        //Step 2: Fill the hat with black (the default color)
        rectangle1.fill();
        
        //Step 3: Draw a line for the hat brim at the bottom of the hat extending 
        //10 pixels further than the hat on each side
        Line line1 = new Line(40, 30, 80, 30);
        line1.draw();
        
        //Step 4: Draw a small circle of diameter 20 at position (50, 30) 
        Ellipse circle1 = new Ellipse(50, 30, 20, 20);
        circle1.draw();
        
        //Step 5: Draw a middle circle of diameter 40 at position (40, 50)
        Ellipse circle2 = new Ellipse(40, 50, 40, 40);
        circle2.draw();
        
        //Step 6: Draw a large circle of diameter 60. You figure out the position for this one
        Ellipse circle3 = new Ellipse(30, 90, 60, 60);
        circle3.draw();
    }
}
