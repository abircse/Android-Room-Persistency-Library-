package com.studioabir.androidroomdatabase.androidroomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao
{

    ///----data add User methord----//
    //---DAO= Data access object---//

    @Insert
    public void addUser(User User);

    @Query("select * from users")
    public List<User> getUsers();

    @Delete
    public void deleteUser(User user);

    @Update
    public void UpdateUser(User user);

}
