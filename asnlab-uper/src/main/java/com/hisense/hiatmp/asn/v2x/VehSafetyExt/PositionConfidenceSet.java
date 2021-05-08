/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefPosition"
 */
package com.hisense.hiatmp.asn.v2x.VehSafetyExt;

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

public class PositionConfidenceSet {

    public final static AsnType TYPE = VehSafetyExt.type(131092);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(PositionConfidenceSet.class);
        AsnConverter posConverter = PositionConfidence.CONV;
        AsnConverter elevationConverter = ElevationConfidence.CONV;
        CONV.setComponentConverters(new AsnConverter[]{posConverter, elevationConverter});
    }

    @NotNull
    @Component(0)
    public PositionConfidence pos;
    @Null
    @Component(1)
    public ElevationConfidence elevation;    /* OPTIONAL */

    public static PositionConfidenceSet ber_decode(InputStream in) throws IOException {
        return (PositionConfidenceSet) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static PositionConfidenceSet per_decode(boolean align, InputStream in) throws IOException {
        return (PositionConfidenceSet) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PositionConfidenceSet)) {
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
