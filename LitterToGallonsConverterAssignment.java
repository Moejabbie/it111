public class LitterToGallonsConverterAssignment {

    public static void main(String[] args) {

        double liters = 3.79;
        double gallons = liters * 0.264172;

        for (liters = 1; liters <= 100; liters = liters + 4) {
            gallons = liters * 0.264172;


            System.out.printf("%.2f liters = %.2f galons%n", liters,gallons);


        }


        }

    }



