/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapPoint"
 */
package com.hisense.hiatmp.asn.v2x.MapLane;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.VectorConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class PointList {

    public final static AsnType TYPE = MapLane.type(393242);
    public final static AsnConverter CONV = new VectorConverter(RoadPoint.CONV);

    public static void ber_encode(Vector<RoadPoint> object, OutputStream out) throws IOException {
        TYPE.encode(object, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
    }

    public static Vector<RoadPoint> ber_decode(InputStream in) throws IOException {
        return (Vector<RoadPoint>) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static void per_encode(Vector<RoadPoint> object, boolean align, OutputStream out) throws IOException {
        TYPE.encode(object, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
    }

    public static Vector<RoadPoint> per_decode(boolean align, InputStream in) throws IOException {
        return (Vector<RoadPoint>) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }


}
