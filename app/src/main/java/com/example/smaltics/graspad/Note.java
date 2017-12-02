package com.example.smaltics.graspad;

import android.content.Context;
import android.icu.text.SimpleDateFormat;

import java.io.Serializable;

/**
 * Created by Julio Castro on 01/12/2017.
 */

public class Note implements Serializable {
    private long nDateTime;
    private String nTitle;
    private String nContent;

    public Note(long dateTime, String title, String content) {
        this.nDateTime = dateTime;
        this.nTitle = title;
        this.nContent = content;
    }


    public void setnDateTime(long nDateTime) {
        this.nDateTime = nDateTime;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent;
    }

    public long getnDateTime() {
        return nDateTime;
    }

    public String getnTitle() {
        return nTitle;
    }

    public String getnContent() {
        return nContent;
    }

}
