//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11-b140731.1112 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.17 um 05:44:19 PM CET 
//


package org.plcopen.xml.tc60201;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a range with signed bounds
 * <p>
 * <p>
 * <p>Java-Klasse für rangeSigned complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType name="rangeSigned">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="lower" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upper" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangeSigned")
public class RangeSigned implements org.plcopen.xml.tc60201.PlcNode{

    @XmlAttribute(name = "lower", required = true)
    protected String lower;
    @XmlAttribute(name = "upper", required = true)
    protected String upper;

    /**
     * Ruft den Wert der lower-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLower() {
        return lower;
    }

    /**
     * Legt den Wert der lower-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLower(String value) {
        this.lower = value;
    }

    /**
     * Ruft den Wert der upper-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpper() {
        return upper;
    }

    /**
     * Legt den Wert der upper-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpper(String value) {
        this.upper = value;
    }

}
