package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListMoveOperationsTest {
    @Test
    void sendListToText() {
        ArrayList aList = new ArrayList();
        ArrayList names = new ArrayList();
        ArrayList complete = new ArrayList();
        aList.add("name");
        names.add("name");
        complete.add("incomplete");

        ArrayList bList = new ArrayList();
        bList.add(" ");
        bList.clear();

        ListMoveOperations tManage = new ListMoveOperations(aList,names,complete,"test.txt");
        tManage.sendListToText();
        bList = tManage.recListFromText();
        String expected = "[name]";
        String actual = (String)bList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void recListFromText() {
        ArrayList aList = new ArrayList();
        ArrayList names = new ArrayList();
        ArrayList complete = new ArrayList();
        aList.add("name");
        names.add("name");
        complete.add("incomplete");

        ArrayList bList = new ArrayList();
        bList.add(" ");
        bList.clear();

        ListMoveOperations tManage = new ListMoveOperations(aList,names,complete,"test.txt");
        tManage.sendListToText();
        bList = tManage.recListFromText();
        String expected = "[name]";
        String actual = (String)bList.get(0);
        assertEquals(expected, actual);
    }


    //17)save single list of items into external storage
    //make object for listmoveoperations with presets

    //use function that will write this into a junk text
    //use function to read junk text
    //expected and actual string variables will be composed of both of these items.
    //check for a match


    //18)save multiple items into external storage
    //make object for listmoveoperations with presets

    //use function that will write this into a junk text
    //use function to read junk text
    //expected and actual string variables will be composed of both of these items.
    //check for a match
    //same operation larger scale
    //list of lists for interface

    //19)read and load single list of items into external storage
    //make object for listmoveoperations with presets

    //use function that will read and load this into a junk text into new list
    //have a junk test for this to read
    //expected and actual string variables will be composed of both of these items.
    //check for a match

    //20)read and load multiple of items into external storage
    //make object for listmoveoperations with presets
    //basic formatting is going to go very similarly
    //use function that will read and load this into a junk text into new list
    //have a junk test for this to read
    //expected and actual string variables will be composed of both of these items.
    //check for a match

}