/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLane"
 */
package com.hisense.hiatmp.asn.v2x.MsgFrame;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.VectorConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class LaneList {

    public final static AsnType TYPE = MsgFrame.type(1179756);
    public final static AsnConverter CONV = new VectorConverter(Lane.CONV);

    public static void ber_encode(Vector<Lane> object, OutputStream out) throws IOException {
        TYPE.encode(object, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
    }

    public static Vector<Lane> ber_decode(InputStream in) throws IOException {
        return (Vector<Lane>) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static void per_encode(Vector<Lane> object, boolean align, OutputStream out) throws IOException {
        TYPE.encode(object, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
    }

    public static Vector<Lane> per_decode(boolean align, InputStream in) throws IOException {
        return (Vector<Lane>) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }


}
