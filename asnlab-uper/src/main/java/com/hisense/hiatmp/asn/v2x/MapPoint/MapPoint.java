/*
 * Generated by ASN.1 Java Compiler (https://www.asnlab.org/)
 * From ASN.1 module "MapPoint"
 */
package com.hisense.hiatmp.asn.v2x.MapPoint;

import org.asnlab.asndt.runtime.conv.AsnConverter;
import org.asnlab.asndt.runtime.type.AsnModule;
import org.asnlab.asndt.runtime.type.AsnType;

import java.util.Vector;


public class MapPoint extends AsnModule {

    public final static MapPoint instance = new MapPoint();


    /**
     * /* Creates the ASN.1 module.
     * /* The ASN.1 module instance is created automatically, clients must not call.
     * /* A metadata file named MapPoint.meta must exist in the same package of this class.
     **/
    private MapPoint() {
        super(MapPoint.class);
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