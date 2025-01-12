package songboard;

import java.io.*;

/** Class for storing song rankings, initially read from CSV */
public class SongBoard implements SongBoardInterface {
            
    private int numEntries;        	// number of actual entries                                                                 
	private String songBoardTitle;
    private SongEntry[] songArray;      // array of game entries (names & scores)                                       
	
    /** Constructs a SongBoard with the given capacity for storing entries. */
    public SongBoard() {
		numEntries = 200;
        songArray = new SongEntry[numEntries];
		songBoardTitle = "Shazam Top 200 Songs";
		String filePath;
		// Replace below with full path if this doesn't work
		filePath = "./input.csv";
		int count = 0;
		// Read the records from the .csv file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
				// Remove non-numeric characters to support convert to int
				values[0] = values[0].replaceAll("[^\\d]", "");
				SongEntry thisSongEntry = new SongEntry(Integer.parseInt(values[0]), values[1], values[2]);
				songArray[count] = thisSongEntry;
				count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		// FUTURE: Sort entries here (current .csv file is already sorted now; add 
		// to accomodate unsorted files later)
	}
	
	public void printTopTen() {
		int rank;
		String artist;
		String songname;
		// Print header
		System.out.println(songBoardTitle);
		System.out.println("The Top Ten Are:");
		for (int i = 0; i < 10; i++) {
			rank = songArray[i].GetRank();
			artist = songArray[i].GetArtist();
			songname = songArray[i].GetSongName();
			System.out.println(rank + ", " + artist + ", " + songname);
		}
	}
}
