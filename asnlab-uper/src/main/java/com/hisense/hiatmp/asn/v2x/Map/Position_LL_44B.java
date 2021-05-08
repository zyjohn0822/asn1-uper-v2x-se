/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefPositionOffset"
 */
package com.hisense.hiatmp.asn.v2x.Map;

import org.asnlab.asndt.runtime.conv.AnnotationCompositeConverter;
import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.CompositeConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.annotation.Component;
import org.asnlab.asndt.runtime.type.AsnType;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Position_LL_44B {

    public final static AsnType TYPE = Map.type(655392);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(Position_LL_44B.class);
        AsnConverter lonConverter = OffsetLL_B22.CONV;
        AsnConverter latConverter = OffsetLL_B22.CONV;
        CONV.setComponentConverters(new AsnConverter[]{lonConverter, latConverter});
    }

    @NotNull
    @Component(0)
    public Integer lon;
    @NotNull
    @Component(1)
    public Integer lat;

    public static Position_LL_44B ber_decode(InputStream in) throws IOException {
        return (Position_LL_44B) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static Position_LL_44B per_decode(boolean align, InputStream in) throws IOException {
        return (Position_LL_44B) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Position_LL_44B)) {
            return false;
        }
        return TYPE.equals(this, obj, CONV);
    }

    public void ber_encode(OutputStream out) throws IOException {
        TYPE.encode(this, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
    }

    public void per_encode(boolean align, OutputStream out) throws IOException {
        TYPE.encode(this, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
    }


}
