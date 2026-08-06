public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You Start the " + this.type + " engine");
    }

}
