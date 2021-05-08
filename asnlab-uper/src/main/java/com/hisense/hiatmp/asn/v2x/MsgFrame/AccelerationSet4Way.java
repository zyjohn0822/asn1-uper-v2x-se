/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "DefAcceleration"
 */
package com.hisense.hiatmp.asn.v2x.MsgFrame;

import org.asnlab.asndt.runtime.conv.AnnotationCompositeConverter;
import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.CompositeConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.annotation.Component;
import org.asnlab.asndt.runtime.type.AsnType;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author zhangyong
 */
public class AccelerationSet4Way {

    public final static AsnType TYPE = MsgFrame.type(458776);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(AccelerationSet4Way.class);
        AsnConverter long_Converter = Acceleration.CONV;
        AsnConverter latConverter = Acceleration.CONV;
        AsnConverter vertConverter = VerticalAcceleration.CONV;
        AsnConverter yawConverter = YawRate.CONV;
        CONV.setComponentConverters(new AsnConverter[]{long_Converter, latConverter, vertConverter, yawConverter});
    }

    @NotNull
    @Component(0)
    public Integer long_;
    @NotNull
    @Component(1)
    public Integer lat;
    @NotNull
    @Component(2)
    public Integer vert;
    @NotNull
    @Component(3)
    public Integer yaw;

    public static AccelerationSet4Way ber_decode(InputStream in) throws IOException {
        return (AccelerationSet4Way) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static AccelerationSet4Way per_decode(boolean align, InputStream in) throws IOException {
        return (AccelerationSet4Way) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AccelerationSet4Way)) {
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
        sb.append("\"long_\":")
                .append(long_);
        sb.append(",\"lat\":")
                .append(lat);
        sb.append(",\"vert\":")
                .append(vert);
        sb.append(",\"yaw\":")
                .append(yaw);
        sb.append('}');
        return sb.toString();
    }
}
