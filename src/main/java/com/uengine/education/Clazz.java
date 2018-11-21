package com.uengine.education;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by uengine on 2018. 11. 21..
 */
@Entity
public class Clazz {

    @Id @GeneratedValue
    Long id;
    String instructorName;
    Date startDate;
    Date endDate;
    String title;

    @ManyToOne(fetch = FetchType.EAGER) @JoinColumn(name="courseId")
    Course course;



    ///////////////

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    @PreUpdate
    public void setInfo(){

        if(getCourse()!=null){

            setTitle(getCourse().getTitle() + "의 강의 [강사:" + getInstructorName() + "]");
        }

    }


}
