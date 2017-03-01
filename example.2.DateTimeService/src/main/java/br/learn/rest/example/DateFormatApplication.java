/**
 * 
 */
package br.learn.rest.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author RavishB
 *
 */
public class DateFormatApplication extends Application {

	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(br.learn.rest.example.resource.DateResource.class));
	}
}
