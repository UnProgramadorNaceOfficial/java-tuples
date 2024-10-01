package org.example;

import io.vavr.Tuple;
import io.vavr.Tuple4;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

public class Task {

    // String
    public String returningString(){
        return "Hello World";
    }

    // Number
    public Integer returningNumber(){
        return 10;
    }

    // Returning two params - Pair
    public Pair<String, Integer> returningPair(){
        return Pair.ofNonNull("Hello World", 10);
    }

    // Returning three params - Triple
    public Triple<String, Integer, Boolean> returningTriple(){
        return Triple.of("Hello World", 10, true);
    }

    // Returning Four Params - Tuple4
    public Tuple4<String, Integer, Boolean, Character> returningTuple4(){
        return Tuple.of("String", 10, true, '@');
    }
}
