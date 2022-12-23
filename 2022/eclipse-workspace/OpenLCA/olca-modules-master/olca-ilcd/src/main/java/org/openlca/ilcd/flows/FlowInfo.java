
package org.openlca.ilcd.flows;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.openlca.ilcd.commons.Other;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInformationType", propOrder = {
		"dataSetInfo",
		"quantitativeReference",
		"geography",
		"technology",
		"other"
})
public class FlowInfo implements Serializable {

	private final static long serialVersionUID = 1L;

	@XmlElement(required = true, name = "dataSetInformation")
	public DataSetInfo dataSetInfo;

	public QuantitativeReference quantitativeReference;

	public Geography geography;

	public Technology technology;

	@XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
	public Other other;

	@XmlAnyAttribute
	public final Map<QName, String> otherAttributes = new HashMap<>();

}
