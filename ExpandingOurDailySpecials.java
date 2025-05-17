import java.util.Scanner;

public class ExpandingOurDailySpecials

    { enum Totalling { COFFEE, PRICE}

    public static void main(String[] args){


        String specials;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the day excluding Weekend (Monday - Friday only!");
         specials = input.next();


        String coffee;
        double price;


        boolean saturday = specials.equals( "Saturday");
        boolean sunday = specials.equals("Sunday");

        if( saturday || sunday) {
            System.out.println(" Please enter a weekday, not weekend!");
            specials = input.next();
        }



        switch (specials) {

            case "Monday":
                coffee = "latte";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                specials = input.next();
                System.out.println("Looks like you dont like " +coffee+ "s! so sad!!!");

                break;



            case "Tuesday":
                coffee = "Frapp";
                price = 3.95;

//                int count;
//                for ( count = price * )


                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                System.out.println("How many " +coffee+ "s would you like to order?");
                specials = input.next();
                System.out.println("13 " +coffee+ "s has been ordered totaled" );
                System.out.println("64.35 dollars");
                break;

            case "Wednesday":
                coffee = "cappuccino";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                System.out.println();
                break;

            case "Thursday":
                coffee = "regular joe";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                System.out.println();
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                System.out.println();

                break;
        }

//
//                if (price >=0) {
//                    System.out.println("looks like you dont"+specials+"so sad!!");
//                }else{
//                    System.out.println();
//                }
        }
    }

