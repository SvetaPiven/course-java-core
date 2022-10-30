package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class LastNameWithAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) {
            return Double.compare(o1.getAge(), o2.getAge());
        } else {
            return result;
        }
    }
}