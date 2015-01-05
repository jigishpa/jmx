package com.senyume.jmx.mbean;

import org.springframework.jmx.export.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Jigish Patel
 */

@Component
@ManagedResource (objectName = "com.senyume.jmx.Hello:name=Hello")
public class Hello implements HelloBean {
	
	private String name = "World";
	private String version = "Hello MBean v1.0";
	
	@Override
	@ManagedOperation (description = "adds two numbers")
	@ManagedOperationParameters ({
			@ManagedOperationParameter (name = "x", description = "The first number"),
			@ManagedOperationParameter (name = "y", description = "The second number")})
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	@ManagedOperation(description = "says Hello to the person whose name is specified in name property")
	public String sayHello() {
		return "Hello " + name + "!";
	}

	@Override
	@ManagedAttribute (description = "name used by sayHello() operation")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	@ManagedAttribute(description = "name used by sayHello() operation")
	public String getName() {
		return name;
	}

	@Override
	@ManagedAttribute(description = "version of this demo")
	public String getVersion() {
		return version;
	}
}
