package com.ibs.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ResetRequest {

	private String emailid;

	private String userName;
	private String password;

}
