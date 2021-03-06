/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehClass"
 */
package com.hisense.hiatmp.asn.v2x.RSM;

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

public class VehicleClassification {

    public final static AsnType TYPE = RSM.type(589872);
    public final static CompositeConverter CONV;

    static {
        CONV = new AnnotationCompositeConverter(VehicleClassification.class);
        AsnConverter classificationConverter = BasicVehicleClass.CONV;
        AsnConverter fuelTypeConverter = FuelType.CONV;
        CONV.setComponentConverters(new AsnConverter[]{classificationConverter, fuelTypeConverter});
    }

    @NotNull
    @Component(0)
    public Integer classification;
    @Null
    @Component(1)
    public Integer fuelType;    /* OPTIONAL */

    public static VehicleClassification ber_decode(InputStream in) throws IOException {
        return (VehicleClassification) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static VehicleClassification per_decode(boolean align, InputStream in) throws IOException {
        return (VehicleClassification) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VehicleClassification)) {
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
