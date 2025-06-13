package package_person_homework;


public class PersonDetails {

    public static void main(String[] args){

        Person firstPerson;
       Person secondPerson;
        Person thirdPerson;

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        firstPerson.name="Cathy";
        firstPerson.gender='F';
        firstPerson.age= 33;
        firstPerson.car= "Volkswagen Bug";
        firstPerson.carYear= 2025;
        firstPerson.violations= false;
        firstPerson.creditScore= 700;

        secondPerson.name="Kendall";
        secondPerson.gender='M';
        secondPerson.age= 22;
        secondPerson.car= "Mustang";
        secondPerson.carYear= 2011;
        secondPerson.violations= true;
        secondPerson.creditScore= 670;

        thirdPerson.name="Arial";
        thirdPerson.gender='F';
        thirdPerson.age= 54;
        thirdPerson.car= "Lexus";
        thirdPerson.carYear=2025;
        thirdPerson.violations= true;
        thirdPerson.creditScore= 600;

        double  monthlyRate = 0;
        double adjustedRate= 0;
        int adjustedRate2 = 0;






        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " + firstPerson.getRate
                (monthlyRate)+ "dollars");
        System.out.println("adjustments:" +firstPerson.assumeGender(adjustedRate) + "dollars");
        System.out.print("Here is " + firstPerson.name + "'s  total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.getCarYear(adjustedRate2));

        System.out.println();


        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " + secondPerson.getRate
                (monthlyRate)+ "dollars");
        System.out.println("adjustments:" +secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " + secondPerson.name+ "'s  total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.getCarYear(adjustedRate2));
        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": " + thirdPerson.getRate
                (monthlyRate)+ "dollars");
        System.out.println("adjustments:" +thirdPerson.assumeGender(adjustedRate) + "dollars");
        System.out.print("Here is " + thirdPerson.name+ "'s  total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate) + secondPerson.getCarYear(adjustedRate2));


    }
}
