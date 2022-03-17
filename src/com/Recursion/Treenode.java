package com.Recursion;
import java.util.ArrayList;

public class Treenode <T> {
    // we have taken generics bcs the data can be of any type:
    public T data;
    public ArrayList<Treenode<T>> children;

    public Treenode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
