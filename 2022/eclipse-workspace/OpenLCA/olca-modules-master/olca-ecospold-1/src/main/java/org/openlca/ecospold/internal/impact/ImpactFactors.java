package org.openlca.ecospold.internal.impact;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.openlca.ecospold.IAllocation;
import org.openlca.ecospold.IExchange;
import org.openlca.ecospold.IFlowData;
import org.w3c.dom.Element;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Contains information about the characterisation, damage or weighting factors
 * of the impact category described in the dataset.
 *
 * <p>
 * Java class for TFlowData complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="TFlowData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchange" type="{http://www.EcoInvent.org/EcoSpold01Impact}TExchange" maxOccurs="unbounded"/>
 *         &lt;element name="allocation" type="{http://www.EcoInvent.org/EcoSpold01Impact}TAllocation" maxOccurs="0" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFlowData", propOrder = { "exchange", "any" })
class ImpactFactors implements Serializable, IFlowData {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true, type = ImpactFactor.class)
	protected List<IExchange> exchange;
	@XmlAnyElement(lax = true)
	protected List<Object> any;

	/**
	 * Gets the value of the exchange property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the exchange property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getExchange().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ImpactFactor }
	 *
	 *
	 */
	@Override
	public List<IExchange> getExchange() {
		if (exchange == null) {
			exchange = new ArrayList<>();
		}
		return this.exchange;
	}

	/**
	 * Gets the value of the any property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * {@link Element }
	 *
	 *
	 */
	@Override
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	@Override
	public List<IAllocation> getAllocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
