package com.company;

public class Node<T> {

    private T _info;
    private  Node<T> _next;

    public T get_info() {
        return _info;
    }

    public void set_info(T _info) {
        this._info = _info;
    }

    public Node<T> get_next() {
        return _next;
    }

    public void set_next(Node<T> _next) {
        this._next = _next;
    }

    public Node(T info) {
        _info = info;
    }
}
