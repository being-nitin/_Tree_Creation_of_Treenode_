package com.Recursion;
import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) {
        Treenode<Integer> root = new Treenode<>(4);
        Treenode<Integer> node1 = new Treenode<>(2);
        Treenode<Integer> node2 = new Treenode<>(3);
        Treenode<Integer> node3 = new Treenode<>(9);
        Treenode<Integer> node4 = new Treenode<>(6);
        Treenode<Integer> node5 = new Treenode<>(7);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node3.children.add(node4);
        node3.children.add(node4);
        System.out.println();
    }
}
