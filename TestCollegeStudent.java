/*
    Derrick Cates
    CIS 402A 305J
    11/16/2019

    TestCollegeStudent.java
    This is a TestCollegeStudent class that will be used to test the CollegeStudent
    class.  The class will take user input through joptionpane and use that info
    to instantiate two objects of the college student class. After that, the program
    will print all information for each student in display windows.

 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.*;
//Test Class
public class TestCollegeStudent {
    //main method
    public static void main(String[] args){
        //create text fields for each variable that is needed
        JTextField fNameField = new JTextField(5);
        JTextField lNameField = new JTextField(5);
        JTextField monthField = new JTextField(5);
        JTextField dayField = new JTextField(5);
        JTextField yearField = new JTextField(5);

        //create instance of jpanel class
        JPanel panel = new JPanel();
        //line each text field vertically
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //set labels for text fields
        panel.add(new JLabel("First Name: "));
        //add text field to panel object
        panel.add(fNameField);
        panel.add(new JLabel("Last Name: "));
        panel.add(lNameField);
        panel.add(new JLabel("Enrollment Month (1 - 12): "));
        panel.add(monthField);
        panel.add(new JLabel("Enrollment Date: "));
        panel.add(dayField);
        panel.add(new JLabel("Enrollment Year: "));
        panel.add(yearField);
        //display dialog box using panel object to collect information from user
        int exit = JOptionPane.showConfirmDialog(null, panel,
            "Student One", JOptionPane.OK_CANCEL_OPTION);
        //close dialog box without error if x or cancel is clicked
        if (exit == JOptionPane.CANCEL_OPTION || exit == JOptionPane.CLOSED_OPTION){
            System.exit(0);
        }
        //assign information from each field to variables
        String firstName = fNameField.getText();
        //reset text field for use with second CollegeStudent object later
        fNameField.setText("");
        String lastName = lNameField.getText();
        lNameField.setText("");
        int month = Integer.parseInt(monthField.getText());
        monthField.setText("");
        int date = Integer.parseInt(dayField.getText());
        dayField.setText("");
        int year = Integer.parseInt(yearField.getText());
        yearField.setText("");
        //create studentOne object from collegeStudent class
        //use gregorian calendar to create dates. Subtract 1 from month for correct input
        CollegeStudent studentOne = new CollegeStudent(firstName, lastName,
            new GregorianCalendar(year, month - 1, date));
        //create new dialog box with cleared text fields for student two data
        exit = JOptionPane.showConfirmDialog(null, panel,
            "Student Two", JOptionPane.OK_CANCEL_OPTION);
        //exit if cancel or x is clicked
        if (exit == JOptionPane.CANCEL_OPTION || exit == JOptionPane.CLOSED_OPTION){
            System.exit(0);
        }
        //add new data to variables
        firstName = fNameField.getText();
        lastName = lNameField.getText();
        month = Integer.parseInt(monthField.getText());
        date = Integer.parseInt(dayField.getText());
        year = Integer.parseInt(yearField.getText());
        //create studentTwo object with new information collected
        CollegeStudent studentTwo = new CollegeStudent(firstName, lastName,
            new GregorianCalendar(year, month - 1, date));
        //display studentOne object information in new dialog box
        JOptionPane.showMessageDialog(null, String.format("  " +
            "       Student One \nFirst Name  : %s\nLast Name  : %s\nEnrollment" +
            " Date : %s\nGraduation Est. : %s", studentOne.getFName(),
            studentOne.getLName(), studentOne.getEnroll().getDisplayName(Calendar.MONTH,
            Calendar.LONG, new Locale("English")) + " " +
            studentOne.getEnroll().get(Calendar.DAY_OF_MONTH) + " " +
            studentOne.getEnroll().get(Calendar.YEAR),
            studentOne.getEnroll().getDisplayName(Calendar.MONTH, Calendar.LONG,
            new Locale("English")) + " " +
            studentOne.getEnroll().get(Calendar.DAY_OF_MONTH) + " " +
            studentOne.getGrad().get(Calendar.YEAR)));
        //display studentTwo object information in new dialog box.
        JOptionPane.showMessageDialog(null, String.format("  " +
            "       Student Two \nFirst Name  : %s\nLast Name  : %s\nEnrollment" +
            " Date : %s\nGraduation Est. : %s", studentTwo.getFName(),
            studentTwo.getLName(), studentTwo.getEnroll().getDisplayName(Calendar.MONTH,
            Calendar.LONG, new Locale("English")) + " " +
            studentTwo.getEnroll().get(Calendar.DAY_OF_MONTH) + " " +
            studentTwo.getEnroll().get(Calendar.YEAR),
            studentTwo.getEnroll().getDisplayName(Calendar.MONTH, Calendar.LONG,
            new Locale("English")) + " " +
            studentTwo.getEnroll().get(Calendar.DAY_OF_MONTH) + " " +
            studentTwo.getGrad().get(Calendar.YEAR)));
    }
}