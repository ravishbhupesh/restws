package br.learn.rest.example.calculator.resource;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/sum")
public class SumResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("/oftwovalues")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSum(@QueryParam("param1") @DefaultValue("0") String param1,
			@QueryParam("param2") @DefaultValue("0") String param2) {
		return String.valueOf(Double.sum(new Double(param1), new Double(param2)));
	}

	@GET
	@Path("/ofallvalues")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSumOfAll(@QueryParam("params") List<String> params) {
		Double result = new Double(0);
		for (String param : params) {
			result += new Double(param);
		}
		return String.valueOf(result);
	}
}
