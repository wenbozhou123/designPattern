package com.bowen.example.designpattern.factory.factoryPattern;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-08-01 2:50 PM
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
