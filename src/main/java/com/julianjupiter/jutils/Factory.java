package com.julianjupiter.jutils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Julian Jupiter
 */
public class Factory<T> {
    private final System.Logger logger = System.getLogger(Factory.class.getName());
    private final Map<String, Supplier<T>> types = new HashMap<>();

    public Optional<T> make(String type) {
        var typeSupplier = types.get(type);
        if (typeSupplier == null) {
            if (logger.isLoggable(System.Logger.Level.ERROR)) {
                logger.log(System.Logger.Level.ERROR, () -> "type " + type + " is unknown");
            }

            return Optional.empty();
        }

        return Optional.of(typeSupplier.get());
    }

    public Factory<T> add(String type, Supplier<T> builder) {
        types.put(type, builder);

        return this;
    }
}
