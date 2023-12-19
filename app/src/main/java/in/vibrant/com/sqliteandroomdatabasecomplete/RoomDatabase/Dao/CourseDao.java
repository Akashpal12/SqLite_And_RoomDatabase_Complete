package in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.Courses;


@Dao
public interface CourseDao {

    @Insert
    void insertCourse(Courses courses);

    @Update
    void updateCourse(Courses courses);

    @Delete
    void deleteCourse(Courses courses);

    @Query("DELETE FROM courses_table")
    void deleteAllCourses();

    @Query("SELECT * FROM courses_table")
    List<Courses> getAllCourses();


}
