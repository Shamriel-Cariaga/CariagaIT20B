/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author User
 */
public class stackLinkedList {
    private class Node{
        
        int data;
        Node next;
        
        //Constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //Top of the stack
    private Node top;
    public stackLinkedList(){
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    //Push
    public void push(int value){
        
        Node newNode = new Node(value); //New node
        newNode.next = top; //Connect
        top = newNode; //New node the top
        System.out.println(value + " pushed into the stack.");
    }
    
    //Peek
    public int peek(){
        
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        
        return top.data;
    }
    
    //Pop
    public int pop(){
        
        if(isEmpty()){
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        
        int value = top.data; //Store
        top = top.next; //Move to the next
        return value;
    }
    
    //Display
    public void display(){
        
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }
        
        Node current = top;
        System.out.println("Stack Elements: ");
        
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        
        stackLinkedList stack = new stackLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println();
        
        stack.display();
        System.out.println();
        
        System.out.println("Top Element: " + stack.peek());
        System.out.println();
        
        System.out.println("Removed: " + stack.pop());
        System.out.println();
        
        System.out.println("Top Element: " + stack.peek());
        System.out.println();
        
        stack.display();
    }
}
