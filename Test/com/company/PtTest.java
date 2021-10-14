package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class PtTest {

    @Test
    public void writeTrainingActivity() throws IOException {

        Pt pt = new Pt();
        String firstName = "Veronica";
        String lastName = "Johasson";
        String idNumber = "8902042340";
        LocalDate localDate = LocalDate.now();
        Member member = new Member(firstName, lastName, idNumber, "2021-10-01");

        assertTrue(pt.writeTrainingActivity(member));
    }
}