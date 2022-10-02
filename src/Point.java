public class Point {
    private int x;
    private int y;

    //constructor
    public Point (int x,int y){
        this.x = x;
        this.y = y;
    }

    //constructor with one parameter
    public Point (int x){
        this.x = x;
        y = x;
    }

    //constructor with no parameter
    public Point (){
        x = 0;
        y=0;
    }

    //getter methods

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //setter methods
    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    //coordinate method

    public String coordinate(){
        return "(" +x + ", " + y + ")";
    }

    //quadrant method

    public String quadrant(){
        if (x>0 && y>0){
            return "I";
        }
        else if (x<0 && y>0){
            return "II";
        }
        else if (x<0 && y<0){
            return "III";
        }
        else if (x == 0 && y == 0){
            return "origin";
        }
        else if (x>0 & y<0){
            return "IV";
        }
        else{
            return "on an axis";
        }
    }
}
