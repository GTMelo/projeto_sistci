package com.github.gtmelo.sistci_api.controller;

import com.github.gtmelo.sistci_api.security.RequestValidator;
import com.github.gtmelo.sistci_api.security.exception.DataNotFoundException;
import com.github.gtmelo.sistci_api.services.v1.Tci;
import com.github.gtmelo.sistci_api.services.v1.TciFactory;
import org.json.simple.JSONObject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class TciManager {

    private static TciManager instance;

    private TciManager() {
    }

    public static TciManager getInstance() {
        if (instance == null) instance = new TciManager();
        return instance;
    }

    public Tci findTci(String id) throws DataNotFoundException {

        boolean validacao = RequestValidator.getInstance().validarRequest(id);

        if (validacao) {
            return TciFactory.build();
        } else {
            throw new DataNotFoundException(this.getClass().getSimpleName(), "Dados não encontrados");
        }
    }

    public List<Tci> findTci(int offset) throws DataNotFoundException, SQLException {

        //TODO Trocar para validação definitiva
        String  validar   = "123456";
        boolean validacao = RequestValidator.getInstance().validarRequest(validar);

        List<Tci> tcis = new ArrayList<Tci>();
        if (validacao) {

            tcis = DataManager.getInstance().selectTcis(tcis, offset);
            return tcis;

        } else {
            throw new DataNotFoundException(this.getClass().getSimpleName(), "Dados não encontrados");
        }
    }

    public Tci addTci(Tci tci) {
        tci.setId("112233");
        return tci;
    }

    public Tci updateTci(String tciId, JSONObject jObject) {

        Tci tci = TciFactory.build(jObject);
        tci.setId(tciId);

        return tci;
    }

    public void deleteUser(String tciId) {

        return;

    }
}
