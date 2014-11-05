/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommessagegenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author cvadmin
 */
public class ReaderBoard implements MessageGenerator {

    private List<String> myList = new ArrayList<>();
    private String messageTxt;
    private int NUM_OF_ITEMS=0;

    @Override
    public String generateRandomMessage() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= NUM_OF_ITEMS; ++idx) {
            randomInt = randomGenerator.nextInt(NUM_OF_ITEMS);

        }
        String s2 = myList.get(randomInt);
        return s2;

    }

    @Override
    public void addNewMessage(String msg) {
        if (msg == null || msg.length() == 0) {
            throw new IllegalArgumentException("Input invalid");
        }
        
        NUM_OF_ITEMS++;
        messageTxt = msg;
        myList.add(messageTxt);
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.messageTxt);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReaderBoard other = (ReaderBoard) obj;
        if (!Objects.equals(this.messageTxt, other.messageTxt)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return myList.toString();
    }
}
