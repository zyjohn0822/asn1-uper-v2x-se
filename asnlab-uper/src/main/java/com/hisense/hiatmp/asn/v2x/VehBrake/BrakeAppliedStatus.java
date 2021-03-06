/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehBrake"
 */
package com.hisense.hiatmp.asn.v2x.VehBrake;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BrakeAppliedStatus extends BitString {

    public static final int unavailable = 0;
    public static final int leftFront = 1;
    public static final int leftRear = 2;
    public static final int rightFront = 3;
    public static final int rightRear = 4;
    public final static AsnType TYPE = VehBrake.type(65538);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(BrakeAppliedStatus.class);
    }

    public BrakeAppliedStatus(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public BrakeAppliedStatus(int size) {
        super(size);
    }

    public BrakeAppliedStatus() {
        super(0);
    }

    public static BrakeAppliedStatus ber_decode(InputStream in) throws IOException {
        return (BrakeAppliedStatus) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static BrakeAppliedStatus per_decode(boolean align, InputStream in) throws IOException {
        return (BrakeAppliedStatus) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getUnavailable() {
        return getBit(unavailable);
    }

    public void setUnavailable() {
        setBit(unavailable, true);
    }

    public void clearUnavailable() {
        setBit(unavailable, false);
    }

    public boolean getLeftFront() {
        return getBit(leftFront);
    }

    public void setLeftFront() {
        setBit(leftFront, true);
    }

    public void clearLeftFront() {
        setBit(leftFront, false);
    }

    public boolean getLeftRear() {
        return getBit(leftRear);
    }

    public void setLeftRear() {
        setBit(leftRear, true);
    }

    public void clearLeftRear() {
        setBit(leftRear, false);
    }

    public boolean getRightFront() {
        return getBit(rightFront);
    }

    public void setRightFront() {
        setBit(rightFront, true);
    }

    public void clearRightFront() {
        setBit(rightFront, false);
    }

    public boolean getRightRear() {
        return getBit(rightRear);
    }

    public void setRightRear() {
        setBit(rightRear, true);
    }

    public void clearRightRear() {
        setBit(rightRear, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrakeAppliedStatus)) {
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
