package com.rja.loyaltyControl.ApisConnection.livelo;

import org.springframework.web.client.RestTemplate;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LiveloApiConnection {
	
	public static void main(String[] args) {
		getDadosLivelo();
	}
	
	
	public static void getDadosLivelo() {
		
		RestTemplate restTemplate = new RestTemplate();
//		//Slip dados = restTemplate.getForObject("https://api.adviceslip.com/advice", Slip.class);
//		ResponseEntity<Dados> dados = ;
		//log.info(restTemplate.getForEntity("https://api.adviceslip.com/advice", Dados.class));
		//log.debug(restTemplate.getForEntity("https://api.adviceslip.com/advice", Dados.class));
		
	}

}

