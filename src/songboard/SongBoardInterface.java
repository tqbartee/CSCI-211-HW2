package songboard;

/** Interface for objects that can be sold. */
public interface SongBoardInterface {

	// Print the top ten songs (from the array: may be sorted/unsorted)
	void printTopTen();

	// Use pseudo-random generator to scramble the board
	void scrambleBoard();

	// Use insertion sort to sort the board
	//void insertionSortBoard();
	public int[] insertionSortBoard();
} 