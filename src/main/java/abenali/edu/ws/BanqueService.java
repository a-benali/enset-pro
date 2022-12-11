package abenali.edu.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    private static final double taux = 11;

    @WebMethod
    public double convert(@WebParam double montant) {
        return montant*taux;
    }

    @WebMethod
    public Compte getCompte(@WebParam int code) {
        Optional<Compte> optionalCompte = getComptes().stream().filter(c -> c.getCode() == code).findFirst();
        if(optionalCompte.isPresent())
            return optionalCompte.get();
        return null;
    }

    @WebMethod
    public List<Compte> getComptes() {
        return new ArrayList<>(DataService.getInstance().getComptes());
    }
/*
    @WebMethod
    public void addCompte(Compte compte) {
        DataService.getInstance().getComptes().add(compte);
    }
 */
}
