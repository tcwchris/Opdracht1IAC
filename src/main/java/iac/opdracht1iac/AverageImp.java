package iac.opdracht1iac;

import com.sun.xml.internal.ws.developer.SchemaValidation;
import iac.error.Averageerr;
import iac.response.ObjectFactory;
import iac.response.Averageresp;

import javax.jws.WebService;

/**
 * Created by Chris on 09-Mar-17.
 */
@WebService
//@SchemaValidation(handler = )
public class AverageImp implements WSInterface {


    public Averageresp average(Averageerr averageError) throws AverageError {

        ObjectFactory ObjFac = new ObjectFactory();
        Averageresp rep = ObjFac.createAverageresp();



        return rep;
    }
}
