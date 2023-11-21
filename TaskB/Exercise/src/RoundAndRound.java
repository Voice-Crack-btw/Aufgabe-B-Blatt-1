public class RoundAndRound {
    public static void main(String[] args) {
        double pi = 3.1415926535;
        Circle circle1 = new Circle();
        circle1.radius = 5.1;
        circle1.diameter = circle1.radius*2;
        circle1.circumference = circle1.diameter*pi;
        circle1.area = circle1.radius*circle1.radius*pi;
        // calculate the remaining attributes for circle1 here

        Circle circle2 = new Circle();
        circle2.radius = 17.5;
        circle2.diameter = circle2.radius*2;
        circle2.circumference = circle2.diameter*pi;
        circle2.area = circle2.radius*circle2.radius*pi;
        // calculate the remaining attributes for circle2 here

        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle1.diameter = " + circle1.diameter);
        System.out.println("circle1.circumference = " + circle1.circumference);
        System.out.println("circle1.area = " + circle1.area);
        System.out.println("circle2.radius = " + circle2.radius);
        System.out.println("circle2.diameter = " + circle2.diameter);
        System.out.println("circle2.circumfernece = " + circle2.circumference);
        System.out.println("circle2.area = " + circle2.area);
        // add more output-commands here
    }
}