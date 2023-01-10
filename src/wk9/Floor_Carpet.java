package wk9;
//import java.util.Scanner;
public class Floor_Carpet {
    public double width, length;

    public Floor_Carpet(double width, double length) {

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }

    public static class Carpet {
        public double cost;

        public Carpet(double cost) {
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }

        public double getCost() {
            return cost;
        }
    }
    public static class Calculator {
        public Floor_Carpet floor;
        public Carpet carpet;

        public Calculator(Floor_Carpet floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }
        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3.5);
        Floor_Carpet floor1 = new Floor_Carpet(2.75, 4.0);
        Calculator calculator = new Calculator(floor1, carpet1);
        System.out.println("total= " + calculator.getTotalCost());
        carpet1 = new Carpet(1.5);
        floor1 = new Floor_Carpet(5.4, 4.5);
        calculator = new Calculator(floor1, carpet1);
        System.out.println("total= " + calculator.getTotalCost());
    }
}

