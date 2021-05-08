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
public class LaneAttributes_TrackedVehicle extends BitString {

    public static final int spec_RevocableLane = 0;
    public static final int spec_commuterRailRoadTrack = 1;
    public static final int spec_lightRailRoadTrack = 2;
    public static final int spec_heavyRailRoadTrack = 3;
    public static final int spec_otherRailType = 4;
    public final static AsnType TYPE = MsgFrame.type(1179768);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(LaneAttributes_TrackedVehicle.class);
    }

    public LaneAttributes_TrackedVehicle(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public LaneAttributes_TrackedVehicle(int size) {
        super(size);
    }

    public LaneAttributes_TrackedVehicle() {
        super(0);
    }

    public static LaneAttributes_TrackedVehicle ber_decode(InputStream in) throws IOException {
        return (LaneAttributes_TrackedVehicle) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static LaneAttributes_TrackedVehicle per_decode(boolean align, InputStream in) throws IOException {
        return (LaneAttributes_TrackedVehicle) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getSpec_RevocableLane() {
        return getBit(spec_RevocableLane);
    }

    public void setSpec_RevocableLane() {
        setBit(spec_RevocableLane, true);
    }

    public void clearSpec_RevocableLane() {
        setBit(spec_RevocableLane, false);
    }

    public boolean getSpec_commuterRailRoadTrack() {
        return getBit(spec_commuterRailRoadTrack);
    }

    public void setSpec_commuterRailRoadTrack() {
        setBit(spec_commuterRailRoadTrack, true);
    }

    public void clearSpec_commuterRailRoadTrack() {
        setBit(spec_commuterRailRoadTrack, false);
    }

    public boolean getSpec_lightRailRoadTrack() {
        return getBit(spec_lightRailRoadTrack);
    }

    public void setSpec_lightRailRoadTrack() {
        setBit(spec_lightRailRoadTrack, true);
    }

    public void clearSpec_lightRailRoadTrack() {
        setBit(spec_lightRailRoadTrack, false);
    }

    public boolean getSpec_heavyRailRoadTrack() {
        return getBit(spec_heavyRailRoadTrack);
    }

    public void setSpec_heavyRailRoadTrack() {
        setBit(spec_heavyRailRoadTrack, true);
    }

    public void clearSpec_heavyRailRoadTrack() {
        setBit(spec_heavyRailRoadTrack, false);
    }

    public boolean getSpec_otherRailType() {
        return getBit(spec_otherRailType);
    }

    public void setSpec_otherRailType() {
        setBit(spec_otherRailType, true);
    }

    public void clearSpec_otherRailType() {
        setBit(spec_otherRailType, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LaneAttributes_TrackedVehicle)) {
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
