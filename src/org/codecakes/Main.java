package org.codecakes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Hello Future", "Nct Dream");
        album.addSong("Rocket", 3.29);
        album.addSong("Diggity", 3.31);
        album.addSong("Life is Still Going On", 3.29);
        album.addSong("Hot Sauce", 2.54);
        album.addSong("Bungee", 2.53);
        albums.add(album);

        album = new Album("Freeze", "TXT");
        album.addSong("Anti-Romantic", 4.23);
        album.addSong("Lovesong", 4.12);
        album.addSong("Magic", 3.45);
        album.addSong("No Rules", 4.52);
        album.addSong("Frost", 3.23);
        album.addSong("Dear Sputnik", 4.95);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Rocket", playList);
    }
}
