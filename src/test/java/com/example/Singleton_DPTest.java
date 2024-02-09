package com.example;

import junit.framework.TestCase;
import org.junit.Test;

public class Singleton_DPTest  {
    @Test
    public void TestUnicity(){
        Singleton_DP singleton1=Singleton_DP.getInstance();
        Singleton_DP singleton2=Singleton_DP.getInstance();
        TestCase.assertEquals(singleton2,singleton1);

    }

}