
package org.openlca.ilcd.descriptors;

import org.openlca.ilcd.commons.DataSetType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"uuid",
		"uri",
		"version",
		"name",
		"shortName",
		"classification",
		"comment",
		"centralContactPoint",
		"phone",
		"fax",
		"email",
		"www"
})
public class ContactDescriptor extends Descriptor {

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI")
	public String shortName;

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI/Contact")
	public String centralContactPoint;

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI/Contact")
	public String phone;

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI/Contact")
	public String fax;

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI/Contact")
	public String email;

	@XmlElement(namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI/Contact")
	public String www;

	@XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
	@XmlSchemaType(name = "anyURI")
	public String href;

	@XmlAttribute(name = "sourceId", namespace = "http://www.ilcd-network.org/ILCD/ServiceAPI")
	public String sourceId;

	@Override
	protected DataSetType getType() {
		return DataSetType.CONTACT;
	}

}
