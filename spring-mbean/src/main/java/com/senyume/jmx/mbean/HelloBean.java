package com.senyume.jmx.mbean;

import org.springframework.stereotype.Component;

/**
 * @author Jigish Patel
 */

@Component

public interface HelloBean {

	public int add(int x, int y);

	public String sayHello();

	public void setName(String name);

	public String getName();

	public String getVersion();
	
}
