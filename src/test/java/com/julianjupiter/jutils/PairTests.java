package com.julianjupiter.jutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Julian Jupiter
 */
class PairTests {
    @Test
    void createPairByConstructorTest() {
        var name = new Pair<>("James", "Gosling");

        Assertions.assertEquals("James", name.first());
        Assertions.assertEquals("Gosling", name.second());
    }

    @Test
    void createPairByFactoryMethodTest() {
        var name = Pair.of("Java", 25);

        Assertions.assertEquals("Java", name.first());
        Assertions.assertEquals(25, name.second());
    }
}
