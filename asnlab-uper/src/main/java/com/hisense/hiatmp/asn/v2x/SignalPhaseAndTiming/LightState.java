/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "SPATIntersectionState"
 */
package com.hisense.hiatmp.asn.v2x.SignalPhaseAndTiming;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionEnumeratedConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public enum LightState {
    unavailable(0),
    dark(1),
    flashing_red(2),
    red(3),
    flashing_green(4),
    permissive_green(5),
    protected_green(6),
    yellow(7),
    flashing_yellow(8);

    public final static AsnType TYPE = SignalPhaseAndTiming.type(262161);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionEnumeratedConverter(LightState.class);
    }

    private int value;

    private LightState(int value) {
        this.value = value;
    }

    public static LightState valueOf(int value) {
        LightState[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].value == value) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("No enum const value for " + value);
    }

    public static LightState ber_decode(InputStream in) throws IOException {
        return (LightState) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static LightState per_decode(boolean align, InputStream in) throws IOException {
        return (LightState) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
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
