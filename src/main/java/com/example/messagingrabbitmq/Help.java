package com.example.messagingrabbitmq;

import java.util.Random;

public class Help {
    static int num = -1;
    public static String key() {
        Random random = new Random();
        int x = random.nextInt(2000);
        if (num == -1)
            num = x;
        else
            x = num;
        String num = String.valueOf(x);
        return "foo.bar." + num;
    }

    public static String queue() {
        Random random = new Random();
        int x = random.nextInt(2000);
        if (num == -1)
            num = x;
        else
            x = num;
        String num = String.valueOf(x);
        return "spring-boot" + num;
    }
}
