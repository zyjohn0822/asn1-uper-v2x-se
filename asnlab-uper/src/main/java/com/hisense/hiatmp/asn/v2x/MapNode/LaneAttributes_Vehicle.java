/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapLane"
 */
package com.hisense.hiatmp.asn.v2x.MapNode;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LaneAttributes_Vehicle extends BitString {

    public static final int isVehicleRevocableLane = 0;
    public static final int isVehicleFlyOverLane = 1;
    public static final int hovLaneUseOnly = 2;
    public static final int restrictedToBusUse = 3;
    public static final int restrictedToTaxiUse = 4;
    public static final int restrictedFromPublicUse = 5;
    public static final int hasIRbeaconCoverage = 6;
    public static final int permissionOnRequest = 7;
    public final static AsnType TYPE = MapNode.type(393265);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(LaneAttributes_Vehicle.class);
    }

    public LaneAttributes_Vehicle(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public LaneAttributes_Vehicle(int size) {
        super(size);
    }

    public LaneAttributes_Vehicle() {
        super(0);
    }

    public static LaneAttributes_Vehicle ber_decode(InputStream in) throws IOException {
        return (LaneAttributes_Vehicle) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static LaneAttributes_Vehicle per_decode(boolean align, InputStream in) throws IOException {
        return (LaneAttributes_Vehicle) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getIsVehicleRevocableLane() {
        return getBit(isVehicleRevocableLane);
    }

    public void setIsVehicleRevocableLane() {
        setBit(isVehicleRevocableLane, true);
    }

    public void clearIsVehicleRevocableLane() {
        setBit(isVehicleRevocableLane, false);
    }

    public boolean getIsVehicleFlyOverLane() {
        return getBit(isVehicleFlyOverLane);
    }

    public void setIsVehicleFlyOverLane() {
        setBit(isVehicleFlyOverLane, true);
    }

    public void clearIsVehicleFlyOverLane() {
        setBit(isVehicleFlyOverLane, false);
    }

    public boolean getHovLaneUseOnly() {
        return getBit(hovLaneUseOnly);
    }

    public void setHovLaneUseOnly() {
        setBit(hovLaneUseOnly, true);
    }

    public void clearHovLaneUseOnly() {
        setBit(hovLaneUseOnly, false);
    }

    public boolean getRestrictedToBusUse() {
        return getBit(restrictedToBusUse);
    }

    public void setRestrictedToBusUse() {
        setBit(restrictedToBusUse, true);
    }

    public void clearRestrictedToBusUse() {
        setBit(restrictedToBusUse, false);
    }

    public boolean getRestrictedToTaxiUse() {
        return getBit(restrictedToTaxiUse);
    }

    public void setRestrictedToTaxiUse() {
        setBit(restrictedToTaxiUse, true);
    }

    public void clearRestrictedToTaxiUse() {
        setBit(restrictedToTaxiUse, false);
    }

    public boolean getRestrictedFromPublicUse() {
        return getBit(restrictedFromPublicUse);
    }

    public void setRestrictedFromPublicUse() {
        setBit(restrictedFromPublicUse, true);
    }

    public void clearRestrictedFromPublicUse() {
        setBit(restrictedFromPublicUse, false);
    }

    public boolean getHasIRbeaconCoverage() {
        return getBit(hasIRbeaconCoverage);
    }

    public void setHasIRbeaconCoverage() {
        setBit(hasIRbeaconCoverage, true);
    }

    public void clearHasIRbeaconCoverage() {
        setBit(hasIRbeaconCoverage, false);
    }

    public boolean getPermissionOnRequest() {
        return getBit(permissionOnRequest);
    }

    public void setPermissionOnRequest() {
        setBit(permissionOnRequest, true);
    }

    public void clearPermissionOnRequest() {
        setBit(permissionOnRequest, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LaneAttributes_Vehicle)) {
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
