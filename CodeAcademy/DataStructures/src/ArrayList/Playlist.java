package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist=new ArrayList<>();
        desertIslandPlaylist.add("Bugibugi");
        desertIslandPlaylist.add("How Gee");
        desertIslandPlaylist.add("Te aMo");
        desertIslandPlaylist.add("invisible touch");
        desertIslandPlaylist.add("Divier");
        desertIslandPlaylist.add("Sera porque Te amo");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist.size());
        int indexA=desertIslandPlaylist.indexOf("Bugibugi");
        int indexB=desertIslandPlaylist.indexOf("Divier");
        String temp=desertIslandPlaylist.get(3);
        desertIslandPlaylist.set(indexB,"Bugibugi");
        desertIslandPlaylist.set(indexA,"Divier");

        System.out.println(desertIslandPlaylist);


    }
    }

