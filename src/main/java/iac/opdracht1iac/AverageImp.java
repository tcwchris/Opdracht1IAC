package iac.opdracht1iac;

import com.sun.xml.internal.ws.developer.SchemaValidation;
import iac.average.Numbers;
import iac.error.Averageerr;
import iac.response.ObjectFactory;
import iac.response.Averageresp;

import javax.jws.WebService;

/**
 * Created by Chris on 09-Mar-17.
 */
@WebService
@SchemaValidation
public class AverageImp implements WSInterface {

    public Averageresp average(Numbers nmbrs) throws AverageError {

        ObjectFactory ObjFac = new ObjectFactory();
        Averageresp rep = ObjFac.createAverageresp();


        try{
            if(nmbrs.getNumber1() <= 0 || nmbrs.getNumber2() <= 0 || nmbrs.getNumber3() <= 0 || nmbrs.getNumber4() <= 0){
                throw new RuntimeException();
            }

            calcAverage avg = new calcAverage(nmbrs.getNumber1(),nmbrs.getNumber2(), nmbrs.getNumber3(), nmbrs.getNumber4());
            rep.setResponse(avg.getAverge());
        }catch (RuntimeException e){

            iac.error.ObjectFactory errFactory = new iac.error.ObjectFactory();
            iac.error.Averageerr err = errFactory.createAverageerr();
            err.setError("Elke invoer moet een getal zijn dat hoger is dan 0");
            AverageError melding = new AverageError("Error 1", err);
            throw melding;
        }


        return rep;
    }
}
