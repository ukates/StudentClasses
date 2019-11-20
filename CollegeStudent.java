/*
    Derrick Cates
    CIS 402A 305J
    11/16/2019

    CollegeStudent.java
    This is a CollegeStudent class that will be used in the TestCollegeStudent
    program.  The class will have constructor to force user to give fname lname
    and enroll date.  Will use Gregorian Calendar to show date.

 */

import java.util.Calendar; // import calendar
import java.util.GregorianCalendar; // import GregorianCalendar

//CollegeStudent Class
public class CollegeStudent {
    //first name
    private String fName;
    //last name
    private String lName;
    // enrollment date
    private GregorianCalendar enrollDate;
    //graduation date
    private GregorianCalendar gradDate;
    //constructor for College Student requires fname / lname / enrollment date
    public CollegeStudent(String fName, String lName, GregorianCalendar enrollDate){
        this.fName = fName;
        this.lName = lName;
        this.enrollDate = enrollDate;
        //makes clone of enrollment date and assigns to grad date
        gradDate = (GregorianCalendar) enrollDate.clone();
        //add four years to enroll date to estimate grad date
        gradDate.add(Calendar.YEAR, 4);
    }
    //getter for first name
    public String getFName(){
        return fName;
    }
    //setter for first name
    public void setFName(String fName){
        this.fName = fName;
    }
    //getter for last name
    public String getLName(){
        return lName;
    }
    //setter for last name
    public void setLName(String lName){
        this.lName = lName;
    }
    //getter for enrollment date
    public GregorianCalendar getEnroll(){
        return enrollDate;
    }
    //setter for enrollment date
    public void setEnroll(GregorianCalendar enrollDate){
        this.enrollDate = enrollDate;
    }
    //getter for grad date
    public GregorianCalendar getGrad(){
        return this.gradDate;
    }
    //setter for grad date
    public void setGrad(GregorianCalendar gradDate){
        this.gradDate = gradDate;
    }
}
