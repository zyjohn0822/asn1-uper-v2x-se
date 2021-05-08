/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "VehSafetyExt"
 */
package com.hisense.hiatmp.asn.v2x.BSM;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GNSSstatus extends BitString {

    public static final int unavailable = 0;
    public static final int isHealthy = 1;
    public static final int isMonitored = 2;
    public static final int baseStationType = 3;
    public static final int aPDOPofUnder5 = 4;
    public static final int inViewOfUnder5 = 5;
    public static final int localCorrectionsPresent = 6;
    public static final int networkCorrectionsPresent = 7;
    public final static AsnType TYPE = BSM.type(655413);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(GNSSstatus.class);
    }

    public GNSSstatus(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public GNSSstatus(int size) {
        super(size);
    }

    public GNSSstatus() {
        super(0);
    }

    public static GNSSstatus ber_decode(InputStream in) throws IOException {
        return (GNSSstatus) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static GNSSstatus per_decode(boolean align, InputStream in) throws IOException {
        return (GNSSstatus) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
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

    public boolean getIsHealthy() {
        return getBit(isHealthy);
    }

    public void setIsHealthy() {
        setBit(isHealthy, true);
    }

    public void clearIsHealthy() {
        setBit(isHealthy, false);
    }

    public boolean getIsMonitored() {
        return getBit(isMonitored);
    }

    public void setIsMonitored() {
        setBit(isMonitored, true);
    }

    public void clearIsMonitored() {
        setBit(isMonitored, false);
    }

    public boolean getBaseStationType() {
        return getBit(baseStationType);
    }

    public void setBaseStationType() {
        setBit(baseStationType, true);
    }

    public void clearBaseStationType() {
        setBit(baseStationType, false);
    }

    public boolean getAPDOPofUnder5() {
        return getBit(aPDOPofUnder5);
    }

    public void setAPDOPofUnder5() {
        setBit(aPDOPofUnder5, true);
    }

    public void clearAPDOPofUnder5() {
        setBit(aPDOPofUnder5, false);
    }

    public boolean getInViewOfUnder5() {
        return getBit(inViewOfUnder5);
    }

    public void setInViewOfUnder5() {
        setBit(inViewOfUnder5, true);
    }

    public void clearInViewOfUnder5() {
        setBit(inViewOfUnder5, false);
    }

    public boolean getLocalCorrectionsPresent() {
        return getBit(localCorrectionsPresent);
    }

    public void setLocalCorrectionsPresent() {
        setBit(localCorrectionsPresent, true);
    }

    public void clearLocalCorrectionsPresent() {
        setBit(localCorrectionsPresent, false);
    }

    public boolean getNetworkCorrectionsPresent() {
        return getBit(networkCorrectionsPresent);
    }

    public void setNetworkCorrectionsPresent() {
        setBit(networkCorrectionsPresent, true);
    }

    public void clearNetworkCorrectionsPresent() {
        setBit(networkCorrectionsPresent, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GNSSstatus)) {
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