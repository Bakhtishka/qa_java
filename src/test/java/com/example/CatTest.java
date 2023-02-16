package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    Predator predator;

    public CatTest() {
        this.predator = feline;
    }

    @Test
    public void getSoundShouldReturnCatSound() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodShouldReturnAnimalType() throws Exception {
        List<String> expected = predator.eatMeat();
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}