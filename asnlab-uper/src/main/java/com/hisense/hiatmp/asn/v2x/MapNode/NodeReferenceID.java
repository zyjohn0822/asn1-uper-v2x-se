/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapNode"
 */
package com.hisense.hiatmp.asn.v2x.MapNode;

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

public class NodeReferenceID {

    public final static AsnType TYPE = MapNode.type(65540);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(NodeReferenceID.class);
        AsnConverter regionConverter = RoadRegulatorID.CONV;
        AsnConverter idConverter = NodeID.CONV;
        CONV.setComponentConverters(new AsnConverter[]{regionConverter, idConverter});
    }

    @Null
    @Component(0)
    public Integer region;    /* OPTIONAL */
    @NotNull
    @Component(1)
    public Integer id;

    public static NodeReferenceID ber_decode(InputStream in) throws IOException {
        return (NodeReferenceID) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static NodeReferenceID per_decode(boolean align, InputStream in) throws IOException {
        return (NodeReferenceID) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NodeReferenceID)) {
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
