package com.Recursion;
import java.util.ArrayList;

public class Treenode <T> {
    // we have taken generics bcz the data can be of any type:
    public T data;
    public ArrayList<Treenode<T>> children;

    // have taken arraylist in which the element will be treenode of type T.

    // taken constuctor in which the data will be of T type.

    public Treenode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
