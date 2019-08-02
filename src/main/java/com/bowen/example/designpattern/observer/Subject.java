package com.bowen.example.designpattern.observer;


/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-08-01 1:26 PM
 */
public interface Subject {

    /**
     * 注册一个观察着
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    public void notifyObservers();

}
