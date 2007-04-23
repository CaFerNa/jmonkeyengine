/**
 * renderType.java This file was generated by XMLSpy 2006sp2 Enterprise Edition.
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE OVERWRITTEN WHEN YOU
 * RE-RUN CODE GENERATION. Refer to the XMLSpy Documentation for further
 * details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

import com.jmex.model.collada.types.SchemaNCName;
import com.jmex.model.collada.types.SchemaString;

public class renderType extends com.jmex.model.collada.xml.Node {

    private static final long serialVersionUID = 1L;

    public renderType(renderType node) {
        super(node);
    }

    public renderType(org.w3c.dom.Node node) {
        super(node);
    }

    public renderType(org.w3c.dom.Document doc) {
        super(doc);
    }

    public renderType(com.jmex.model.collada.xml.Document doc,
            String namespaceURI, String prefix, String name) {
        super(doc, namespaceURI, prefix, name);
    }

    public void adjustPrefix() {
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null,
                "camera_node"); tmpNode != null; tmpNode = getDomNextChild(
                Attribute, null, "camera_node", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "layer", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new instance_effectType(tmpNode).adjustPrefix();
        }
    }

    public static int getcamera_nodeMinCount() {
        return 1;
    }

    public static int getcamera_nodeMaxCount() {
        return 1;
    }

    public int getcamera_nodeCount() {
        return getDomChildCount(Attribute, null, "camera_node");
    }

    public boolean hascamera_node() {
        return hasDomChild(Attribute, null, "camera_node");
    }

    public SchemaString newcamera_node() {
        return new SchemaString();
    }

    public SchemaString getcamera_nodeAt(int index) throws Exception {
        return new SchemaString(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "camera_node", index))));
    }

    public org.w3c.dom.Node getStartingcamera_nodeCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "camera_node");
    }

    public org.w3c.dom.Node getAdvancedcamera_nodeCursor(
            org.w3c.dom.Node curNode) throws Exception {
        return getDomNextChild(Attribute, null, "camera_node", curNode);
    }

    public SchemaString getcamera_nodeValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaString(getDomNodeValue(dereference(curNode)));
    }

    public SchemaString getcamera_node() throws Exception {
        return getcamera_nodeAt(0);
    }

    public void removecamera_nodeAt(int index) {
        removeDomChildAt(Attribute, null, "camera_node", index);
    }

    public void removecamera_node() {
        while (hascamera_node())
            removecamera_nodeAt(0);
    }

    public void addcamera_node(SchemaString value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "camera_node", value.toString());
        }
    }

    public void addcamera_node(String value) throws Exception {
        addcamera_node(new SchemaString(value));
    }

    public void insertcamera_nodeAt(SchemaString value, int index) {
        insertDomChildAt(Attribute, null, "camera_node", index, value
                .toString());
    }

    public void insertcamera_nodeAt(String value, int index) throws Exception {
        insertcamera_nodeAt(new SchemaString(value), index);
    }

    public void replacecamera_nodeAt(SchemaString value, int index) {
        replaceDomChildAt(Attribute, null, "camera_node", index, value
                .toString());
    }

    public void replacecamera_nodeAt(String value, int index) throws Exception {
        replacecamera_nodeAt(new SchemaString(value), index);
    }

    public static int getlayerMinCount() {
        return 0;
    }

    public static int getlayerMaxCount() {
        return Integer.MAX_VALUE;
    }

    public int getlayerCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer");
    }

    public boolean haslayer() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer");
    }

    public SchemaNCName newlayer() {
        return new SchemaNCName();
    }

    public SchemaNCName getlayerAt(int index) throws Exception {
        return new SchemaNCName(getDomNodeValue(dereference(getDomChildAt(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "layer", index))));
    }

    public org.w3c.dom.Node getStartinglayerCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer");
    }

    public org.w3c.dom.Node getAdvancedlayerCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer",
                curNode);
    }

    public SchemaNCName getlayerValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaNCName(getDomNodeValue(dereference(curNode)));
    }

    public SchemaNCName getlayer() throws Exception {
        return getlayerAt(0);
    }

    public void removelayerAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer", index);
    }

    public void removelayer() {
        while (haslayer())
            removelayerAt(0);
    }

    public void addlayer(SchemaNCName value) {
        if (value.isNull() == false) {
            appendDomChild(Element,
                    "http://www.collada.org/2005/11/COLLADASchema", "layer",
                    value.toString());
        }
    }

    public void addlayer(String value) throws Exception {
        addlayer(new SchemaNCName(value));
    }

    public void insertlayerAt(SchemaNCName value, int index) {
        insertDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer", index,
                value.toString());
    }

    public void insertlayerAt(String value, int index) throws Exception {
        insertlayerAt(new SchemaNCName(value), index);
    }

    public void replacelayerAt(SchemaNCName value, int index) {
        replaceDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "layer", index,
                value.toString());
    }

    public void replacelayerAt(String value, int index) throws Exception {
        replacelayerAt(new SchemaNCName(value), index);
    }

    public static int getinstance_effectMinCount() {
        return 0;
    }

    public static int getinstance_effectMaxCount() {
        return 1;
    }

    public int getinstance_effectCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect");
    }

    public boolean hasinstance_effect() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect");
    }

    public instance_effectType newinstance_effect() {
        return new instance_effectType(domNode.getOwnerDocument()
                .createElementNS(
                        "http://www.collada.org/2005/11/COLLADASchema",
                        "instance_effect"));
    }

    public instance_effectType getinstance_effectAt(int index) throws Exception {
        return new instance_effectType(dereference(getDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", index)));
    }

    public org.w3c.dom.Node getStartinginstance_effectCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect");
    }

    public org.w3c.dom.Node getAdvancedinstance_effectCursor(
            org.w3c.dom.Node curNode) throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", curNode);
    }

    public instance_effectType getinstance_effectValueAtCursor(
            org.w3c.dom.Node curNode) throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new instance_effectType(dereference(curNode));
    }

    public instance_effectType getinstance_effect() throws Exception {
        return getinstance_effectAt(0);
    }

    public void removeinstance_effectAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", index);
    }

    public void removeinstance_effect() {
        while (hasinstance_effect())
            removeinstance_effectAt(0);
    }

    public void addinstance_effect(instance_effectType value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", value);
    }

    public void insertinstance_effectAt(instance_effectType value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", index, value);
    }

    public void replaceinstance_effectAt(instance_effectType value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "instance_effect", index, value);
    }

    private org.w3c.dom.Node dereference(org.w3c.dom.Node node) {
        return node;
    }
}
