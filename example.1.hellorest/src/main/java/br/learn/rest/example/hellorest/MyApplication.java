/**
 * 
 */
package br.learn.rest.example.hellorest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author RavishB
 *
 */
public class MyApplication extends Application {

	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(MyResource.class));
	}
}
