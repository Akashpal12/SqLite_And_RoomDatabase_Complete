package in.vibrant.com.sqliteandroomdatabasecomplete.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "courses_table")
public class Courses {
    private String courseType;
    private String teacherName;
    private String addExtra;
    private String classes;
    private String courseDiscounts;
    private String courseDescription;
    private String courseFieldCreater;
    private String courseTitle;
    private String coursePrice;
    private String courseimage;


    @PrimaryKey
    private long id;

    private String board;
    private String coursePromocode;

    private long softTTL;

    public long getSoftTTL() {
        return softTTL;
    }

    public void setSoftTTL(long softTTL) {
        this.softTTL = softTTL;
    }
// Getter Methods

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getAddExtra() {
        return addExtra;
    }

    public void setAddExtra(String addExtra) {
        this.addExtra = addExtra;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCourseDiscounts() {
        return courseDiscounts;
    }

    public void setCourseDiscounts(String courseDiscounts) {
        this.courseDiscounts = courseDiscounts;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseFieldCreater() {
        return courseFieldCreater;
    }

    // Setter Methods

    public void setCourseFieldCreater(String courseFieldCreater) {
        this.courseFieldCreater = courseFieldCreater;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseimage() {
        return courseimage;
    }

    public void setCourseimage(String courseimage) {
        this.courseimage = courseimage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getCoursePromocode() {
        return coursePromocode;
    }

    public void setCoursePromocode(String coursePromocode) {
        this.coursePromocode = coursePromocode;
    }

}
