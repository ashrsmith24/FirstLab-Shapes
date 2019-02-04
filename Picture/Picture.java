
       
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
private Square door;
    private Square house;
    private Triangle roof;
    private Circle window;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        

        house = new Square();
        house.changeColor("red");
        house.changeSize(145);
        house.moveHorizontal(60);
        house.moveVertical(90);
        house.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(50, 200);
        roof.moveHorizontal(130);
        roof.moveVertical(55);
        roof.makeVisible();
        
       door = new Square();
       door.changeColor("black");
       door.changeSize(45);
       door.moveHorizontal(120);
       door.moveVertical(190);
       door.makeVisible();
        

        window = new Circle();
        window.changeColor("blue");
        window.moveHorizontal(80);
        window.moveVertical(120);
        window.changeSize(30);
        window.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            window.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            window.changeColor("yellow");
        }
    }

}