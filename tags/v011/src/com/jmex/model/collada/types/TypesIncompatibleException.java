/**
 * TypesIncompatibleException.java This file was generated by XMLSpy 2006sp2
 * Enterprise Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION. Refer to the XMLSpy
 * Documentation for further details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.types;

public class TypesIncompatibleException extends SchemaTypeException {

    private static final long serialVersionUID = 1L;
    protected SchemaType object1;
    protected SchemaType object2;

    public TypesIncompatibleException(SchemaType newobj1, SchemaType newobj2) {
        super("Incompatible schema-types");
        object1 = newobj1;
        object2 = newobj2;
    }

    public TypesIncompatibleException(Exception other) {
        super(other);
    }
}
