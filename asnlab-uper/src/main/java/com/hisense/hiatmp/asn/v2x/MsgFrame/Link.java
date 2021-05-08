/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLink"
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
import java.util.Vector;

/**
 * @author zhangyong
 */
public class Link {

    public final static AsnType TYPE = MsgFrame.type(1048674);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(Link.class);
        AsnConverter nameConverter = DescriptiveName.CONV;
        AsnConverter upstreamNodeIdConverter = NodeReferenceID.CONV;
        AsnConverter speedLimitsConverter = SpeedLimitList.CONV;
        AsnConverter linkWidthConverter = LaneWidth.CONV;
        AsnConverter pointsConverter = PointList.CONV;
        AsnConverter movementsConverter = MovementList.CONV;
        AsnConverter lanesConverter = LaneList.CONV;
        CONV.setComponentConverters(new AsnConverter[]{nameConverter, upstreamNodeIdConverter, speedLimitsConverter, linkWidthConverter, pointsConverter, movementsConverter, lanesConverter});
    }

    /**
     * OPTIONAL
     */
    @Null
    @Component(0)
    public String name;
    @NotNull
    @Component(1)
    public NodeReferenceID upstreamNodeId;
    /**
     * OPTIONAL
     */
    @Null
    @Component(2)
    public Vector<RegulatorySpeedLimit> speedLimits;
    /**
     * OPTIONAL
     */
    @Null
    @Component(3)
    public Integer linkWidth;
    /**
     * OPTIONAL
     */
    @Null
    @Component(4)
    public Vector<RoadPoint> points;
    /**
     * OPTIONAL
     */
    @Null
    @Component(5)
    public Vector<Movement> movements;
    @NotNull
    @Component(6)
    public Vector<Lane> lanes;

    public static Link ber_decode(InputStream in) throws IOException {
        return (Link) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static Link per_decode(boolean align, InputStream in) throws IOException {
        return (Link) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Link)) {
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
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"upstreamNodeId\":")
                .append(upstreamNodeId);
        sb.append(",\"speedLimits\":")
                .append(speedLimits);
        sb.append(",\"linkWidth\":")
                .append(linkWidth);
        sb.append(",\"points\":")
                .append(points);
        sb.append(",\"movements\":")
                .append(movements);
        sb.append(",\"lanes\":")
                .append(lanes);
        sb.append('}');
        return sb.toString();
    }
}