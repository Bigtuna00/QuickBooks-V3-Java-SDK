//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.05 at 02:37:37 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubcontractorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubcontractorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Partnership"/>
 *     &lt;enumeration value="Trust"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubcontractorTypeEnum")
@XmlEnum
public enum SubcontractorTypeEnum {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("Trust")
    TRUST("Trust");
    private final String value;

    SubcontractorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubcontractorTypeEnum fromValue(String v) {
        for (SubcontractorTypeEnum c: SubcontractorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
