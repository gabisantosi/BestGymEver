package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Search {

    private String[] idAndName;

    public Member isMemberInTheSystem(String firstName, String lastName, String idNumber) {

        int i = 0;
        Member member = new Member(null, null, null, null);
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/gabi/IdeaProjects/BestGymEver/Resources/customers.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (i >= 2) {
                    i = 0;
                }

                if (i == 0) {
                    idAndName = line.trim().split(", ");
                    String id = idAndName[0];
                    String[] fullName = idAndName[1].split(" ");
                    String fn = fullName[0].substring(0, 1).toUpperCase() + fullName[0].substring(1).toLowerCase();
                    String ln = fullName[1].substring(0, 1).toUpperCase() + fullName[1].substring(1).toLowerCase();

                    if (idNumber != null && idNumber.equals(id)) {
                        found = true;
                    } else if (firstName != null && fn.equals(firstName)) {
                        found = true;
                    } else if (lastName != null && ln.equals(lastName)) {
                        found = true;
                    }

                    if (found) {
                        member.setFirstName(fn);
                        member.setLastName(ln);
                        member.setIdNumber(id);
                    }
                }

                if (i == 1 && found) {
                    LocalDate membershipPaymentDate = LocalDate.parse(line);
                    member.setMembershipPaymentDate(membershipPaymentDate);
                    return member;
                }

                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something went wrong and we could not upload your file.");
        }
        return null;
    }
}



