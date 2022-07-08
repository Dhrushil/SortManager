package com.sparta.model;

import java.util.ArrayList;
import java.util.List;

public class TreeSort implements Sorter{
    @Override
    public int[] sortArray(int[] arrayToSort) {
        treeins(arrayToSort);
        inorderRec(root);
        int[] sortedArray = list.stream().mapToInt(i->i).toArray();
        return sortedArray;
    }

    public List<Integer> list = new ArrayList<>();

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    public Node root;

    public TreeSort() {
        root = null;
    }

    void insert(int key)
    {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key)
    {

        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key <= root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            //System.out.println(root.key);
            list.add(root.key);
            inorderRec(root.right);
        }
    }
    public void treeins(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            insert(arr[i]);

        }

    }
}
