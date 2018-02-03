//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    String user = JOptionPane.showInputDialog("Is it a weekday?");
String vac = JOptionPane.showInputDialog("Is it a vacation?");

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    if (user.equals("yes") && vac.equals("no")) {
    	JOptionPane.showMessageDialog(null, "get up lazybones!");
    }
    else if (user.equals("yes") && vac.equals("yes")) {
    	
 JOptionPane.showMessageDialog(null, "Sleep in");
    }
    else {
    	JOptionPane.showMessageDialog(null, "Sleep in");
    }
}}
