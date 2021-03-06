/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehSafetyExt"
 */
package com.hisense.hiatmp.asn.v2x.BSM;

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
import java.util.Vector;

public class PathHistory {

    public final static AsnType TYPE = BSM.type(655404);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(PathHistory.class);
        AsnConverter initialPositionConverter = FullPositionVector.CONV;
        AsnConverter currGNSSstatusConverter = GNSSstatus.CONV;
        AsnConverter crumbDataConverter = PathHistoryPointList.CONV;
        CONV.setComponentConverters(new AsnConverter[]{initialPositionConverter, currGNSSstatusConverter, crumbDataConverter});
    }

    @Null
    @Component(0)
    public FullPositionVector initialPosition;    /* OPTIONAL */
    @Null
    @Component(1)
    public GNSSstatus currGNSSstatus;    /* OPTIONAL */
    @NotNull
    @Component(2)
    public Vector<PathHistoryPoint> crumbData;

    public static PathHistory ber_decode(InputStream in) throws IOException {
        return (PathHistory) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static PathHistory per_decode(boolean align, InputStream in) throws IOException {
        return (PathHistory) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PathHistory)) {
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
