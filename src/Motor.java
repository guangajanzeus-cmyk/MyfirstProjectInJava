public class Motor {

    String model;
    String color;


    Motor(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the car " + color + " " + model);
    }

}
