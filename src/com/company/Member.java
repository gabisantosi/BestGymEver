package com.company;

import java.time.LocalDate;
import java.time.Period;


public class Member {

    private String firstName;
    private String lastName;
    private String idNumber;
    private LocalDate membershipPaymentDate;

    public Member(String firstName, String lastName, String idNumber, CharSequence membershipPaymentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        if (membershipPaymentDate != null) {
            LocalDate m = LocalDate.parse(membershipPaymentDate);
            this.membershipPaymentDate = m;
        }
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setMembershipPaymentDate(LocalDate membershipPaymentDate) {
        this.membershipPaymentDate = membershipPaymentDate;
    }

    public boolean isActiveMember(LocalDate now) {
        Period period = Period.between(now, this.membershipPaymentDate);
        if (period.getYears() == 0) {
            System.out.println(" is an active user");
            return true;
        } else {
            System.out.println(" is an former user");
            return false;
        }
    }
}