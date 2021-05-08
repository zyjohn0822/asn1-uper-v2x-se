/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "RSI"
 */
package com.hisense.hiatmp.asn.v2x.RSI;

import org.asnlab.asndt.runtime.conv.*;
import org.asnlab.asndt.runtime.conv.annotation.Component;
import org.asnlab.asndt.runtime.type.AsnType;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class RTEData {

    public final static AsnType TYPE = RSI.type(65580);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(RTEData.class);
        AsnConverter rteIdConverter = IntegerConverter.INSTANCE;
        AsnConverter eventTypeConverter = EventType.CONV;
        AsnConverter eventSourceConverter = EventSource.CONV;
        AsnConverter eventPosConverter = PositionOffsetLLV.CONV;
        AsnConverter eventRadiusConverter = Radius.CONV;
        AsnConverter descriptionConverter = Description.CONV;
        AsnConverter timeDetailsConverter = RSITimeDetails.CONV;
        AsnConverter priorityConverter = RSIPriority.CONV;
        AsnConverter referencePathsConverter = ReferencePathList.CONV;
        AsnConverter referenceLinksConverter = ReferenceLinkList.CONV;
        AsnConverter eventConfidenceConverter = Confidence.CONV;
        CONV.setComponentConverters(new AsnConverter[]{rteIdConverter, eventTypeConverter, eventSourceConverter, eventPosConverter, eventRadiusConverter, descriptionConverter, timeDetailsConverter, priorityConverter, referencePathsConverter, referenceLinksConverter, eventConfidenceConverter});
    }

    @NotNull
    @Min(0L)
    @Max(255L)
    @Component(0)
    public Integer rteId;
    @NotNull
    @Component(1)
    public Integer eventType;
    @NotNull
    @Component(2)
    public EventSource eventSource;
    @Null
    @Component(3)
    public PositionOffsetLLV eventPos;    /* OPTIONAL */
    @Null
    @Component(4)
    public Integer eventRadius;    /* OPTIONAL */
    @Null
    @Component(5)
    public Description description;    /* OPTIONAL */
    @Null
    @Component(6)
    public RSITimeDetails timeDetails;    /* OPTIONAL */
    @Null
    @Component(7)
    public byte[] priority;    /* OPTIONAL */
    @Null
    @Component(8)
    public Vector<ReferencePath> referencePaths;    /* OPTIONAL */
    @Null
    @Component(9)
    public Vector<ReferenceLink> referenceLinks;    /* OPTIONAL */
    @Null
    @Component(10)
    public Integer eventConfidence;    /* OPTIONAL */

    public static RTEData ber_decode(InputStream in) throws IOException {
        return (RTEData) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static RTEData per_decode(boolean align, InputStream in) throws IOException {
        return (RTEData) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RTEData)) {
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