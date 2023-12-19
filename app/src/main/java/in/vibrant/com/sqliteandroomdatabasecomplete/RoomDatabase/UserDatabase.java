package in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.Courses;
import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;
import in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase.Dao.CourseDao;
import in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase.Dao.UserDetailsDao;


@Database(entities = {Courses.class, UserDetailsModel.class}, exportSchema = false, version = 9)
public abstract class  UserDatabase extends RoomDatabase {
    private static final String DB_NAME="User_Database";
    private static UserDatabase instance;
    public static synchronized UserDatabase getInstance(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context,UserDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract CourseDao courseDao();
    public abstract UserDetailsDao userDetailsDao();


}
