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
    MessageGenerator readerBoard = new ReaderBoard();
    readerBoard.addNewMessage("message 1");
    readerBoard.addNewMessage("Message 2");
    readerBoard.addNewMessage("Message 3");
    readerBoard.generateRandomMessage();
}