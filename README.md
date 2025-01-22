Code provided: SongBoard Implementation, Version 2.

The SongBoard object represents the top 200 songs as requested by Shazam site users (these are read from a .csv file provided by Shazam, with entries for numeric rank, artist, and song). The code illustrates many features described in Chapter 1 and Chapter 2 of "Data Structures & Algorithms in Java, 6th Edition." The code also shows how .csv files are read, a commonly provided store of data from third party Web Sites.

For Version2, the code includes method ScrambleBoard, which randomizes the pre-sorted board.

Initial assignment:
Part 1: Read chapter 3 from the book. Sections 3.1 to 3.3 are relevant to this assignment.

Part 2: Download the code items (SongBoard.java, SongBoardInterface.java, and SongEntry.java) and the Shazam song file (input.csv) from the repo (should work with IntelliJ).
Run the main block in SongBoard.java (javac SongBoard). Verify that ten songs are displayed. 
Look over the .java files and gain an understanding that the primary component of the SongBoard.java object is an array of SongEntry objects. Understand how the scrambleBoard code randomizes the array of SongEntry objects so we can run a new sort and test.

Part 3: Modify the SongBoard.java file to add sorting code to insertionSortBoard() to sort the SongBoard, using the code in book section 3.2 for insertion sort. Edit the code to work with the current components (array of objects vs. char). Verify that the sorting works properly and generates the same output as the initial pre-sorted file.

The primary assignment submittal will be the .java code for insertionSortBoard, which should work with the original project. I will ask you to e-mail this code to me for now. We expect to create smoother processes soon through BlackBoard.

Thanks,
