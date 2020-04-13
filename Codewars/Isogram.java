package com.company;

public class Isogram {
    public static boolean isIsogram(String str) {
        if (str.isEmpty()) return true;
        return (!isThereSameLetters(str));
    }

    private static boolean isThereSameLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (sameLetter(str, i, j) || (sameLetterWithRegister(str, i, j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sameLetter (String string, int index1, int index2) {
        return string.charAt(index1) == string.charAt(index2);
    }

    private static boolean sameLetterWithRegister (String string, int index1, int index2) {
        if (string.charAt(index2) >= 65 & (string.charAt(index2) <= 90))
            return string.charAt(index1) == ((char) (string.charAt(index2) + 32));
        else
            return string.charAt(index1) == ((char) (string.charAt(index2) - 32));
    }
}