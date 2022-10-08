package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.Objects;

public class StringUtil {

    //Заданы два массива строк. Определить, является ли содержимое этих массивов идентичным. Порядок расположения элементов значения не имеет.

    public Boolean getTwoArraysIdentical(String[] word1, String[] word2) {
        Arrays.sort(word1);
        Arrays.sort(word2);
        if (word1.length != word2.length) {
            return false;
        } else {
            for (int i = 0; i < word1.length; i++) {
                if (Objects.equals(word1[i], word2[i])) {
                    return true;
                }
            }
        }
        return true;
    }

    // Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
    //   второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.

    public boolean getMultipleAdditionOfStrings(String string1, String string2) {
        long startTime1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < 100; i++) {
            str1 = string1 + string2;
        }

        long endTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        str2 = new StringBuilder(new StringBuilder().append(string1).append(string2).toString());
        for (int i = 0; i < 100; i++) {
            str2.append(str2);
        }
        long endTime2 = System.currentTimeMillis();
        return ((endTime1 - startTime1) > (endTime2 - startTime2));
    }
}
