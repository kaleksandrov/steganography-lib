package org.steganography.algorithm.factory;

import org.steganography.algorithm.SteganographyAlgorithm;

/**
 * Abstract factory for createing steganography algorithms
 * 
 * @author kaleksandrov
 * 
 */
public abstract class SteganographyAlgorithmFactory {

	/**
	 * Creates {@link SteganographyAlgorithm} objects.
	 * 
	 * @return A valid {@link SteganographyAlgorithm} object.
	 */
	public abstract SteganographyAlgorithm createAlgorithm();
}
