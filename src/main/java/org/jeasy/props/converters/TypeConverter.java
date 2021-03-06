package org.jeasy.props.converters;

/**
 * Interface for type conversion.
 *
 * @param <S> The source type.
 * @param <T> The target type.
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
@FunctionalInterface
public interface TypeConverter<S, T> {

	/**
	 * Convert a value from a source type to a target type.
	 *
	 * @param source the input value to convert
	 * @return The converted value
	 */
	T convert(S source);
	
}
