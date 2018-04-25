/**
 * CalcPlusPlusServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.ufpe.cin.if998;

public class CalcPlusPlusServiceLocator extends org.apache.axis.client.Service implements br.ufpe.cin.if998.CalcPlusPlusService {

    public CalcPlusPlusServiceLocator() {
    }


    public CalcPlusPlusServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcPlusPlusServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalcPlusPlus
    private java.lang.String CalcPlusPlus_address = "http://localhost:8080/CalcAvancadaWS/services/CalcPlusPlus";

    public java.lang.String getCalcPlusPlusAddress() {
        return CalcPlusPlus_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcPlusPlusWSDDServiceName = "CalcPlusPlus";

    public java.lang.String getCalcPlusPlusWSDDServiceName() {
        return CalcPlusPlusWSDDServiceName;
    }

    public void setCalcPlusPlusWSDDServiceName(java.lang.String name) {
        CalcPlusPlusWSDDServiceName = name;
    }

    public br.ufpe.cin.if998.CalcPlusPlus getCalcPlusPlus() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalcPlusPlus_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcPlusPlus(endpoint);
    }

    public br.ufpe.cin.if998.CalcPlusPlus getCalcPlusPlus(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.ufpe.cin.if998.CalcPlusPlusSoapBindingStub _stub = new br.ufpe.cin.if998.CalcPlusPlusSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalcPlusPlusWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcPlusPlusEndpointAddress(java.lang.String address) {
        CalcPlusPlus_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.ufpe.cin.if998.CalcPlusPlus.class.isAssignableFrom(serviceEndpointInterface)) {
                br.ufpe.cin.if998.CalcPlusPlusSoapBindingStub _stub = new br.ufpe.cin.if998.CalcPlusPlusSoapBindingStub(new java.net.URL(CalcPlusPlus_address), this);
                _stub.setPortName(getCalcPlusPlusWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalcPlusPlus".equals(inputPortName)) {
            return getCalcPlusPlus();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://if998.cin.ufpe.br", "CalcPlusPlusService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://if998.cin.ufpe.br", "CalcPlusPlus"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalcPlusPlus".equals(portName)) {
            setCalcPlusPlusEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
