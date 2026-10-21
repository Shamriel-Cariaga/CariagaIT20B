/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author User
 */
public class linkedListQueue {
    
    public class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    private Node front;
    private Node rear;
    
    public void enqueue(int value) {
        Node newNode = new Node(value);
        
        if (rear == null) {
            front = rear =newNode;
            return;
        }
        
        rear.next = newNode;
        rear = newNode;
    }
    
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        int value = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        return value;
    }
    
    public static void main(String[] args){
        linkedListQueue q = new linkedListQueue();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
