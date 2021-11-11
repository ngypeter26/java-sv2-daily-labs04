package day01;

public class MovieMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Hugh Grant",1980);
        Actor actor2 = new Actor("Hugh Grant2",1985);
        Actor actor3 = new Actor("Hugh Grant3",1970);
        Actor actor4 = new Actor("Hugh Grant4",1992);
        Actor actor5 = new Actor("",1987);

        Movie movie = new Movie("Karácsony",2012);

        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        movie.addActor(actor4);
        movie.addActor(actor5);

        System.out.println(movie.actorsInTheirTwenties());

    }
}
