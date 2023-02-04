 class Circle {
        private double radius = 1.0;

        public Circle() {

        }

        public Circle(double radius) {

        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle radius = " + radius +
                    "\nArea = " + getArea() +
                    "\nCircumference = " + getCircumference();
        }


} public class Main {

     public static void main(String[] args) {
         Circle circle = new Circle();
         System.out.println(circle.toString());

     }
 }
