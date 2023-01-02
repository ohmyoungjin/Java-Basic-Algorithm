package main.java.study.extend;

public class Movie extends Item{
    private String director;
    private String actor;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public void changeItem(UpdateItemDto updateItemDto) {
        System.out.println("====================Movie================================");
        this.director = updateItemDto.getDirector();
        this.actor = updateItemDto.getArtist();
    }
}
