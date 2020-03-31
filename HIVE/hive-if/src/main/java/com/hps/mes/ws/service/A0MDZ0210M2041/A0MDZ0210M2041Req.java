package com.hps.mes.ws.service.A0MDZ0210M2041;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author mooney
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class A0MDZ0210M2041Req {
	@XmlElement(name = "INF_DEPTCD_IN_MDG")
    private List<INF_DEPTCD_IN_MDG> items;

    public List<INF_DEPTCD_IN_MDG> getItems() {
        if(items == null) {
            items = new ArrayList<INF_DEPTCD_IN_MDG>();
        }
        return items;
    }

    public void setItems(List<INF_DEPTCD_IN_MDG> items) {
        this.items = items;
    }
}
