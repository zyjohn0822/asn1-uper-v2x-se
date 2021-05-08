/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLane"
 */
package com.hisense.hiatmp.asn.v2x.MsgFrame;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author zhangyong
 */
public class LaneAttributes_Bike extends BitString {

    public static final int bikeRevocableLane = 0;
    public static final int pedestrianUseAllowed = 1;
    public static final int isBikeFlyOverLane = 2;
    public static final int fixedCycleTime = 3;
    public static final int biDirectionalCycleTimes = 4;
    public static final int isolatedByBarrier = 5;
    public static final int unsignalizedSegmentsPresent = 6;
    public final static AsnType TYPE = MsgFrame.type(1179764);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(LaneAttributes_Bike.class);
    }

    public LaneAttributes_Bike(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public LaneAttributes_Bike(int size) {
        super(size);
    }

    public LaneAttributes_Bike() {
        super(0);
    }

    public static LaneAttributes_Bike ber_decode(InputStream in) throws IOException {
        return (LaneAttributes_Bike) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static LaneAttributes_Bike per_decode(boolean align, InputStream in) throws IOException {
        return (LaneAttributes_Bike) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getBikeRevocableLane() {
        return getBit(bikeRevocableLane);
    }

    public void setBikeRevocableLane() {
        setBit(bikeRevocableLane, true);
    }

    public void clearBikeRevocableLane() {
        setBit(bikeRevocableLane, false);
    }

    public boolean getPedestrianUseAllowed() {
        return getBit(pedestrianUseAllowed);
    }

    public void setPedestrianUseAllowed() {
        setBit(pedestrianUseAllowed, true);
    }

    public void clearPedestrianUseAllowed() {
        setBit(pedestrianUseAllowed, false);
    }

    public boolean getIsBikeFlyOverLane() {
        return getBit(isBikeFlyOverLane);
    }

    public void setIsBikeFlyOverLane() {
        setBit(isBikeFlyOverLane, true);
    }

    public void clearIsBikeFlyOverLane() {
        setBit(isBikeFlyOverLane, false);
    }

    public boolean getFixedCycleTime() {
        return getBit(fixedCycleTime);
    }

    public void setFixedCycleTime() {
        setBit(fixedCycleTime, true);
    }

    public void clearFixedCycleTime() {
        setBit(fixedCycleTime, false);
    }

    public boolean getBiDirectionalCycleTimes() {
        return getBit(biDirectionalCycleTimes);
    }

    public void setBiDirectionalCycleTimes() {
        setBit(biDirectionalCycleTimes, true);
    }

    public void clearBiDirectionalCycleTimes() {
        setBit(biDirectionalCycleTimes, false);
    }

    public boolean getIsolatedByBarrier() {
        return getBit(isolatedByBarrier);
    }

    public void setIsolatedByBarrier() {
        setBit(isolatedByBarrier, true);
    }

    public void clearIsolatedByBarrier() {
        setBit(isolatedByBarrier, false);
    }

    public boolean getUnsignalizedSegmentsPresent() {
        return getBit(unsignalizedSegmentsPresent);
    }

    public void setUnsignalizedSegmentsPresent() {
        setBit(unsignalizedSegmentsPresent, true);
    }

    public void clearUnsignalizedSegmentsPresent() {
        setBit(unsignalizedSegmentsPresent, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LaneAttributes_Bike)) {
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
