package net.ukr.oleg90.shvets;

import java.io.File;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public final class DeleteFile {

    private DeleteFile() {
    }

    public static void deleteFolder(File file) {

        if (file.isDirectory() && file.exists()) {
            File[] folderIn = file.listFiles();
            for (int i = 0; i < folderIn.length; i++) {
                folderIn[i].delete();

                if (folderIn[i].isDirectory()) {
                    File inside = new File(file.getAbsolutePath() + "/"
                            + folderIn[i].getName());
                    deleteFolder(inside);
                }
            }
        }
        file.delete();

    }
}
