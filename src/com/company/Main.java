package com.company;

import javax.swing.*;
import java.io.IOException;

import java.time.LocalDate;

public class Main {

    private static String userInput;
    private static String firstName;
    private static String lastName;
    private static String idNumber;


    public static void main(String[] args) throws IOException {

        //userInput = JOptionPane.showInputDialog("Please write personnummer (only digits) or full name");
        //userInput = "8512021234"; // inaktiv
        //userInput = "Diamanda Djedi"; // aktiv
        //userInput = "7805211234"; // aktiv
        //userInput = "foobar";
        //userInput = "";

        if (userInput.equals("")) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty.");
            System.exit(1);
        }

        if (userInput.contains(" ")) {
            String[] arr = userInput.split(" ");
            firstName = arr[0];
            lastName = arr[1];
        } else {
            idNumber = userInput;
        }

        Search search = new Search();
        Member member = search.isMemberInTheSystem(firstName, lastName, idNumber);

        if (member == null) {
            JOptionPane.showMessageDialog(null, "Person has never been a member.");
            System.exit(0);
        }

        LocalDate now = LocalDate.now();
        if (member.isActiveMember(now)) {
            JOptionPane.showMessageDialog(null, member.getFirstName() + " is an active member.");

            Pt pt = new Pt();
            pt.writeTrainingActivity(member);
        }
        JOptionPane.showMessageDialog(null, member.getFirstName() + " is an inactive member.");

    }
}




