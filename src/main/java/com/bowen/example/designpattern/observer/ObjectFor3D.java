package com.bowen.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-08-01 1:29 PM
 */
public class ObjectFor3D implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 3D彩票的号码
     */
    private String msg;

    /**
     * 注册一个观察着
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0)
        {
            observers.remove(index);
        }

    }

    /**
     * 通知所有的观察着
     */
    public void notifyObservers() {
        for (Observer observer : observers)
        {
            observer.update(msg);
        }
    }



    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }

}
