package com.sample.rest.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SampleUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7707153047247798253L;
	private String firstName;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void checkPrecondition() {
		if (StringUtils.isBlank(this.getEmail())) {
			throw new RuntimeException("Email is mandatory");
		}
	}
}