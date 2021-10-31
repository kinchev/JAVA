package com.telerikacademy.oop.dealership.utils;


public class TestUtilities {
    /**
     * Returns a new String with size equal to wantedSize.
     * Useful when you do not care what the contents of a String are,
     * for example when testing if a String of given size
     * would cause an exception being thrown.
     *
     * @param wantedSize the size of the String to be returned.
     * @return a new String with size equal to wantedSize
     */
    public static String initializeStringWithSize(int wantedSize) {
        return "x".repeat(wantedSize);
    }
}
