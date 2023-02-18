package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;


import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    private final String sex;
    Feline feline = Mockito.mock(Feline.class);

    public LionTest(String sex)  {
        this.sex = sex;
    }

    @Test
    public void getKittensShouldReturnKittens() throws Exception {
        Lion lion = new Lion(feline, sex);
        when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }


    @Test
    public void getFoodShouldReturnAnimalKind() throws Exception {
        final List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion(feline, sex);
        Assert.assertEquals(expected, lion.getFood());
    }

    @Parameterized.Parameters
    public static Object[][] getFelineSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean expected = sex.equals("Самец");
        final boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }
}