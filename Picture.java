/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K?lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle campo;
    private Person persona;
    private Square fondo;
    private Square bus1;
    private Square bus2;
    private Square bus3;
    private Square ventanilla;
    private Circle rueda1;
    private Circle rueda2;
    private Person persona2;
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
        campo = new Circle();
        campo.makeVisible();
        campo.changeColor("green");
        campo.changeSize(1000);
        campo.moveHorizontal(-500);
        campo.moveVertical(150);
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(100);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            campo.changeColor("green");
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * Hace aparecer una persona por la izquierda que se mueve hasta el centro
     */
    public void walkPerson()
    {
        if (wall != null)   // only if it's painted already...
        {
           persona = new Person();
           persona.moveHorizontal(-270);
           persona.moveVertical(65);
           persona.makeVisible();
           persona.slowMoveHorizontal(200);  
        }
    }
    /**
     * Dibuja un "autobus"
     */
    public void drawBus()
    {
        if (wall != null)   // only if it's painted already...
        {
          persona2 = new Person();
          persona2.moveHorizontal(-150);
          persona2.moveVertical(35);
          persona2.makeVisible();
          
          bus1 = new Square();
          bus1.changeColor("yellow");
          bus1.changeSize(75);
          bus1.moveHorizontal(-295);
          bus1.moveVertical(75);
          bus1.makeVisible();
          
          bus2 = new Square();
          bus2.changeColor("yellow");
          bus2.changeSize(75);
          bus2.moveHorizontal(-220);
          bus2.moveVertical(75);
          bus2.makeVisible();
          
          bus3 = new Square();
          bus3.changeColor("yellow");
          bus3.changeSize(30);
          bus3.moveHorizontal(-305);
          bus3.moveVertical(120);
          bus3.makeVisible();
          
          ventanilla = new Square();
          ventanilla.changeColor("blue");
          ventanilla.changeSize(25);
          ventanilla.moveHorizontal(-285);
          ventanilla.moveVertical(85);
          ventanilla.makeVisible();
          
          rueda1 = new Circle();
          rueda1.changeColor("black");
          rueda1.changeSize(35);
          rueda1.moveHorizontal(-200);
          rueda1.moveVertical(160);
          rueda1.makeVisible();
          
          rueda2 = new Circle();
          rueda2.changeColor("black");
          rueda2.changeSize(35);
          rueda2.moveHorizontal(-120);
          rueda2.moveVertical(160);
          rueda2.makeVisible();
          
        }
    }
    /**
     * Hace aparecer una persona saliendo del autobus
     */
    public void walkPersonBus()
    {
        if (bus1 != null)   // only if it's painted already...
        {         
           persona2.slowMoveHorizontal(120);  
        }
    }
}
