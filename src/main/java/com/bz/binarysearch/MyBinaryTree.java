package com.bz.binarysearch;

public class MyBinaryTree<T extends Comparable<T>> {

    private MyBinaryNode<T> root;
/*
* add method is used to add nodes to bst
* */
    public void add(T key) {
        this.root = this.addRecursively(root, key);
    }
/*
* method used to add nodes recursively
* */
    public MyBinaryNode<T> addRecursively(MyBinaryNode<T> current, T key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else
            current.right = addRecursively(current.right, key);
        return current;
    }
/*
* getSize returns the size of bst
* */
    public int getSize() {
        return this.getSizeRecursive(root);
    }
    /*
     * getSize returns the size of bst recursively
     * */
    private int getSizeRecursive(MyBinaryNode<T> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }
    /*
    * Used to search a node
    */
    public boolean search(T key)  {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }
    /*
     * Used to search a node recursively
     */
    public MyBinaryNode search_Recursive(MyBinaryNode root, T key)  {
        if (root==null || root.key==key)
            return root;
        if (root.key.compareTo(key) >0)
            return search_Recursive(root.left, key);
        else
            return search_Recursive(root.right, key);
    }
}
