package com.julianjupiter.jutils;

/**
 * @author Julian Jupiter
 */
public final class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 first, T2 second) {
        return new Pair<>(first, second);
    }

    public T1 first() {
        return first;
    }

    public T2 second() {
        return second;
    }
}
