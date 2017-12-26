package com.dou.java.feature;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dou on 2017/12/26.
 */
public class LambdaTest {

    private static Lambda lambda = new Lambda();

    private List<String> list =  Arrays.asList("peter", "anna", "mike", "xenia");

    @Test
    public void testSort0() throws Exception {
        System.out.println(list);
        lambda.sort0(list);
        System.out.println(list);
    }

    @Test
    public void testSort1() throws Exception {
        System.out.println(list);
        lambda.sort1(list);
        System.out.println(list);
    }
}