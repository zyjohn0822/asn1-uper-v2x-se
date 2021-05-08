/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefPositionOffset"
 */
package com.hisense.hiatmp.asn.v2x.BSM;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.IntegerConverter;
import org.asnlab.asndt.runtime.type.AsnType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class VertOffset_B11 {


    public final static AsnType TYPE = BSM.type(720972);
    public final static AsnConverter CONV = IntegerConverter.INSTANCE;

    public static void ber_encode(Integer object, OutputStream out) throws IOException {
        TYPE.encode(object, EncodingRules.BASIC_ENCODING_RULES, CONV, out);
    }

    public static Integer ber_decode(InputStream in) throws IOException {
        return (Integer) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static void per_encode(Integer object, boolean align, OutputStream out) throws IOException {
        TYPE.encode(object, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV, out);
    }

    public static Integer per_decode(boolean align, InputStream in) throws IOException {
        return (Integer) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }


}
