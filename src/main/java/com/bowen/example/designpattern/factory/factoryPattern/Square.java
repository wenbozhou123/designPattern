package com.bowen.example.designpattern.factory.factoryPattern;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-08-01 2:51 PM
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
