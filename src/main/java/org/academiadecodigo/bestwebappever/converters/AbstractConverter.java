package org.academiadecodigo.bestwebappever.converters;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic converter to be used as a base for concrete converter implementations
 * @param <S> the source type
 * @param <T> the target type
 */
public abstract class AbstractConverter<S, T> implements Converter<S, T> {

    /**
     * Converts the source list of type S to target type T
     *
     * @param listToConvert the list to convert
     * @return the list of converted elements
     */

    @Override
    public List<T> convert(List<S> listToConvert) {
        List<T> conversions = new ArrayList<>(listToConvert.size());

        for (S toConvert : conversions) {
            conversions.add(convert(toConvert));
        }

        return conversions;
    }
}
