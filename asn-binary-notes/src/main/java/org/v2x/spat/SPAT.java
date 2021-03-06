package org.v2x.spat;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1Sequence;
import org.v2x.MsgCount;
import org.v2x.map.node.DescriptiveName;
import org.v2x.time.DSecond;
import org.v2x.time.MinuteOfTheYear;


/**
 * @author zhangyong
 */
@ASN1Sequence(name = "SPAT", isSet = false)
public class SPAT {

    @ASN1Element(name = "msgCnt", isOptional = false, hasTag = false, hasDefaultValue = false)
    private MsgCount msgCnt = null;

    @ASN1Element(name = "moy", isOptional = true, hasTag = false, hasDefaultValue = false)
    private MinuteOfTheYear moy = null;

    @ASN1Element(name = "timeStamp", isOptional = true, hasTag = false, hasDefaultValue = false)
    private DSecond timeStamp = null;

    @ASN1Element(name = "name", isOptional = true, hasTag = false, hasDefaultValue = false)
    private DescriptiveName name = null;

    @ASN1Element(name = "intersections", isOptional = false, hasTag = false, hasDefaultValue = false)
    private IntersectionStateList intersections = null;


    public MsgCount getMsgCnt() {
        return this.msgCnt;
    }


    public void setMsgCnt(MsgCount value) {
        this.msgCnt = value;
    }


    public MinuteOfTheYear getMoy() {
        return this.moy;
    }

    public void setMoy(MinuteOfTheYear value) {
        this.moy = value;
    }

    public boolean isMoyPresent() {
        return this.moy != null;
    }

    public DSecond getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(DSecond value) {
        this.timeStamp = value;
    }

    public boolean isTimeStampPresent() {
        return this.timeStamp != null;
    }

    public DescriptiveName getName() {
        return this.name;
    }

    public void setName(DescriptiveName value) {
        this.name = value;
    }

    public boolean isNamePresent() {
        return this.name != null;
    }

    public IntersectionStateList getIntersections() {
        return this.intersections;
    }


    public void setIntersections(IntersectionStateList value) {
        this.intersections = value;
    }


}
            