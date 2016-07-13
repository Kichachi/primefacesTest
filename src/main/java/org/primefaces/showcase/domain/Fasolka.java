
package org.primefaces.showcase.domain;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="Fasolka")
public class Fasolka implements Serializable {

	private Boolean status;

	@PostConstruct
	public void init() {
		status = true;
	}

	public Boolean getStatus() {
		return  status;
	}

	public void setStatus(Boolean status) {
		this. status = status;
	}
}
