/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "SPATIntersectionState"
 */
package com.hisense.hiatmp.asn.v2x.SPATIntersectionState;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.type.AsnModule;
import org.asnlab.asndt.runtime.type.AsnType;

import java.util.Vector;


public class SPATIntersectionState extends AsnModule {

    public final static SPATIntersectionState instance = new SPATIntersectionState();


    /**
     * /* Creates the ASN.1 module.
     * /* The ASN.1 module instance is created automatically, clients must not call.
     * /* A metadata file named SPATIntersectionState.meta must exist in the same package of this class.
     **/
    private SPATIntersectionState() {
        super(SPATIntersectionState.class);
    }


    public static AsnType type(int id) {
        return instance.getType(id);
    }

    public static Object value(int valueId, AsnConverter converter) {
        return instance.getValue(valueId, converter);
    }

    public static Object object(int objectId, AsnConverter converter) {
        return instance.getObject(objectId, converter);
    }

    public static Vector objectSet(int objectSetId, AsnConverter converter) {
        return instance.getObjectSet(objectSetId, converter);
    }


}
