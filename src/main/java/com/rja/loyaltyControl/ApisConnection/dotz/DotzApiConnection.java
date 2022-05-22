package com.rja.loyaltyControl.ApisConnection.dotz;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;

public class DotzApiConnection {

	public static void main(String[] args) {
		getPartnersDotz();

	}

	public final static String URL = "https://api-reminder.dotz.com.br:443";


	public static void getPartnersDotz() {

		RestTemplate restTemplate = new RestTemplate();
		PartnerDotz[] forObject = restTemplate.getForObject(URL + "/api/Partner", PartnerDotz[].class);
		
		List<PartnerDotz> partners = Arrays.asList(forObject);
		
		for (PartnerDotz partnerDotz : partners) {
			System.out.println("Nome: " + partnerDotz.getName() + " - Dotz: " + partnerDotz.getMechanics() );
		}
	}

}

