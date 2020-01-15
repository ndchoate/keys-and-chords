/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndchoate
 */
public class Key {
    public String name;
    public Chord[] chordsOfKeyArray;
    
    public Key()
    {
        this.name = "";
        this.chordsOfKeyArray = null;
    }
    
    public Key(String inName, Chord[] inChordsOfKeyArray)
    {
        this.name = inName;
        this.chordsOfKeyArray = inChordsOfKeyArray;
    }
}
