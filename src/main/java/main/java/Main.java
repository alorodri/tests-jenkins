package main.java;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        final String helloWorld = "Hello world";

        if (StringUtils.isNotBlank(helloWorld)) {
            System.out.println(helloWorld);
        }

    }
}