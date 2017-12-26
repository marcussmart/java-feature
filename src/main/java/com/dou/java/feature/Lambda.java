package com.dou.java.feature;

import java.util.Collections;
import java.util.List;

/**
 * Created by dou on 2017/12/26.
 */
public class Lambda {

    public void sort0(List<String> collection) {
        Collections.sort(collection, (String a, String b) ->  {
            return a.compareTo(b);
        });
    }

    public void sort1(List<String> collection) {
        Collections.sort(collection, (String a, String b) ->  a.compareTo(b));
    }




}
