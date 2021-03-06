/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "RSI"
 */
package com.hisense.hiatmp.asn.v2x.MsgFrame;

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

/**
 * @author zhangyong
 */
public class ReferenceLink {

    public final static AsnType TYPE = MsgFrame.type(1507485);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(ReferenceLink.class);
        AsnConverter upstreamNodeIdConverter = NodeReferenceID.CONV;
        AsnConverter downstreamNodeIdConverter = NodeReferenceID.CONV;
        AsnConverter referenceLanesConverter = ReferenceLanes.CONV;
        CONV.setComponentConverters(new AsnConverter[]{upstreamNodeIdConverter, downstreamNodeIdConverter, referenceLanesConverter});
    }

    @NotNull
    @Component(0)
    public NodeReferenceID upstreamNodeId;
    @NotNull
    @Component(1)
    public NodeReferenceID downstreamNodeId;
    /**
     * OPTIONAL
     */
    @Null
    @Component(2)
    public ReferenceLanes referenceLanes;

    public static ReferenceLink ber_decode(InputStream in) throws IOException {
        return (ReferenceLink) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static ReferenceLink per_decode(boolean align, InputStream in) throws IOException {
        return (ReferenceLink) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ReferenceLink)) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"upstreamNodeId\":")
                .append(upstreamNodeId);
        sb.append(",\"downstreamNodeId\":")
                .append(downstreamNodeId);
        sb.append(",\"referenceLanes\":")
                .append(referenceLanes);
        sb.append('}');
        return sb.toString();
    }
}
