package com.springBootMongoDB.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */
@Data
@Builder
public class Address {

	private String address1;
	private String address2;
	private String city;
}
