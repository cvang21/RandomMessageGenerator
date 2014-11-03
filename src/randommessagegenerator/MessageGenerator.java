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
public interface MessageGenerator {
    
    public abstract String generateRandomMessage();
    public abstract void addNewMessage(String msg);

}
