package in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.Courses;
import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;

@Dao
public interface UserDetailsDao {

        @Insert
        void insertCourse(UserDetailsModel user);

        @Update
        void updateCourse(UserDetailsModel user);

        @Delete
        void deleteCourse(UserDetailsModel user);



}
