/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Kayla Ford
 */
import java.util.Scanner;

public class TestGame {
       public static void main(String[] args) {
        // TODO code application logic here
           char player1, player2;
          
           Scanner keyboard = new Scanner(System.in);
           System.out.println("Welcome to Tic Tac Toe");
           System.out.print("Player one what do you want to be: ");
           player1 = keyboard.next().charAt(0); //capturing player desired input
           
           
           while((player1 != 'x'&& player1 != 'X') && (player1 != 'o' && player1 != 'O') ) //ensuring player choosing correct option
           {
           
            System.out.println("Player one please pick a valid option: x or o");
            System.out.println(player1);
            player1=keyboard.next().charAt(0);
           }
        
          player2 = (player1=='x'||player1=='X')?'o':'x'; //tenery to give player2 their option by default
            System.out.println("Player two, you are: "+ player2 );
            TicTacToe go = new TicTacToe(player1,player2); //creating instance reference object
            System.out.println("We're all ready to begin, let's start!");
             go.turns(go); 
            
            
            
           
           
           
    }
    
}
