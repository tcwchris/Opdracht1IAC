
package iac.opdracht1iac;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import iac.average.Numbers;
import iac.response.Averageresp;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS-Interface", targetNamespace = "http://iac/Opdracht1IAC")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    iac.average.ObjectFactory.class,
    iac.error.ObjectFactory.class,
    iac.response.ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns iac.response.Averageresp
     * @throws AverageError
     */
    @WebMethod
    @WebResult(name = "averageresp", targetNamespace = "http://iac/response", partName = "average-response")
    public Averageresp average(
        @WebParam(name = "numbers", targetNamespace = "http://iac/average", partName = "parameters")
        Numbers parameters)
        throws AverageError
    ;

}
