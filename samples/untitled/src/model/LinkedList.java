package model;

import exceptions.InvalidOperationException;

public interface LinkedList {
    boolean isEmpty();
    int size();
    void add(int element);
    int pop() throws InvalidOperationException;
    void remove(int index) throws InvalidOperationException;
    void insert(int element, int index) throws InvalidOperationException;
}
