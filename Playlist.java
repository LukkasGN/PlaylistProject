import java.util.Arrays;
import java.util.ArrayList;

/*

Suppose you’re heading to a desert island, cut off from the world, for the next few days. Luckily, you can bring a playlist of your favorite music ♪♪.

Also, this is a chance to put your hard-earned Java skills to the test.

You will build Playlist.java, to store the best possible music playlist using Java Arrays and ArrayList.

You’ll add your favorite songs and use different functions on ArrayList and Arrays to customize the playlist.

Author: Lucas Gabriel Nordio

Date: 19/03/2025

*/

public class Playlist {
    public static void main(String[] args) throws Exception {
        String[] favoriteSongs = {"Endless Taverns - Take a Bow", "Aviators - Armored in Gold", "Aviators - By Grace", "Aviators - Eternal Lullaby", "Aviators - The Final Kingdom", "Aviators - The Serpent That Swallowed The Moon", "Aviators - Imperfected", "On-lyne - The Great Despair", "On-lyne - Party of your Lifetime", "On-lyne - Rotten Lives"};
        for (int i = 0; i < 3; i++) {
            System.out.println(favoriteSongs[i]);
        }

        /*
        Add and Remove Songs
        You have two lists of songs.
        You want to hear your favorite songs if you get stuck on a desert island, right?
        Add all the songs from favoriteSongs to desertIslandPlaylist
        */

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Endless Taverns - Lament Thy Lamenter");
        desertIslandPlaylist.add("Endless Taverns - Embrace the Rot");
        desertIslandPlaylist.add("Endless Taverns - Twist of Fate");
        desertIslandPlaylist.add("Endless Taverns - Bardic Inspiration");
        desertIslandPlaylist.add("Aviators - Liar Liar");

        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        System.out.println(desertIslandPlaylist.size());

        //Yikes! It turns out you can only bring five songs now. You’ll need to make some tough decisions and remove some of the songs from desertIslandPlaylist.

        desertIslandPlaylist.remove("Aviators - Liar Liar");
        desertIslandPlaylist.remove("Aviators - Eternal Lullaby");
        desertIslandPlaylist.remove("Aviators - The Final Kingdom");
        desertIslandPlaylist.remove("Aviators - The Serpent That Swallowed The Moon");
        desertIslandPlaylist.remove("Aviators - Imperfected");

        System.out.println(desertIslandPlaylist);

        /*
        Swap Songs
        The playlist seems a little boring. Let’s change the ArrayList by swapping some of the songs.
        */

        int songA = desertIslandPlaylist.indexOf("Endless Taverns - Lament Thy Lamenter");
        int songB = desertIslandPlaylist.indexOf("Endless Taverns - Embrace the Rot");

        String tempA = "Endless Taverns - Lament Thy Lamenter";
        
        desertIslandPlaylist.set(songA, "Endless Taverns - Embrace the Rot");
        desertIslandPlaylist.set(songB, tempA);

        System.out.println(desertIslandPlaylist);
    }
}
