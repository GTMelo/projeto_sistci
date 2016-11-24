package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Gustavo on 15/11/2016.
 */

@XmlRootElement(name = "viewtcis")
public class ViewTciHolder implements Serializable {

    @XmlElement(name = "id")
    private List<ViewTci> viewTcis;

    public List<ViewTci> getViewTcis() {
        return viewTcis;
    }

    public void setViewTcis(List<ViewTci> viewTcis) {
        this.viewTcis = viewTcis;
    }

    @Override
    public String toString() {
        return "ViewTciHolder{" +
                "viewTcis=" + viewTcis +
                '}';
    }
}
