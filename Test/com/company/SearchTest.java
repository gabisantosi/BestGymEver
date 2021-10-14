package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void isMemberInTheSystem() {
        Search search = new Search();

        String firstName1 = "Mia";
        String lastName1 = "Svensson";
        String idNumber1 = "1111111111";
        TestCase.assertNull(search.isMemberInTheSystem(firstName1, lastName1, idNumber1));

        String firstName2 = "Luna";
        String lastName2 = "Nilsson";
        String idNumber2 = "22222222222";
        TestCase.assertNull(search.isMemberInTheSystem(firstName2, lastName2, idNumber2));
    }
}