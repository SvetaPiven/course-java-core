package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return Double.compare(o1.getAge(), o2.getAge());
    }
}