package br.ufpe.cin.if998;

public class CalcPlusPlusProxy implements br.ufpe.cin.if998.CalcPlusPlus {
  private String _endpoint = null;
  private br.ufpe.cin.if998.CalcPlusPlus calcPlusPlus = null;
  
  public CalcPlusPlusProxy() {
    _initCalcPlusPlusProxy();
  }
  
  public CalcPlusPlusProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcPlusPlusProxy();
  }
  
  private void _initCalcPlusPlusProxy() {
    try {
      calcPlusPlus = (new br.ufpe.cin.if998.CalcPlusPlusServiceLocator()).getCalcPlusPlus();
      if (calcPlusPlus != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcPlusPlus)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcPlusPlus)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcPlusPlus != null)
      ((javax.xml.rpc.Stub)calcPlusPlus)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.ufpe.cin.if998.CalcPlusPlus getCalcPlusPlus() {
    if (calcPlusPlus == null)
      _initCalcPlusPlusProxy();
    return calcPlusPlus;
  }
  
  public double raizQuadrada(int v) throws java.rmi.RemoteException{
    if (calcPlusPlus == null)
      _initCalcPlusPlusProxy();
    return calcPlusPlus.raizQuadrada(v);
  }
  
  public int potencia(int v1, int v2) throws java.rmi.RemoteException{
    if (calcPlusPlus == null)
      _initCalcPlusPlusProxy();
    return calcPlusPlus.potencia(v1, v2);
  }
  
  
}