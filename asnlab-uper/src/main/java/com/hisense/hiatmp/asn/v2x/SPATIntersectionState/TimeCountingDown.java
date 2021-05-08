/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "SPATIntersectionState"
 */
package com.hisense.hiatmp.asn.v2x.SPATIntersectionState;

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

public class TimeCountingDown {

    public final static AsnType TYPE = SPATIntersectionState.type(65542);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(TimeCountingDown.class);
        AsnConverter startTimeConverter = TimeMark.CONV;
        AsnConverter minEndTimeConverter = TimeMark.CONV;
        AsnConverter maxEndTimeConverter = TimeMark.CONV;
        AsnConverter likelyEndTimeConverter = TimeMark.CONV;
        AsnConverter timeConfidenceConverter = Confidence.CONV;
        AsnConverter nextStartTimeConverter = TimeMark.CONV;
        AsnConverter nextDurationConverter = TimeMark.CONV;
        CONV.setComponentConverters(new AsnConverter[]{startTimeConverter, minEndTimeConverter, maxEndTimeConverter, likelyEndTimeConverter, timeConfidenceConverter, nextStartTimeConverter, nextDurationConverter});
    }

    @NotNull
    @Component(0)
    public Integer startTime;
    @Null
    @Component(1)
    public Integer minEndTime;    /* OPTIONAL */
    @Null
    @Component(2)
    public Integer maxEndTime;    /* OPTIONAL */
    @NotNull
    @Component(3)
    public Integer likelyEndTime;
    @Null
    @Component(4)
    public Integer timeConfidence;    /* OPTIONAL */
    @Null
    @Component(5)
    public Integer nextStartTime;    /* OPTIONAL */
    @Null
    @Component(6)
    public Integer nextDuration;    /* OPTIONAL */

    public static TimeCountingDown ber_decode(InputStream in) throws IOException {
        return (TimeCountingDown) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static TimeCountingDown per_decode(boolean align, InputStream in) throws IOException {
        return (TimeCountingDown) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TimeCountingDown)) {
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