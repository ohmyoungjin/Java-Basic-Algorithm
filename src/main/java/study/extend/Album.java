package main.java.study.extend;

public class Album extends Item{
    private String artist;

    private String etc;

    @Override
    public void changeItem(UpdateItemDto updateItemDto) {
        System.out.println("========AlBum==============");
        this.artist = updateItemDto.getArtist();
        this.etc = updateItemDto.getEtc();
    }
}
