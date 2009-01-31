/**
 * imagerType.java
 *
 * This file was generated by XMLSpy 2007sp2 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.jmex.model.collada.schema;


public class imagerType extends com.jmex.xml.xml.Node {

	public imagerType(imagerType node) {
		super(node);
	}

	public imagerType(org.w3c.dom.Node node) {
		super(node);
	}

	public imagerType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public imagerType(com.jmex.xml.xml.Document doc, String namespaceURI, String prefix, String name) {
		super(doc, namespaceURI, prefix, name);
	}
	
	public void adjustPrefix() {
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "technique" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "technique", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new techniqueType5(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "extra" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "extra", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new extraType(tmpNode).adjustPrefix();
		}
	}
	public void setXsiType() {
 		org.w3c.dom.Element el = (org.w3c.dom.Element) domNode;
		el.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "imager");
	}

	public static int gettechniqueMinCount() {
		return 1;
	}

	public static int gettechniqueMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int gettechniqueCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "technique");
	}

	public boolean hastechnique() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "technique");
	}

	public techniqueType5 newtechnique() {
		return new techniqueType5(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "technique"));
	}

	public techniqueType5 gettechniqueAt(int index) throws Exception {
		return new techniqueType5(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "technique", index));
	}

	public org.w3c.dom.Node getStartingtechniqueCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "technique" );
	}

	public org.w3c.dom.Node getAdvancedtechniqueCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "technique", curNode );
	}

	public techniqueType5 gettechniqueValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new techniqueType5(curNode);
	}

	public techniqueType5 gettechnique() throws Exception 
 {
		return gettechniqueAt(0);
	}

	public void removetechniqueAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "technique", index);
	}

	public void removetechnique() {
		while (hastechnique())
			removetechniqueAt(0);
	}

	public org.w3c.dom.Node addtechnique(techniqueType5 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "technique", value);
	}

	public void inserttechniqueAt(techniqueType5 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "technique", index, value);
	}

	public void replacetechniqueAt(techniqueType5 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "technique", index, value);
	}

	public static int getextraMinCount() {
		return 0;
	}

	public static int getextraMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int getextraCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "extra");
	}

	public boolean hasextra() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "extra");
	}

	public extraType newextra() {
		return new extraType(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "extra"));
	}

	public extraType getextraAt(int index) throws Exception {
		return new extraType(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "extra", index));
	}

	public org.w3c.dom.Node getStartingextraCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "extra" );
	}

	public org.w3c.dom.Node getAdvancedextraCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "extra", curNode );
	}

	public extraType getextraValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new extraType(curNode);
	}

	public extraType getextra() throws Exception 
 {
		return getextraAt(0);
	}

	public void removeextraAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "extra", index);
	}

	public void removeextra() {
		while (hasextra())
			removeextraAt(0);
	}

	public org.w3c.dom.Node addextra(extraType value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "extra", value);
	}

	public void insertextraAt(extraType value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "extra", index, value);
	}

	public void replaceextraAt(extraType value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "extra", index, value);
	}

}
