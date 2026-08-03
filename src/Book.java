public class Book {


    String title;
    int episodes;

    Book(String title, int episodes){
        this.title = title;
        this.episodes = episodes;
    }

    String displayInfo(){
        return this.title + " (" + this.episodes + "  Episode)";
    }
}
