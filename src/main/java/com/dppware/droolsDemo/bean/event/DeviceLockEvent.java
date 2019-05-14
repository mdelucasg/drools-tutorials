package com.dppware.droolsDemo.bean.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class DeviceLockEvent {
	/**
	 * Device Id
	 */
	private String name;
	
	private String value;
}