package net.gcdc.asn1.datatypes;

import java.math.BigInteger;

public abstract class Asn1BigInteger {

    private final BigInteger value;

    public Asn1BigInteger(final BigInteger value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public BigInteger value() {
        return value;
    }

}
