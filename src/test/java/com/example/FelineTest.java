package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnAnimalType() throws Exception {
        final List<String> expected = List.of("Животные", "Птицы", "Рыба");
        final List<String> actual = feline.getFood("Хищник");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyShouldReturnAnimalFamily() {
        final String expected = "Кошачьи";
        final String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensShouldReturnKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }
}