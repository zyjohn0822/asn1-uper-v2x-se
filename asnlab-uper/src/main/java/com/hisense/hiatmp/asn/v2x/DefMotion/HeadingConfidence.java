/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefMotion"
 */
package com.hisense.hiatmp.asn.v2x.DefMotion;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionEnumeratedConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public enum HeadingConfidence {
    unavailable(0),
    prec10deg(1),
    prec05deg(2),
    prec01deg(3),
    prec0_1deg(4),
    prec0_05deg(5),
    prec0_01deg(6),
    prec0_0125deg(7);

    public final static AsnType TYPE = DefMotion.type(65542);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionEnumeratedConverter(HeadingConfidence.class);
    }

    private int value;

    private HeadingConfidence(int value) {
        this.value = value;
    }

    public static HeadingConfidence valueOf(int value) {
        HeadingConfidence[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].value == value) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("No enum const value for " + value);
    }

    public static HeadingConfidence ber_decode(InputStream in) throws IOException {
        return (HeadingConfidence) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static HeadingConfidence per_decode(boolean align, InputStream in) throws IOException {
        return (HeadingConfidence) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public int value() {
        return value;
    }

    public void ber_encode(OutputStream out) throws IOException {
        TYPE.encode(this, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
    }

    public void per_encode(boolean align, OutputStream out) throws IOException {
        TYPE.encode(this, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
    }


}
