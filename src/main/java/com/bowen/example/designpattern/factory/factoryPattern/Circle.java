package com.bowen.example.designpattern.factory.factoryPattern;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-08-01 2:53 PM
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
