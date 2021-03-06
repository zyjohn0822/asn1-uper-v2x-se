/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "SPATIntersectionState"
 */
package com.hisense.hiatmp.asn.v2x.SPATIntersectionState;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.conv.EncodingRules;
import org.asnlab.asndt.runtime.conv.ReflectionBitStringConverter;
import org.asnlab.asndt.runtime.type.AsnType;
import org.asnlab.asndt.runtime.value.BitString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IntersectionStatusObject extends BitString {

    public static final int manualControlIsEnabled = 0;
    public static final int stopTimeIsActivated = 1;
    public static final int failureFlash = 2;
    public static final int preemptIsActive = 3;
    public static final int signalPriorityIsActive = 4;
    public static final int fixedTimeOperation = 5;
    public static final int trafficDependentOperation = 6;
    public static final int standbyOperation = 7;
    public static final int failureMode = 8;
    public static final int off = 9;
    public static final int recentMAPmessageUpdate = 10;
    public static final int recentChangeInMAPassignedLanesIDsUsed = 11;
    public static final int noValidMAPisAvailableAtThisTime = 12;
    public static final int noValidSPATisAvailableAtThisTime = 13;
    public final static AsnType TYPE = SPATIntersectionState.type(65537);
    public final static AsnConverter CONV;

    static {
        CONV = new ReflectionBitStringConverter(IntersectionStatusObject.class);
    }

    public IntersectionStatusObject(byte[] bytes, byte unusedBits) {
        super(bytes, unusedBits);
    }

    public IntersectionStatusObject(int size) {
        super(size);
    }

    public IntersectionStatusObject() {
        super(0);
    }

    public static IntersectionStatusObject ber_decode(InputStream in) throws IOException {
        return (IntersectionStatusObject) TYPE.decode(in, EncodingRules.BASIC_ENCODING_RULES, CONV);
    }

    public static IntersectionStatusObject per_decode(boolean align, InputStream in) throws IOException {
        return (IntersectionStatusObject) TYPE.decode(in, align ? EncodingRules.ALIGNED_PACKED_ENCODING_RULES : EncodingRules.UNALIGNED_PACKED_ENCODING_RULES, CONV);
    }

    public boolean getManualControlIsEnabled() {
        return getBit(manualControlIsEnabled);
    }

    public void setManualControlIsEnabled() {
        setBit(manualControlIsEnabled, true);
    }

    public void clearManualControlIsEnabled() {
        setBit(manualControlIsEnabled, false);
    }

    public boolean getStopTimeIsActivated() {
        return getBit(stopTimeIsActivated);
    }

    public void setStopTimeIsActivated() {
        setBit(stopTimeIsActivated, true);
    }

    public void clearStopTimeIsActivated() {
        setBit(stopTimeIsActivated, false);
    }

    public boolean getFailureFlash() {
        return getBit(failureFlash);
    }

    public void setFailureFlash() {
        setBit(failureFlash, true);
    }

    public void clearFailureFlash() {
        setBit(failureFlash, false);
    }

    public boolean getPreemptIsActive() {
        return getBit(preemptIsActive);
    }

    public void setPreemptIsActive() {
        setBit(preemptIsActive, true);
    }

    public void clearPreemptIsActive() {
        setBit(preemptIsActive, false);
    }

    public boolean getSignalPriorityIsActive() {
        return getBit(signalPriorityIsActive);
    }

    public void setSignalPriorityIsActive() {
        setBit(signalPriorityIsActive, true);
    }

    public void clearSignalPriorityIsActive() {
        setBit(signalPriorityIsActive, false);
    }

    public boolean getFixedTimeOperation() {
        return getBit(fixedTimeOperation);
    }

    public void setFixedTimeOperation() {
        setBit(fixedTimeOperation, true);
    }

    public void clearFixedTimeOperation() {
        setBit(fixedTimeOperation, false);
    }

    public boolean getTrafficDependentOperation() {
        return getBit(trafficDependentOperation);
    }

    public void setTrafficDependentOperation() {
        setBit(trafficDependentOperation, true);
    }

    public void clearTrafficDependentOperation() {
        setBit(trafficDependentOperation, false);
    }

    public boolean getStandbyOperation() {
        return getBit(standbyOperation);
    }

    public void setStandbyOperation() {
        setBit(standbyOperation, true);
    }

    public void clearStandbyOperation() {
        setBit(standbyOperation, false);
    }

    public boolean getFailureMode() {
        return getBit(failureMode);
    }

    public void setFailureMode() {
        setBit(failureMode, true);
    }

    public void clearFailureMode() {
        setBit(failureMode, false);
    }

    public boolean getOff() {
        return getBit(off);
    }

    public void setOff() {
        setBit(off, true);
    }

    public void clearOff() {
        setBit(off, false);
    }

    public boolean getRecentMAPmessageUpdate() {
        return getBit(recentMAPmessageUpdate);
    }

    public void setRecentMAPmessageUpdate() {
        setBit(recentMAPmessageUpdate, true);
    }

    public void clearRecentMAPmessageUpdate() {
        setBit(recentMAPmessageUpdate, false);
    }

    public boolean getRecentChangeInMAPassignedLanesIDsUsed() {
        return getBit(recentChangeInMAPassignedLanesIDsUsed);
    }

    public void setRecentChangeInMAPassignedLanesIDsUsed() {
        setBit(recentChangeInMAPassignedLanesIDsUsed, true);
    }

    public void clearRecentChangeInMAPassignedLanesIDsUsed() {
        setBit(recentChangeInMAPassignedLanesIDsUsed, false);
    }

    public boolean getNoValidMAPisAvailableAtThisTime() {
        return getBit(noValidMAPisAvailableAtThisTime);
    }

    public void setNoValidMAPisAvailableAtThisTime() {
        setBit(noValidMAPisAvailableAtThisTime, true);
    }

    public void clearNoValidMAPisAvailableAtThisTime() {
        setBit(noValidMAPisAvailableAtThisTime, false);
    }

    public boolean getNoValidSPATisAvailableAtThisTime() {
        return getBit(noValidSPATisAvailableAtThisTime);
    }

    public void setNoValidSPATisAvailableAtThisTime() {
        setBit(noValidSPATisAvailableAtThisTime, true);
    }

    public void clearNoValidSPATisAvailableAtThisTime() {
        setBit(noValidSPATisAvailableAtThisTime, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntersectionStatusObject)) {
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
