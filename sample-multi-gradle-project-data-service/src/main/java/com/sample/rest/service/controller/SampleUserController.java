package com.sample.rest.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.rest.model.SampleUser;

@RestController
@RequestMapping(value = "/sample/user")
public class SampleUserController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<SampleUser> get(@RequestParam("email") final String email) {
		SampleUser sampleUser = new SampleUser();
		sampleUser.setFirstName("First Name");
		sampleUser.setEmail(email);
		return new ResponseEntity<SampleUser>(sampleUser, HttpStatus.OK);
	}
}