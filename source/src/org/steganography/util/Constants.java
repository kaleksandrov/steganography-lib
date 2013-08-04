package org.steganography.util;

/**
 * Public interface containing all of the constants needed for the application
 * 
 * @author Kiril Aleksandrov
 * 
 */
public interface Constants {

	// Message byte length

	int HIDDEN_MESSAGE_BIT_LENGTH = 32;

	/* Encoding */

	String ENCODING_ERROR_GENERAL = "Error encoding image";

	String ENCODING_ERROR_BIG_MESSAGE = "Too big message";

	/* Decoding */

	String DECODING_ERROR_GENERAL = "Error decoding image";
}
