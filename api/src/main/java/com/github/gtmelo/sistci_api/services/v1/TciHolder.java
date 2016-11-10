package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 02364114110 on 10/11/2016.
 */

@XmlRootElement(name = "tcis")

public class TciHolder implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "id")
    private List<Tci> tcis;

    public List<Tci> getTcis() {
        return tcis;
    }

    public void setTcis(List<Tci> tcis) {
        this.tcis = tcis;
    }
}
