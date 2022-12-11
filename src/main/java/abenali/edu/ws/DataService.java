package abenali.edu.ws;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
public class DataService {

    private static final DataService instance = new DataService();
    private List<Compte> comptes = new ArrayList<>();
    private DataService() {
        for(int i=1;i<11;i++) {
            comptes.add(new Compte(i*1000, i*8000, new Date()));
        }
    }

    public static DataService getInstance() {
        return instance;
    }

}
