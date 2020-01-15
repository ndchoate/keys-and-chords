/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndchoate
 */
public class Chord {
    public String name;
    public int startingFret;
    public int[] stringFrets = new int[6];
    public char[] mutedStrings = new char[6];
    public int[] fingerPlacements = new int[6];
    
    public Chord()
    {
        this.name = "";
        this.startingFret = 1;
        for (int i = 0; i < stringFrets.length; i++)
        {
            this.stringFrets[i] = 0;
        }
        for (int i = 0; i < mutedStrings.length; i++)
        {
            this.mutedStrings[i] = 'O';
        }
        this.fingerPlacements = null;
    }
    
    public Chord(String inName, int inStartingFret, int[] inStringFrets, 
                 char[] inMutedStrings, int[] inFingerPlacements)
    {
        this.name = inName;
        this.startingFret = inStartingFret;
        System.arraycopy(inStringFrets, 0, this.stringFrets, 0, 
                         inStringFrets.length);
        System.arraycopy(inMutedStrings, 0, this.mutedStrings, 0, 
                         inMutedStrings.length);
        // TODO: define fingerPlacements assignment for constructor, using
        // null in construction right now until images can be created for 
        // finger placements
        //System.arraycopy(inFingerPlacements, 0, this.fingerPlacements, 0, 
        //                 inFingerPlacements.length);
    }
}
