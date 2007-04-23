/**
 * techniqueType5.java This file was generated by XMLSpy 2006sp2 Enterprise
 * Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE OVERWRITTEN WHEN
 * YOU RE-RUN CODE GENERATION. Refer to the XMLSpy Documentation for further
 * details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

import com.jmex.model.collada.types.SchemaNMToken;

public class techniqueType5 extends com.jmex.model.collada.xml.Node {

    private static final long serialVersionUID = 1L;

    public techniqueType5(techniqueType5 node) {
        super(node);
    }

    public techniqueType5(org.w3c.dom.Node node) {
        super(node);
    }

    public techniqueType5(org.w3c.dom.Document doc) {
        super(doc);
    }

    public techniqueType5(com.jmex.model.collada.xml.Document doc,
            String namespaceURI, String prefix, String name) {
        super(doc, namespaceURI, prefix, name);
    }

    public void adjustPrefix() {
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null,
                "profile"); tmpNode != null; tmpNode = getDomNextChild(
                Attribute, null, "profile", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
    }

    public static int getprofileMinCount() {
        return 1;
    }

    public static int getprofileMaxCount() {
        return 1;
    }

    public int getprofileCount() {
        return getDomChildCount(Attribute, null, "profile");
    }

    public boolean hasprofile() {
        return hasDomChild(Attribute, null, "profile");
    }

    public SchemaNMToken newprofile() {
        return new SchemaNMToken();
    }

    public SchemaNMToken getprofileAt(int index) throws Exception {
        return new SchemaNMToken(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "profile", index))));
    }

    public org.w3c.dom.Node getStartingprofileCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "profile");
    }

    public org.w3c.dom.Node getAdvancedprofileCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Attribute, null, "profile", curNode);
    }

    public SchemaNMToken getprofileValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaNMToken(getDomNodeValue(dereference(curNode)));
    }

    public SchemaNMToken getprofile() throws Exception {
        return getprofileAt(0);
    }

    public void removeprofileAt(int index) {
        removeDomChildAt(Attribute, null, "profile", index);
    }

    public void removeprofile() {
        while (hasprofile())
            removeprofileAt(0);
    }

    public void addprofile(SchemaNMToken value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "profile", value.toString());
        }
    }

    public void addprofile(String value) throws Exception {
        addprofile(new SchemaNMToken(value));
    }

    public void insertprofileAt(SchemaNMToken value, int index) {
        insertDomChildAt(Attribute, null, "profile", index, value.toString());
    }

    public void insertprofileAt(String value, int index) throws Exception {
        insertprofileAt(new SchemaNMToken(value), index);
    }

    public void replaceprofileAt(SchemaNMToken value, int index) {
        replaceDomChildAt(Attribute, null, "profile", index, value.toString());
    }

    public void replaceprofileAt(String value, int index) throws Exception {
        replaceprofileAt(new SchemaNMToken(value), index);
    }

    private org.w3c.dom.Node dereference(org.w3c.dom.Node node) {
        return node;
    }
}
