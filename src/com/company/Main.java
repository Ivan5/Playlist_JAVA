package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Storm","Deep Purple");
        album.addSong("StoremBriger",4.6);
        album.addSong("OtherSong",3.6);
        album.addSong("Yo cant str",7.6);
        album.addSong("The gypsy",3.13);

        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("Whatever",9.44);
        album.addSong("Inject the venom",3.33);
        album.addSong("Evil walks",3.45);
        album.addSong("C.O.D",5.25);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Yo cant str",playList);
        albums.get(0).addToPlayList("Inject the venom",playList);
        albums.get(0).addToPlayList("Speed king",playList);
        albums.get(0).addToPlayList("C.O.D",playList);
        albums.get(0).addToPlayList(5,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
        }
    }
}
