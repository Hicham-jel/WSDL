package ma.emsi.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name="Montant") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="Code") int Code){
        return new Compte(Code,Math.random()*10000,new Date());
    }

    public List<Compte> listComptes(){
        return List.of(
        new Compte(1,Math.random()*10000,new Date()),
        new Compte(2,Math.random()*10000,new Date()),
        new Compte(3,Math.random()*10000,new Date()),
        new Compte(4,Math.random()*10000,new Date()));
    }
}
