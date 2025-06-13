package package_person_homework;

public class Person {


    String name;

    char gender;

    int age;

    String car;

    int carYear;

    boolean violations;

    int creditScore;

    public void display() {
        System.out.println("Customer name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("CarName:" + car);
        System.out.println("carYear: " + carYear);
        System.out.println("Violations:" + violations);
        System.out.println("CreditScore:" + creditScore);



    }


    public double getRate(double monthlyRate){
        if(violations == true && creditScore <=700){
            monthlyRate = 500.00;

        }else{
            monthlyRate = 100.00;


        }
        return  monthlyRate;

    }

    public  double assumeGender (double adjustedRate){
        if(gender =='M' && age <=25 && carYear >=2015){
            adjustedRate = 100;
        }else{
            adjustedRate =0;

        }

        return adjustedRate;
    }

    public int getCarYear(int adjustedRate2) {
        if (violations == true && creditScore <= 700 && carYear >= 2015){
            adjustedRate2 =200;

        }else {
            adjustedRate2 =0;

        }
        return adjustedRate2;
    }
}
