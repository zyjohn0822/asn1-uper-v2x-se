/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLane"
 */
package com.hisense.hiatmp.asn.v2x.MapLane;

import org.asnlab.asndt.runtime.conv.AnnotationCompositeConverter;
import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.CompositeConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.annotation.Component;
import org.asnlab.asndt.runtime.type.AsnType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LaneAttributes {

    public final static AsnType TYPE = MapLane.type(65549);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(LaneAttributes.class);
        AsnConverter shareWithConverter = LaneSharing.CONV;
        AsnConverter laneTypeConverter = LaneTypeAttributes.CONV;
        CONV.setComponentConverters(new AsnConverter[]{shareWithConverter, laneTypeConverter});
    }

    @Null
    @Component(0)
    public LaneSharing shareWith;    /* OPTIONAL */
    @NotNull
    @Component(1)
    public LaneTypeAttributes laneType;

    public static LaneAttributes ber_decode(InputStream in) throws IOException {
        return (LaneAttributes) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static LaneAttributes per_decode(boolean align, InputStream in) throws IOException {
        return (LaneAttributes) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LaneAttributes)) {
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
