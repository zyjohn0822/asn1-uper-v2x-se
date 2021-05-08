/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefTime"
 */
package com.hisense.hiatmp.asn.v2x.BSM;

import org.asnlab.asndt.runtime.conv.AnnotationCompositeConverter;
import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.CompositeConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.annotation.Component;
import org.asnlab.asndt.runtime.type.AsnType;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DDateTime {

    public final static AsnType TYPE = BSM.type(131118);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(DDateTime.class);
        AsnConverter yearConverter = DYear.CONV;
        AsnConverter monthConverter = DMonth.CONV;
        AsnConverter dayConverter = DDay.CONV;
        AsnConverter hourConverter = DHour.CONV;
        AsnConverter minuteConverter = DMinute.CONV;
        AsnConverter secondConverter = DSecond.CONV;
        AsnConverter offsetConverter = DTimeOffset.CONV;
        CONV.setComponentConverters(new AsnConverter[]{yearConverter, monthConverter, dayConverter, hourConverter, minuteConverter, secondConverter, offsetConverter});
    }

    @Null
    @Component(0)
    public Integer year;    /* OPTIONAL */
    @Null
    @Component(1)
    public Integer month;    /* OPTIONAL */
    @Null
    @Component(2)
    public Integer day;    /* OPTIONAL */
    @Null
    @Component(3)
    public Integer hour;    /* OPTIONAL */
    @Null
    @Component(4)
    public Integer minute;    /* OPTIONAL */
    @Null
    @Component(5)
    public Integer second;    /* OPTIONAL */
    @Null
    @Component(6)
    public Integer offset;    /* OPTIONAL */

    public static DDateTime ber_decode(InputStream in) throws IOException {
        return (DDateTime) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static DDateTime per_decode(boolean align, InputStream in) throws IOException {
        return (DDateTime) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DDateTime)) {
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
