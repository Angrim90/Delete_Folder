package net.ukr.oleg90.shvets;

import java.io.File;

import static net.ukr.oleg90.shvets.DeleteFile.deleteFolder;

public class Main {

    public static void main(String[] args) {

        File folder = new File("E:/Загрузки/Torrent/q");

        deleteFolder(folder);

    }



}
