package com.julianjupiter.jutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Julian Jupiter
 */
class FactoryTests {
    @Test
    void factory() {
        var factory = new Factory<Language>()
                .add("java", Java::new)
                .add("javascript", JavaScript::new)
                .add("python", Python::new);

        var java = factory.make("java");
        var javaScript = factory.make("javascript");
        var python = factory.make("python");
        var php = factory.make("php");

        Assertions.assertTrue(java.isPresent());
        Assertions.assertTrue(javaScript.isPresent());
        Assertions.assertTrue(python.isPresent());
        Assertions.assertFalse(php.isPresent());
        Assertions.assertTrue(java.orElse(null) instanceof Java);
        Assertions.assertTrue(javaScript.orElse(null) instanceof JavaScript);
        Assertions.assertTrue(python.orElse(null) instanceof Python);
    }
}

interface Language {
    String value();
}

class Java implements Language {

    @Override
    public String value() {
        return "Java";
    }
}

class Python implements Language {

    @Override
    public String value() {
        return "Python";
    }
}

class JavaScript implements Language {

    @Override
    public String value() {
        return "JavaScript";
    }
}
