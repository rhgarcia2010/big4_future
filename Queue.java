package com.company;

public class Queue<T> {

    private int _size;
    private Node<T> _head;

    public Queue(){
        _size = 0;
        _head = null;
    }

    public boolean isEmpty(){
        return _size == 0;
    }

    public void enqueue(T val){

        Node<T> newNode = new Node<T>(val);

        if(isEmpty())
        {
            this._head = newNode;
        }
        else
        {
            Node<T> last = this._head;
            while (last.get_next() != null)
                last = last.get_next();

            last.set_next(newNode);
        }
        this._size += 1;
    }

    public T dequeue(){

        if(isEmpty())
            return null;

        T info = this._head.get_info();
        this._head = this._head.get_next();
        this._size -= 1;
        return info;
    }

}
