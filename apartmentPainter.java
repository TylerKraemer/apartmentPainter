/*
Tyler Kraemer
Apartment Painter
Calculates amount of paint and primer needed for apartment being painted
 */

public class apartmentPainter {
    public static void main(String[] args) {
        //givens
        double roomWidth = 25.62;
        double roomLength= 32.75;
        double roomHeight = 10.00;
        double windowHeight = 5.5;
        double windowWidth = 14.4;
        double doorHeight = 8.00;
        double doorWidth = 3.25;
        double paintCoveragePerGallon = 400;
        double primerCoveragePerGallon = 300;
        double paintCost = 34.99;
        double primerCost = 24.49;
        double ceilingWidth = 25.62;
        double ceilingLength = 32.75;

        //calculations
        double shortWallArea = roomWidth * roomHeight;
        double longWallArea = roomLength * roomHeight;
        double windowArea = windowHeight * windowWidth;
        double ceilingArea = ceilingLength * ceilingWidth;
        double doorArea = doorWidth * doorHeight;
        double totalWallArea = longWallArea + shortWallArea - windowArea - doorArea;
        double totalArea = totalWallArea + ceilingArea;
        double totalAreaForEight = totalArea * 8;
        double gallonsOfPaint = Math.ceil(totalAreaForEight / paintCoveragePerGallon);
        double gallonsOfPrimer = Math.ceil(totalAreaForEight / primerCoveragePerGallon);
        double totalCostOfPaint = gallonsOfPaint * paintCost;
        double totalCostOfPrimer = gallonsOfPrimer * primerCost;
        double totalCost = totalCostOfPaint + totalCostOfPrimer;

        //print the results
        System.out.println("*********************************************************");
        System.out.printf("%-25s%10.2f\n", "Wall area per unit", totalWallArea);
        System.out.printf("%-25s%10.2f\n", "Ceiling area per unit", ceilingArea);
        System.out.printf("%-25s%10.2f\n", "Total area to paint and prime", totalAreaForEight);
        System.out.println(" ");
        System.out.println(" You must purchase " + gallonsOfPaint + " gallons of paint for $" + totalCostOfPaint);
        System.out.println(" You must purchase " + gallonsOfPrimer + " gallons of primer for $" + totalCostOfPrimer);
        System.out.println(" ");
        System.out.println("Your total cost to paint and prime all units is $" + totalCost);
        System.out.println("*********************************************************");



    }
}