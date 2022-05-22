package com.rja.loyaltyControl.ApisConnection.dotz;

import lombok.Data;

@Data
public class PartnerDotz {
	
	private String name;
	private String domain;
	private String redirectAddress;
	private String notificationMessage;
	private String aditionalInformation;
	private Integer activationType;
	private String cookieName;
	private String cookieValue;
	private String couponName;
	private Boolean active;
	private Integer partnerId;
	private Integer dotzCapturePartnerId;
	private String messageGoogle;
	private Boolean activeGoogleSearch;
	private String marketCompetition;
	private String messageMarketCompetition;
	private String classSellerMarketPlace;
	private String keySellerMarketPlace;
	private Boolean reload;
	private Boolean openNewTab;
	private Integer orderPartner;
	private String nameNormalized;
	private String mechanics;
}


