public class Car {


    String brand = "Supra";
    String model = "MK4 (A80)";
    int year = 2002;
    double price = 456921.21;
    boolean isRunning = false;

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Car(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is Studying");
    }


    void start(){
        isRunning = true;
        System.out.println("You start the " + model);
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the " + model);
    }

}
