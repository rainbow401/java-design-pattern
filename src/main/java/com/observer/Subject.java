package com.observer;

/**
 * @author yanzhihao
 * @since 2022/5/7
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}
