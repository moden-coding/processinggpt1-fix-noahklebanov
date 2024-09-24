import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        size(800, 600);  // Sets window to 800x600
    }
    // This method runs once when the program starts
    public void setup() {
        background(200);  // Light gray background (RGB: 200, 200, 200)
        
        fill(255,0,0);// gives rectangle a red fill
        rect(400,200,100,200);//creates rectange with position (400,200) and dimentions 100x200. make sure the rectangle comes after the background or else the background will be made on top of the rectangle.
        
        fill(0,0,255);//makes elipse blue
        stroke(255,0,0); //outline color(red)
        strokeWeight(5); //sets thickness of the outline
        noStroke(); //gives the elipse no outline
        ellipse(350, 300, 100, 200); // makes an elipse with position (350,200) and width of 100 height of 200

        stroke(0); //color black
        strokeWeight(2); //line thickness 1 pixel
        line(400,200,500,400); //makes a line

        fill(0,255,0);
        noStroke();
        triangle(400,27,500,200,300,200);
    }

    // This method continually draws frames (optional for now)
    public void draw() {
        
        // Drawing code goes here
    }

    


}
