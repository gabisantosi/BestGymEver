package com.company;

import junit.framework.TestCase;
import org.junit.Test;
import java.time.LocalDate;

public class PtTest {

    @Test
    public void writeTrainingActivity()  {
        Pt pt = new Pt();
        String firstName = "Patricia";
        String lastName = "Johasson";
        String idNumber = "8902042340";
        LocalDate now = LocalDate.now();
        Member member = new Member(firstName, lastName, idNumber, "2021-10-01");

        TestCase.assertTrue(pt.writeTrainingActivity(member));
    }
}