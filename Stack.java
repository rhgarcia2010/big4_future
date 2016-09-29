package com.company;

public class Stack<T> {

    private int _size;
    private Node<T> _head;

    public Stack(){
        _size = 0;
        _head = null;
    }

    public boolean isEmpty(){
        return this._size == 0;
    }

    public void push(T value){
        Node<T> newNode = new Node<T>(value);

        if(isEmpty()){
            _head = newNode;
        }
        else
        {
            newNode.set_next(this._head);
            this._head = newNode;
        }
        this._size += 1;
    }

    public T pop(){

        if(isEmpty())
            return null;

        T info = this._head.get_info();
        this._head = this._head.get_next();
        this._size -= 1;
        return  info;
    }
}
