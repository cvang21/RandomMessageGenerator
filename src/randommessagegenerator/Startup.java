/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

/**
 *
 * @author cvadmin
 */
public class Startup {
    public static void main(String[] args) {
         MessageGenerator readerBoard = new ReaderBoard();
         readerBoard.addNewMessage("Message A");
         readerBoard.addNewMessage("Message B");
         readerBoard.addNewMessage("Message C");
         
         System.out.println(readerBoard.generateRandomMessage());
         System.out.println(readerBoard.generateRandomMessage());      
    }

    
}
