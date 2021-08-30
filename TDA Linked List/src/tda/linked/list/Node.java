/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda.linked.list;

/**
 *
 * @author Leandro
 */
public class Node {
    ///properties
    Node next;
    int data;
    
    ///constructors
    public Node(int newData){
        data = newData;
        next = null;
    }
    
    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }
    
    ///getters and setters
    public int getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setData( int newData ){
        data = newData;
    }
    
    public void setNext( Node newNext ){
        next = newNext;
    }
}
