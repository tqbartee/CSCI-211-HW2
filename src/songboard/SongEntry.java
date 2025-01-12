package songboard;

// Class for a single song entry (integer rank, string artist, string songname)
public class SongEntry {
	private int rank;
    private String artist;           // name of the person earning this score
    private String songname;         // the score value

    /** Constructs a song entry with given parameters. */
    public SongEntry(int r, String a, String s) {
		rank = r;
        artist = a;
        songname = s;
    }

	// Functions to get private components below

    public int GetRank() { return rank; }
    public String GetArtist() { return artist; }
    public String GetSongName() { return songname; }
 
	// Returns a string representation of this entry. */
    public String SongEntryToString() {
        //return ("(" + rank + ", " + artist + ", " + songname + ")");
		return (rank + ", " + artist + ", " + songname);
    }
}