/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehStatus"
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
public class ExteriorLights extends BitString {

    public static final int lowBeamHeadlightsOn = 0;
    public static final int highBeamHeadlightsOn = 1;
    public static final int leftTurnSignalOn = 2;
    public static final int rightTurnSignalOn = 3;
    public static final int hazardSignalOn = 4;
    public static final int automaticLightControlOn = 5;
    public static final int daytimeRunningLightsOn = 6;
    public static final int fogLightOn = 7;
    public static final int parkingLightsOn = 8;
    public final static AsnType TYPE = MsgFrame.type(327764);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(ExteriorLights.class);
    }

    public ExteriorLights(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public ExteriorLights(int size) {
        super(size);
    }

    public ExteriorLights() {
        super(0);
    }

    public static ExteriorLights ber_decode(InputStream in) throws IOException {
        return (ExteriorLights) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static ExteriorLights per_decode(boolean align, InputStream in) throws IOException {
        return (ExteriorLights) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getLowBeamHeadlightsOn() {
        return getBit(lowBeamHeadlightsOn);
    }

    public void setLowBeamHeadlightsOn() {
        setBit(lowBeamHeadlightsOn, true);
    }

    public void clearLowBeamHeadlightsOn() {
        setBit(lowBeamHeadlightsOn, false);
    }

    public boolean getHighBeamHeadlightsOn() {
        return getBit(highBeamHeadlightsOn);
    }

    public void setHighBeamHeadlightsOn() {
        setBit(highBeamHeadlightsOn, true);
    }

    public void clearHighBeamHeadlightsOn() {
        setBit(highBeamHeadlightsOn, false);
    }

    public boolean getLeftTurnSignalOn() {
        return getBit(leftTurnSignalOn);
    }

    public void setLeftTurnSignalOn() {
        setBit(leftTurnSignalOn, true);
    }

    public void clearLeftTurnSignalOn() {
        setBit(leftTurnSignalOn, false);
    }

    public boolean getRightTurnSignalOn() {
        return getBit(rightTurnSignalOn);
    }

    public void setRightTurnSignalOn() {
        setBit(rightTurnSignalOn, true);
    }

    public void clearRightTurnSignalOn() {
        setBit(rightTurnSignalOn, false);
    }

    public boolean getHazardSignalOn() {
        return getBit(hazardSignalOn);
    }

    public void setHazardSignalOn() {
        setBit(hazardSignalOn, true);
    }

    public void clearHazardSignalOn() {
        setBit(hazardSignalOn, false);
    }

    public boolean getAutomaticLightControlOn() {
        return getBit(automaticLightControlOn);
    }

    public void setAutomaticLightControlOn() {
        setBit(automaticLightControlOn, true);
    }

    public void clearAutomaticLightControlOn() {
        setBit(automaticLightControlOn, false);
    }

    public boolean getDaytimeRunningLightsOn() {
        return getBit(daytimeRunningLightsOn);
    }

    public void setDaytimeRunningLightsOn() {
        setBit(daytimeRunningLightsOn, true);
    }

    public void clearDaytimeRunningLightsOn() {
        setBit(daytimeRunningLightsOn, false);
    }

    public boolean getFogLightOn() {
        return getBit(fogLightOn);
    }

    public void setFogLightOn() {
        setBit(fogLightOn, true);
    }

    public void clearFogLightOn() {
        setBit(fogLightOn, false);
    }

    public boolean getParkingLightsOn() {
        return getBit(parkingLightsOn);
    }

    public void setParkingLightsOn() {
        setBit(parkingLightsOn, true);
    }

    public void clearParkingLightsOn() {
        setBit(parkingLightsOn, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ExteriorLights)) {
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
        final StringBuilder sb = new StringBuilder("\"");
        sb.append(super.toString());
        sb.append("\"");
        return sb.toString();
    }

}
