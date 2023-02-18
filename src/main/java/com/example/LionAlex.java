package com.example;


import java.util.List;


public class LionAlex extends Lion {

    public LionAlex(Feline feline, String sex) throws Exception {
        super(feline, sex);
    }

    @Override
    public int getKittens() {
        return 0;
    }


    public List<String> getFriends() {
        return List.of("Глория", "Мэлман", "Марти");
    }

    public String getPlaceOfLiving() {
        return "Нью Йорк";
    }
}
