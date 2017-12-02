package com.example.smaltics.graspad;

import android.content.Context;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Julio Castro on 01/12/2017.
 */

public class Utilities {

    public static final String FILE_NAME="note_";
    public static final String FILE_EXTENSION=".gras";

    public static boolean saveNote(Context context,Note note){


        String fileName=FILE_NAME + String.valueOf(note.getnDateTime()) + FILE_EXTENSION;

        FileOutputStream fos;
        ObjectOutputStream oos;

        try {

            fos=context.openFileOutput(fileName,context.MODE_PRIVATE);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(note);
            fos.close();
            oos.close();

        }catch (IOException e){
            e.printStackTrace();
            return false;
        }

        return true;

    }
}
