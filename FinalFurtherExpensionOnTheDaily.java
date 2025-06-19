import java.util.Scanner;

public class FinalFurtherExpansionOnTheDaily {
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the day excluding Weekend (Monday - Friday only!");
        specials = input.next();


        String coffee = "";
        double price = 0;
        int amount2;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println(" Please enter a weekday, not weekend!");
            specials = input.next();

            for (amount2 = 10; amount2 >= 10; )
                System.out.println("a biger group discount! your price is " + price + "you have ordered" + amount2 + coffee + "but will be only charged " + amount2 +);



        }

        switch (specials) {

            case "Monday":
                coffee = "latte";
                price = 2.95;

                break;


            case "Tuesday":
                coffee = "Frapp";
                price = 3.95;

                break;

            case "Wednesday":
                coffee = "cappuccino";
                price = 4.95;

                break;

            case "Thursday":
                coffee = "regular joe";
                price = 5.95;

                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;

                break;
        }

            int amount;
            int amount2;
            double totalePrice;


            System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
            System.out.println("How many " + coffee + "'s would you like to order?");
            amount = input.nextInt();
            totalePrice = amount * price;
            if (amount == 0) {
                System.out.println("look like you dont like you dont like " + coffee + "S ! so sad!!!!!");
            } else if (amount >= 1 && amount <= 3) {
                System.out.println(" looks like you like " + coffee + "'s!");
            } else {
                System.out.println("You have ordered " + amount + " " + coffee + " at " + price + " which will total");
                System.out.printf("$%.2f", totalePrice);
                System.out.println(" dollars");
            }
        }

    }
