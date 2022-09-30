public class RectangleRunner {
    public static void main(String[] args){
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        int length1 = plot1.getLength();
        int width1 = plot1.getWidth();
        int area1 = plot1.calculateArea();

        System.out.println("Plot 1 length: " + length1);
        System.out.println("Plot 1 width: " + width1);
        System.out.println("Plot 1 area: " + area1);
        System.out.println();

        int length2 = plot2.getLength();
        int width2 = plot2.getWidth();
        int area2 = plot2.calculateArea();

        System.out.println("Plot 2 length: " + length2);
        System.out.println("Plot 2 width: " + width2);
        System.out.println("Plot 2 area: " + area2);
        System.out.println();

        int length3 = plot3.getLength();
        int width3 = plot3.getWidth();
        int area3 = plot3.calculateArea();

        System.out.println("Plot 3 length: " + length3);
        System.out.println("Plot 3 width: " + width3);
        System.out.println("Plot 3 area: " + area3);
        System.out.println();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot3.setWidth(75);
        plot2.setLength(75);

        width3 = plot3.getWidth();
        width2 = plot2.getWidth();
        width1 = plot1.getWidth();
        length2 = plot2.getLength();

        area1 = plot1.calculateArea();
        area2 = plot2.calculateArea();
        area3 = plot3.calculateArea();

        int totalArea = (int)area1 + (int)area2 + (int)area3;

        System.out.println("These three plots requires " + totalArea + " square feet of seed.");
    }

}
