/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehStatus"
 */
package com.hisense.hiatmp.asn.v2x.RSM;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionEnumeratedConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public enum TransmissionState {
    neutral(0),
    park(1),
    forwardGears(2),
    reverseGears(3),
    reserved1(4),
    reserved2(5),
    reserved3(6),
    unavailable(7);

    public final static AsnType TYPE = RSM.type(327712);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionEnumeratedConverter(TransmissionState.class);
    }

    private int value;

    private TransmissionState(int value) {
        this.value = value;
    }

    public static TransmissionState valueOf(int value) {
        TransmissionState[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].value == value) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("No enum const value for " + value);
    }

    public static TransmissionState ber_decode(InputStream in) throws IOException {
        return (TransmissionState) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static TransmissionState per_decode(boolean align, InputStream in) throws IOException {
        return (TransmissionState) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
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
