/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehStatus"
 */
package com.hisense.hiatmp.asn.v2x.VehStatus;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class VehicleEventFlags extends BitString {

    public static final int eventHazardLights = 0;
    public static final int eventStopLineViolation = 1;
    public static final int eventABSactivated = 2;
    public static final int eventTractionControlLoss = 3;
    public static final int eventStabilityControlactivated = 4;
    public static final int eventHazardousMaterials = 5;
    public static final int eventReserved1 = 6;
    public static final int eventHardBraking = 7;
    public static final int eventLightsChanged = 8;
    public static final int eventWipersChanged = 9;
    public static final int eventFlatTire = 10;
    public static final int eventDisabledVehicle = 11;
    public static final int eventAirBagDeployment = 12;
    public final static AsnType TYPE = VehStatus.type(65538);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(VehicleEventFlags.class);
    }

    public VehicleEventFlags(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public VehicleEventFlags(int size) {
        super(size);
    }

    public VehicleEventFlags() {
        super(0);
    }

    public static VehicleEventFlags ber_decode(InputStream in) throws IOException {
        return (VehicleEventFlags) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static VehicleEventFlags per_decode(boolean align, InputStream in) throws IOException {
        return (VehicleEventFlags) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getEventHazardLights() {
        return getBit(eventHazardLights);
    }

    public void setEventHazardLights() {
        setBit(eventHazardLights, true);
    }

    public void clearEventHazardLights() {
        setBit(eventHazardLights, false);
    }

    public boolean getEventStopLineViolation() {
        return getBit(eventStopLineViolation);
    }

    public void setEventStopLineViolation() {
        setBit(eventStopLineViolation, true);
    }

    public void clearEventStopLineViolation() {
        setBit(eventStopLineViolation, false);
    }

    public boolean getEventABSactivated() {
        return getBit(eventABSactivated);
    }

    public void setEventABSactivated() {
        setBit(eventABSactivated, true);
    }

    public void clearEventABSactivated() {
        setBit(eventABSactivated, false);
    }

    public boolean getEventTractionControlLoss() {
        return getBit(eventTractionControlLoss);
    }

    public void setEventTractionControlLoss() {
        setBit(eventTractionControlLoss, true);
    }

    public void clearEventTractionControlLoss() {
        setBit(eventTractionControlLoss, false);
    }

    public boolean getEventStabilityControlactivated() {
        return getBit(eventStabilityControlactivated);
    }

    public void setEventStabilityControlactivated() {
        setBit(eventStabilityControlactivated, true);
    }

    public void clearEventStabilityControlactivated() {
        setBit(eventStabilityControlactivated, false);
    }

    public boolean getEventHazardousMaterials() {
        return getBit(eventHazardousMaterials);
    }

    public void setEventHazardousMaterials() {
        setBit(eventHazardousMaterials, true);
    }

    public void clearEventHazardousMaterials() {
        setBit(eventHazardousMaterials, false);
    }

    public boolean getEventReserved1() {
        return getBit(eventReserved1);
    }

    public void setEventReserved1() {
        setBit(eventReserved1, true);
    }

    public void clearEventReserved1() {
        setBit(eventReserved1, false);
    }

    public boolean getEventHardBraking() {
        return getBit(eventHardBraking);
    }

    public void setEventHardBraking() {
        setBit(eventHardBraking, true);
    }

    public void clearEventHardBraking() {
        setBit(eventHardBraking, false);
    }

    public boolean getEventLightsChanged() {
        return getBit(eventLightsChanged);
    }

    public void setEventLightsChanged() {
        setBit(eventLightsChanged, true);
    }

    public void clearEventLightsChanged() {
        setBit(eventLightsChanged, false);
    }

    public boolean getEventWipersChanged() {
        return getBit(eventWipersChanged);
    }

    public void setEventWipersChanged() {
        setBit(eventWipersChanged, true);
    }

    public void clearEventWipersChanged() {
        setBit(eventWipersChanged, false);
    }

    public boolean getEventFlatTire() {
        return getBit(eventFlatTire);
    }

    public void setEventFlatTire() {
        setBit(eventFlatTire, true);
    }

    public void clearEventFlatTire() {
        setBit(eventFlatTire, false);
    }

    public boolean getEventDisabledVehicle() {
        return getBit(eventDisabledVehicle);
    }

    public void setEventDisabledVehicle() {
        setBit(eventDisabledVehicle, true);
    }

    public void clearEventDisabledVehicle() {
        setBit(eventDisabledVehicle, false);
    }

    public boolean getEventAirBagDeployment() {
        return getBit(eventAirBagDeployment);
    }

    public void setEventAirBagDeployment() {
        setBit(eventAirBagDeployment, true);
    }

    public void clearEventAirBagDeployment() {
        setBit(eventAirBagDeployment, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VehicleEventFlags)) {
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
