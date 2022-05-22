package com.rja.loyaltyControl.ApisConnection.dotz;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PartnerDotzList {
	
	  private List<PartnerDotz> partners;
	  
	  public PartnerDotzList() {
		  partners = new ArrayList<>();
	    }

}

