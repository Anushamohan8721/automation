package com.mavenit.selenium.utils;

import org.junit.Test;

import java.util.Random;

public class Helpers {

    public int randomNumber(int boundValue) {
        Random random = new Random();
        int randomNumber = random.nextInt(boundValue-1);
        System.out.println("Random number : " + randomNumber);
        return randomNumber;
    }
}
