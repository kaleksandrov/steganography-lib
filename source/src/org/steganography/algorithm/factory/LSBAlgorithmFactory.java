package org.steganography.algorithm.factory;

import org.steganography.algorithm.SteganographyAlgorithm;
import org.steganography.algorithm.impl.LSBAlgorithm;

/**
 * Implementation of the {@link SteganographyAlgorithmFactory} class. Creates
 * {@link SteganographyAlgorithm} objects.
 * 
 * @author kaleksandrov
 * 
 */
public class LSBAlgorithmFactory extends SteganographyAlgorithmFactory {

	/**
	 * Creates {@link LSBAlgorithm} object.
	 * 
	 * @return A valid {@link LSBAlgorithm} object.
	 */
	@Override
	public SteganographyAlgorithm createAlgorithm() {
		return new LSBAlgorithm();
	}

}
