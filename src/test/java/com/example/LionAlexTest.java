package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {
    Feline feline = new Feline();
    LionAlex alex = new LionAlex(feline, "Самец");

    public LionAlexTest() throws Exception {
    }

    @Test
    public void testGetKittensShouldReturnZero() {

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsShouldReturnFriends() {
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Глория", "Мэлман", "Марти");
        assertEquals(expected, actual);

    }

    @Test
    public void getPlaceOfLivingShouldReturnLivingPlace() {
        String expected = "Нью Йорк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}