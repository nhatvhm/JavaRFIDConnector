/**
 * @version January 28, 2015
 * @author Sean Spurlin
 *
 * RFIDReader is an interface for interacting with the RFID reader. It only includes the bare methods needed to setup
 * the RFID reader and then have the reader begin reading tags.
 */
public interface RFIDReader {
	/**
	 * Function:		startReader
	 * 
	 * Precondition:	readerBootstrap has been called and the reader has a hostname and a ReaderLocation
	 * Postcondition:	The implementing class will begin reading RFID tags and adding them to a collection of read tags
	 */
	public void startReader();
	/**
	 * Function:		 readerBootstrap
	 * 
	 * Precondition:	 The RFID reader is connected to the computer running this software
	 * Postcondition:	 The software RFID reader knows the hostname and the location of the hardware RFID reader
	 * @param hostname - The IP address/hostname of the hardware RFID reader
	 * @param location - The location of the hardware RFID reader (ex. at the entrance of the store floor. See ReaderLocation)
	 */
	public void readerBootstrap(String hostname, ReaderLocation location);
}
