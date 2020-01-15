/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Imports
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ndchoate
 */
public class KeysAndChordsUIModel {
    public static HashMap<String, Key> keysMap = new HashMap<String, Key>();
    public static String[] keysArray = { "C", "G", "D", "A", "E", "B(H)", "Gb/F#", 
                                  "Db", "Ab", "Eb", "Bb", "F" };
    
    // Define all chords
    // C Key (Major)
    // I: C
    public static Chord C = new Chord("C", 1, new int[] {0, 3, 2, 0, 1, 0}, 
                                new char[] {'X', ' ', ' ', 'O', ' ', 'O'}, null);
    // ii: Dm
    public static Chord Dm = new Chord("Dm", 1, new int[] {0, 0, 0, 2, 3, 1}, 
                               new char[] {'X', 'X', 'O', ' ', ' ', ' '}, null);
    // iii: Em
    public static Chord Em = new Chord("Em", 1, new int[] {0, 2, 2, 0, 0, 0}, 
                               new char[] {'O', ' ', ' ', 'O', 'O', 'O'}, null);
    // IV: F
    public static Chord F = new Chord("F", 1, new int[] {0, 0, 3, 2, 1, 1}, 
                               new char[] {'X', 'X', ' ', ' ', ' ', ' '}, null);
    // V: G
    public static Chord G = new Chord("G", 1, new int[] {3, 2, 0, 0, 0, 3}, 
                               new char[] {' ', ' ', 'O', 'O', 'O', ' '}, null);
    // vi: Am
    public static Chord Am = new Chord("Am", 1, new int[] {0, 0, 2, 2, 1, 0}, 
                               new char[] {'X', 'O', ' ', ' ', ' ', 'O'}, null);
    // vii: B_dim
    public static Chord B_dim = new Chord("Bdim", 1, new int[] {0, 2, 3, 4, 3, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // II: D
    public static Chord D = new Chord("D", 1, new int[] {0, 0, 0, 2, 3, 2}, 
                               new char[] {'X', 'X', 'O', ' ', ' ', ' '}, null);
    // III: E
    public static Chord E = new Chord("E", 1, new int[] {0, 2, 2, 1, 0, 0}, 
                               new char[] {'O', ' ', ' ', ' ', 'O', 'O'}, null);
    public static Key C_Key = new Key("C", new Chord[] {C, Dm, Em, F, G, Am, B_dim, D, E});
    
    // G Key (Major)
    // I: G, already defined.
    // ii: Am, already defined.
    // iii: Bm
    public static Chord Bm = new Chord("Bm", 1, new int[] {0, 2, 4, 4, 3, 2}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: C, already defined.
    // V: D, already defined.
    // vi: Em, already defined.
    // vii: F#_dim
    public static Chord F_sharp_dim = new Chord("F#dim", 1, new int[] {2, 3, 4, 2, 0, 0}, 
                               new char[] {' ', ' ', ' ', ' ', 'X', 'X'}, null);
    // II: A
    public static Chord A = new Chord("A", 1, new int[] {0, 0, 2, 2, 2, 0}, 
                               new char[] {'X', 'O', ' ', ' ', ' ', 'O'}, null);
    // III: B
    public static Chord B = new Chord("B", 1, new int[] {0, 2, 4, 4, 4, 2}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    public static Key G_Key = new Key("G", new Chord[] {G, Am, Bm, C, D, Em, 
                                                        F_sharp_dim, A, B});
    
    // D Key
    // I: D, already defined.
    // ii: Em, already defined.
    // iii: F#m
    public static Chord F_sharp_m = new Chord("F#m", 1, new int[] {2, 4, 4, 2, 2, 2}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: G, already defined.
    // V: A: already defined.
    // vi: Bm, already defined.
    // vii: C#dim
    public static Chord C_sharp_dim = new Chord("C#dim", 3, new int[] {0, 0, 0, 6, 5, 3}, 
                               new char[] {'X', 'X', 'X', ' ', ' ', ' '}, null);
    // II: E, already defined.
    // III: F#
    public static Chord F_sharp = new Chord("F#", 1, new int[] {2, 4, 4, 3, 2, 2}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    public static Key D_Key = new Key("D", new Chord[] {D, Em, F_sharp_m, G, A, 
                                                  Bm, C_sharp_dim, E, F_sharp});
    
    // Define A Key
    // I: A, already defined.
    // ii: Bm, already defined.
    // iii: C#m
    public static Chord C_sharp_m = new Chord("C#m", 3, new int[] {0, 4, 6, 6, 5, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // IV: D, already defined.
    // V: E, already defined.
    // vi: F#m, already defined
    // vii: G#dim
    public static Chord G_sharp_dim = new Chord("G#dim", 3, new int[] {4, 5, 6, 4, 0, 0}, 
                               new char[] {' ', ' ', ' ', ' ', 'X', 'X'}, null);
    // II: B, already defined
    // III: C#
    public static Chord C_sharp = new Chord("C#", 1, new int[] {0, 4, 3, 1, 2, 1}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    public static Key A_Key = new Key("A", new Chord[] {A, Bm, C_sharp_m, D, E,
                                                        F_sharp_m, G_sharp_dim,
                                                        B, C_sharp});
    
    // Define E Key
    // I: E, already defined.
    // ii: F#m, already defined.
    // iii: G#m
    public static Chord G_sharp_m = new Chord("G#m", 3, new int[] {4, 6, 6, 4, 4, 4}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: A, already defined.
    // V: B, already defined.
    // vi: C#m, already defined.
    // vii: D#dim
    public static Chord D_sharp_dim = new Chord("D#dim", 5, new int[] {0, 6, 7, 8, 7, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // II: F#, already defined.
    // III: G#
    public static Chord G_sharp = new Chord("G#", 3, new int[] {4, 6, 6, 5, 4, 4}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    public static Key E_Key = new Key("E", new Chord[] { E, F_sharp_m, G_sharp_m,
                                                        A, B, C_sharp_m, D_sharp_dim,
                                                        F_sharp, G_sharp });
    
    // Define B Key
    // I: B, already defined.
    // ii: C#m
    // iii: D#m
    public static Chord D_sharp_m = new Chord("D#m", 5, new int[] {0, 6, 8, 8, 7, 6}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: E
    // V: F#
    // vi: G#m
    // vii: A#dim
    public static Chord A_sharp_dim = new Chord("A#dim", 1, new int[] {0, 1, 2, 3, 2, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // II: C#
    // III: Eb
    public static Chord E_flat = new Chord("Eb", 1, new int[] {0, 0, 1, 3, 4, 3}, 
                               new char[] {'X', 'X', ' ', ' ', ' ', ' '}, null);
    public static Key B_Key = new Key("B(H)", new Chord[] { B, C_sharp_m, D_sharp_m,
                                                            E, F_sharp, G_sharp_m,
                                                            A_sharp_dim, C_sharp,
                                                            E_flat });
    // Define F# key
    // I: F#
    // ii: G#m
    // iii: A#m
    public static Chord A_sharp_m = new Chord("A#m", 1, new int[] {0, 1, 3, 3, 2, 1}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: B
    // V: C#
    // vi: D#m
    // vii: E#dim
    public static Chord E_sharp_dim = new Chord("E#dim", 1, new int[] {1, 2, 3, 1, 0, 0}, 
                               new char[] {' ', ' ', ' ', ' ', 'X', 'X'}, null);
    // II: G#
    // III: Bb
    public static Chord B_flat = new Chord("Bb", 1, new int[] {0, 1, 3, 3, 3, 1}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    public static Key F_sharp_Key = new Key("Gb/F#", new Chord[] { F_sharp, G_sharp_m,
                                                                A_sharp_m, B, C_sharp,
                                                                D_sharp_m, E_sharp_dim,
                                                                G_sharp, B_flat });
    // Define Db/C# key
    // I: Db
    public static Chord D_flat = new Chord("Db", 3, new int[] {0, 4, 6, 6, 6, 4}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    // ii: Ebm
    public static Chord E_flat_m = new Chord("Ebm", 5, new int[] {0, 6, 8, 8, 7, 6}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // iii: Fm
    public static Chord Fm = new Chord("Fm", 1, new int[] {0, 0, 3, 1, 1, 1}, 
                               new char[] {'X', 'X', ' ', ' ', ' ', ' '}, null);
    // IV: Gb
    public static Chord Gb = new Chord("Gb", 1, new int[] {2, 4, 4, 3, 2, 2}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // V: Ab
    public static Chord Ab = new Chord("Ab", 3, new int[] {4, 6, 6, 3, 4, 4}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // vi: Bbm
    public static Chord Bbm = new Chord("Bbm", 1, new int[] {0, 1, 3, 3, 2, 1}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', ' '}, null);
    // vii: Cdim
    public static Chord C_dim = new Chord("Cdim", 1, new int[] {0, 3, 4, 5, 4, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // II: Eb
    // III: F
    public static Key Db_Key = new Key("Db", new Chord[] { D_flat, E_flat_m,
                                        Fm, Gb, Ab, Bbm, C_dim, E_flat, F });
    
    // Define Ab/G# key
    // I: Ab
    // ii: Bbm
    // iii: Cm
    public static Chord Cm = new Chord("Cm", 1, new int[] {0, 3, 1, 0, 1, 0}, 
                               new char[] {'X', ' ', ' ', ' ', ' ', 'X'}, null);
    // IV: Db
    // V: Eb
    public static Chord Eb = new Chord("Eb", 5, new int[] {0, 6, 8, 8, 8, 6}, 
                               new char[] {'O', ' ', ' ', ' ', ' ', ' '}, null);
    // vi: Fm
    // vii: Gdim
    public static Chord G_dim = new Chord("Gdim", 1, new int[] {3, 4, 5, 3, 0, 0}, 
                               new char[] {' ', ' ', ' ', ' ', 'X', 'X'}, null);
    // II: Bb
    // III: C
    public static Key Ab_Key = new Key("Ab", new Chord[] { Ab, Bbm, Cm, D_flat,
                                                           Eb, Fm, G_dim, B_flat, C });
    
    // Define Eb Key
    // I: Eb
    // ii: Fm
    // iii: Gm
    public static Chord Gm = new Chord("Gm", 1, new int[] {3, 5, 5, 3, 3, 3}, 
                               new char[] {' ', ' ', ' ', ' ', ' ', ' '}, null);
    // IV: Ab
    // V: Bb
    // vi: Cm
    // vii: Ddim
    public static Chord D_dim = new Chord("Ddim", 1, new int[] {0, 0, 0, 1, 3, 1}, 
                               new char[] {'X', 'X', 'O', ' ', ' ', ' '}, null);
    // II: F
    // III: G
    public static Key Eb_Key = new Key("Eb", new Chord[] { Eb, Fm, Gm, Ab, B_flat, 
                                                           Cm, D_dim, F, G});
    
    // Define Bb Key
    // I: Bb
    // ii: Cm
    // iii: Dm
    // IV: Eb
    // V: F
    // vi: Gm
    // vii: Adim
    public static Chord A_dim = new Chord("Adim", 1, new int[] {0, 0, 1, 2, 1, 0}, 
                               new char[] {'X', 'O', ' ', ' ', ' ', 'X'}, null);
    // II: C
    // III: D
    public static Key Bb_Key = new Key("Bb", new Chord[] { B_flat, Cm, Dm, Eb, F,
                                                           Gm, A_dim, C, D });
    
    // Define F Key
    // I: F
    // ii: Gm
    // iii: Am
    // IV: Bb
    // V: C
    // vi: Dm
    // vii: Edim
    public static Chord E_dim = new Chord("Edim", 1, new int[] {0, 1, 2, 0, 0, 0}, 
                               new char[] {'O', ' ', ' ', 'O', 'X', 'X'}, null);
    // II: G
    // III: A
    public static Key F_Key = new Key("F", new Chord[] { F, Gm, Am, B_flat, C,
                                                         Dm, E_dim, G, A });
    
    public static void initKeysMap()
    {
        keysMap.put(keysArray[0], C_Key);
        keysMap.put(keysArray[1], G_Key);
        keysMap.put(keysArray[2], D_Key);
        keysMap.put(keysArray[3], A_Key);
        keysMap.put(keysArray[4], E_Key);
        keysMap.put(keysArray[5], B_Key);
        keysMap.put(keysArray[6], F_sharp_Key);
        keysMap.put(keysArray[7], Db_Key);
        keysMap.put(keysArray[8], Ab_Key);
        keysMap.put(keysArray[9], Eb_Key);
        keysMap.put(keysArray[10], Bb_Key);
        keysMap.put(keysArray[11], F_Key);
    }
}
