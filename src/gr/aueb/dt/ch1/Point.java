package gr.aueb.dt.ch1;

/**
 * Java Bean POJO class
 * Data class
 */

public class Point {
   private int x;
   private int y;

   // Default constructor = parameterless constructor

    public Point (){
        this.x = 0;
        this.y = 0;
    }
    // Overloaded constructor
    public Point(int x, int y){
        this.x = 0;
        this.y = 0;
    }

    //getter
    public int getX() {
        return x;
    }

    //setter
    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
