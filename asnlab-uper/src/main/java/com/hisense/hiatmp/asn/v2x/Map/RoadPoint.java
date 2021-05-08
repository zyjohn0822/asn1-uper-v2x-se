/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapPoint"
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

public class RoadPoint {

    public final static AsnType TYPE = Map.type(589845);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(RoadPoint.class);
        AsnConverter posOffsetConverter = PositionOffsetLLV.CONV;
        CONV.setComponentConverters(new AsnConverter[]{posOffsetConverter});
    }

    @NotNull
    @Component(0)
    public PositionOffsetLLV posOffset;

    public static RoadPoint ber_decode(InputStream in) throws IOException {
        return (RoadPoint) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static RoadPoint per_decode(boolean align, InputStream in) throws IOException {
        return (RoadPoint) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RoadPoint)) {
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
