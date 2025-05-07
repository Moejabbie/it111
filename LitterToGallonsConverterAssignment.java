public class LitterToGallonsConverterAssignment {

    public static void main(String[] args) {

        double liters, gallons;
        int counter = 0;
        for (liters = 1; liters <= 100; liters = liters + 4) {
            gallons = liters * 0.264172;

            if (liters == 1) {
                System.out.printf("%.2f liter = %.2f galons%n", liters, gallons);
            } else {
                System.out.printf("%.2f liters = %.2f galons%n", liters, gallons);
            }



            counter ++;
            if (counter == 5) {
                System.out.println();
                counter = 0;

            }

            }
        System.out.println(" We are done!!!");
        counter = 0;
        }
    }






