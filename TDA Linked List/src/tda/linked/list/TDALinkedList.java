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
public class TDALinkedList {

    ///Properties
    Node head;
    int count;
    ///Constructors
    public TDALinkedList(){
        head = null;
        count = 0;
    }
    
    public TDALinkedList(Node newHead){
        head = newHead;
        count = 1;
    }
    
    ///Methods
    
    //add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while( current != null && current.getNext() != null ){
            current = current.getNext();
        }
        if( current != null )
            current.setNext(temp);
        else
            current.setNext(null);
        count++;
    }
    
    //get
    //size
    //isEmpty
    //remove
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
