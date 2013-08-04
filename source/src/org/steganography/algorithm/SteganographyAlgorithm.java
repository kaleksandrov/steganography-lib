package org.steganography.algorithm;

import java.awt.image.BufferedImage;

import org.steganography.exception.SteganographyException;

/**
 * Steganography algorithm interface. Used to provide steganography
 * functionality for endoding and decoding information in and from images.
 * 
 * @author kaleksandrov
 * 
 */
public interface SteganographyAlgorithm {

	/**
	 * Encodes message into the given image.
	 * 
	 * @param image
	 *            The image that will carry the encoded message
	 * @param message
	 *            The message to encoded
	 * @param offset
	 *            The index of the starting byte
	 * @return New image encoded with the message
	 * @throws SteganographyException
	 */
	BufferedImage encode(BufferedImage image, String message, int offset)
			throws SteganographyException;

	/**
	 * Decodes and gets a hidden message (if it exists) from the given image.
	 * 
	 * @param image
	 *            The image to be docoded
	 * @param offset
	 *            The index of the starting byte
	 * @return The message extracted from the image
	 * @throws SteganographyException
	 */
	String decode(BufferedImage image, int offset)
			throws SteganographyException;
}
