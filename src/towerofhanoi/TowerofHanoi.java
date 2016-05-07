/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

import java.util.Stack;

/**
 *
 * @author Praneetha
 */
public class TowerofHanoi {

    /**
     * @param args the command line arguments
     */
    
    public static void move(int count, Stack<Integer>orig, Stack<Integer>middle, Stack<Integer> end){
        if (orig.isEmpty())
            return;
        move(count-1, orig, end, middle); //the count-1 elements will move to the auxiliary rod
        end.push(orig.pop()); //This is where the push to the stack is happening
        move(count-1, middle, orig, end);  //after the initial move to the auxiliary rod, they willbe moved to the end recursively.
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> orig = new Stack<Integer>();
        Stack<Integer> auxiliary = new Stack<Integer>();
        Stack<Integer> end = new Stack<Integer>();
        
        for (int i=5; i>0; i--){
            orig.push(i);
        }
        move(5, orig, auxiliary, end);
    }
    
}
