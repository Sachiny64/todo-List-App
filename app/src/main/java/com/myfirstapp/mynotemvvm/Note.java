package com.myfirstapp.mynotemvvm;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_notes")

public class Note {

    private String title;

    public String getDisp() {
        return disp;
    }

    private String disp;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PrimaryKey(autoGenerate = true)
    private int id ;

    public String getTitle() {

        return title;
    }
    public Note(String title, String disp){
        this.title=title;
        this.disp=disp;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDesc() {

        return disp;
    }

    public void setDesc(String desc) {

        this.disp = disp;
    }
}
