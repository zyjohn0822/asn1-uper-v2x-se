/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLane"
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

public class ConnectingLane {

    public final static AsnType TYPE = MapNode.type(393276);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(ConnectingLane.class);
        AsnConverter laneConverter = LaneID.CONV;
        AsnConverter maneuverConverter = AllowedManeuvers.CONV;
        CONV.setComponentConverters(new AsnConverter[]{laneConverter, maneuverConverter});
    }

    @NotNull
    @Component(0)
    public Integer lane;
    @Null
    @Component(1)
    public AllowedManeuvers maneuver;    /* OPTIONAL */

    public static ConnectingLane ber_decode(InputStream in) throws IOException {
        return (ConnectingLane) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static ConnectingLane per_decode(boolean align, InputStream in) throws IOException {
        return (ConnectingLane) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectingLane)) {
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