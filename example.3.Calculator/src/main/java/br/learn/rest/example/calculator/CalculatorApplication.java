/**
 * 
 */
package br.learn.rest.example.calculator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author RavishB
 *
 */
public class CalculatorApplication extends Application {
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(br.learn.rest.example.calculator.resource.SumResource.class));
	}
}
