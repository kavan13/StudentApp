package com.studentapp.model.utility;

import java.util.Random;

public class Utility {
    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
