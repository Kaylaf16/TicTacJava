/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Kayla Ford
 */

package tictactoe;

import java.util.Scanner;
public class TicTacToe {
public String[] board ={" "," "," "," "," "," "," "," "," "};
public int[] totalmoves = new int[9];
public String player1;
public String player2;
public int counter;
public int count;
Scanner keyboard = new Scanner(System.in);

public TicTacToe(char p1, char p2)
{
    // two argument constructor which initializes our variables
    player1 = String.valueOf(p1);
    player2 = String.valueOf(p2);
    counter = 1;
    count= 0;
}
public void move (int i)
{// this method is to identify the players turn we use an even and odd integer pattern to determine whose turn it is
    if(counter % 2 == 0) 
    {
    int index = i - 1;
    board[index] = player2;
    counter++;
    return;
     }
    if(counter % 2 != 0)
    {
        int index = i - 1;
         board[index] = player1;
         counter++;
         return;
         
    }
    
}
public void turns (TicTacToe x) // ensures which turn is it
{
    /*for each conjunction of statements for a players turn we update move
     , check move validity,check if player has won, update our board and display it, and update our counter
            */
    int move;
     for(int i = 0; i < 2; i ++) // this runs for two turns each player moving twice
            {
            System.out.println("Player one choose a position to move to(1-9): "); //player ones turn
            move = keyboard.nextInt(); //updating move
           
            
        
            while(move < 0 || move > 9 || checkmove(move) == true ) // in case the move chosen was invalid
            {
                System.out.println("Sorry move invalid, try again(1-9): ");
                move = keyboard.nextInt();
                totalmoves[count] = move;
                
            }
        
            x.move(move);
            x.checkwin();
            if(x.checkwin()== true) //calling checkwin() to check the board to see if any player has won
            {
                x.update();
                System.out.print("PLAYER 1 HAS WON, THANKS FOR PLAYING!"); // if player has won we return
                return;
            }
            x.update();
            count++;
            System.out.println("Player two choose a position to move to(1-9): ");
             move = keyboard.nextInt();
             
            
             while(move < 0 || move > 9|| checkmove(move) == true )
            {
                System.out.println("Sorry move invalid, try again(1-9): ");
                move = keyboard.nextInt();
                 totalmoves[count] = move;
               
              
            }
             
             x.move(move);
              x.checkwin();
            if(x.checkwin()== true)
            {
                x.update();
                System.out.print("PLAYER 2 HAS WON, THANKS FOR PLAYING!");
                return;
            }
             x.update();
             count++;
             System.out.println("Player one choose a position to move to(1-9): ");
            move = keyboard.nextInt();
           
           
            while(move < 0 || move > 9|| checkmove(move) == true )
            {
                System.out.println("Sorry move invalid, try again(1-9): ");
                move = keyboard.nextInt();
                 totalmoves[count] = move;
              
            }
            x.move(move);
             x.checkwin();
            if(x.checkwin()== true)
            {
                x.update();
                System.out.println("PLAYER 1 HAS WON, THANKS FOR PLAYING!");
                return;
            }
            x.update();
            count++;
                System.out.println("Player two choose a position to move to(1-9): ");
             move = keyboard.nextInt();
         
             
             while(move < 0 || move > 9|| checkmove(move) == true )
            {
                System.out.println("Sorry move invalid, try again(1-9): ");
                move = keyboard.nextInt();
                 totalmoves[count] = move;
                
            }
             x.move(move);
              x.checkwin();
            if(x.checkwin()== true)
            {
                x.update();
                System.out.println("PLAYER 2 HAS WON, THANKS FOR PLAYING!");
                return;
            }
             x.update();
             count++;
            }
     System.out.println("hmm.. this game is pretty long.."); //last move nine
     System.out.println("Player one last turn, choose wisely (1-9)");
                 move = keyboard.nextInt();
                
            while(move < 0 || move > 9|| checkmove(move) == true )
            {
                System.out.println("Sorry move invalid, try again(1-9): ");
                move = keyboard.nextInt();
                 totalmoves[count] = move;
               
            }
           
            x.move(move);
            x.checkwin();
            if(x.checkwin()== true)
            {
                x.update();
                System.out.print("PLAYER 1 HAS WON, THANKS FOR PLAYING!");
                return;
            }
            x.update();
            count++;
     

}
public boolean checkwin() // checks every possible way of winning and returns boolean
{
    boolean check = false;

    if((board[0]==player1 && board[1]==player1 &&board[2]==player1))
    {
        check = true;
    }
     if((board[3]==player1 && board[4]==player1 &&board[5]==player1))
    {
        check = true;
    }
      if((board[6]==player1 && board[7]==player1 &&board[8]==player1))
    {
        check = true;
    }
       if((board[0]==player1 && board[3]==player1 &&board[6]==player1))
    {
        check = true;
    }
        if((board[1]==player1 && board[4]==player1 &&board[7]==player1))
    {
        check = true;
    }
         if((board[2]==player1 && board[5]==player1 &&board[8]==player1))
    {
        check = true;
    }
          if((board[0]==player1 && board[4]==player1 &&board[8]==player1))
    {
        check = true;
    }
          if((board[2]==player1 && board[4]==player1 &&board[6]==player1))
    {
        check = true;
    }
          if((board[0]==player2 && board[1]==player2 &&board[2]==player2))
    {
        check = true;
    }
     if((board[3]==player2 && board[4]==player2 &&board[5]==player2))
    {
        check = true;
    }
      if((board[6]==player2 && board[7]==player2 &&board[8]==player2))
    {
        check = true;
    }
       if((board[0]==player2 && board[3]==player2 &&board[6]==player2))
    {
        check = true;
    }
        if((board[1]==player2 && board[4]==player2 &&board[7]==player2))
    {
        check = true;
    }
         if((board[2]==player2 && board[5]==player2 &&board[8]==player2))
    {
        check = true;
    }
          if((board[0]==player2 && board[4]==player2 &&board[8]==player2))
    {
        check = true;
    }
           if((board[2]==player2 && board[4]==player2 &&board[6]==player2))
    {
        check = true;
    }
    
    return check;
            
}
public boolean checkmove(int i)
{
    /*method is used to store an integer array(totalmoves) of moves played.
    this is then checked every turn to ensure no move is played twice.
    Count is used here as an index for array totalmoves.
    
    */
    boolean movecheck = false;
  totalmoves[count] = i;
    if (count > 0)
    {
    for(int j = 1; j <= count;j++)
    {
        if(i==totalmoves[count-j])
        {
            movecheck = true;
            
        }
    }
    
    }
   
  
    return movecheck;
}
public void update()//updating our board
{
    System.out.println(" "+board[0]+" "+"|"+" "+board[1]+" "+"|"+" "+board[2]+" ");
    System.out.println("-----------");
    System.out.println(" "+board[3]+" "+"|"+" "+board[4]+" "+"|"+" "+board[5]+" ");
     System.out.println("-----------");
    System.out.println(" "+board[6]+" "+"|"+" "+board[7]+" "+"|"+" "+board[8]+" ");
}

 
    
}
