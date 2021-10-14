package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MemberTest {

    @Test
    public void isActiveMember() {
        Member member1 = new Member("Olle", "Svensson", "8201233065", "2021-10-01");
        LocalDate now = LocalDate.parse("2021-09-01");
        TestCase.assertTrue(member1.isActiveMember(now));
    }

    @Test
    public void isInactiveMember() {
        Member member1 = new Member("Olle", "Svensson", "8201233065", "2019-10-01");
        LocalDate now = LocalDate.parse("2021-10-14");
        TestCase.assertFalse(member1.isActiveMember(now));
    }
}