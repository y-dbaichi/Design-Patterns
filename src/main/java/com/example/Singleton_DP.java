package com.example;

public class Singleton_DP {
    private static Singleton_DP singleton;
    private Singleton_DP(){
    }
    public static Singleton_DP getInstance(){
        if(singleton==null){
            singleton=new Singleton_DP();

        }
        return singleton;
    }
}
