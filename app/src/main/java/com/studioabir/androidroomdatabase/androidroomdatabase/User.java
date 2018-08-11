package com.studioabir.androidroomdatabase.androidroomdatabase;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//-----entity meance this is a table in room database---//
@Entity(tableName = "users")
public class User
{

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "username")
    private String name;

    @ColumnInfo(name = "useremail")
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
