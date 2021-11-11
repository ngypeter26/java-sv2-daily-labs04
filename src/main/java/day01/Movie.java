package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String name;
    private int publishYear;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }
    public void addActor(Actor actor){
        actors.add(actor);
    }
    public int actorsInTheirTwenties(){
        int numberOfActors=0;
        int actorsAge;
        for (Actor i : actors){
            actorsAge = publishYear - i.getBirthyear();
            if (actorsAge > 20 && actorsAge < 30 ){
                numberOfActors++;
            }
        }
        return numberOfActors;
    }
}
