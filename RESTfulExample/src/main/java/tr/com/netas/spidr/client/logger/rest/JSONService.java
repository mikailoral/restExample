package tr.com.netas.spidr.client.logger.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import tr.com.netas.spidr.client.logger.JsonObject;
import tr.com.netas.spidr.client.logger.Log;

@Path("/json")
public class JSONService {

	final static Logger logger = Logger.getLogger(JSONService.class);


	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createLog( JsonObject object) {

		
		SimpleLayout layout = new SimpleLayout();
		FileAppender appender;
		try {
			String param = "unknown";
			try {
				String message = object.getLg().get(object.getLg().size()-1).getM();;
				param = message.substring(message.indexOf(":") + 2 , message.indexOf("@"));
				
			} catch (Exception e) {
			}
			
			appender = new FileAppender(layout, param + ".txt", false);
			logger.addAppender(appender);
		} catch (IOException e) {
			logger.error("can not set appender");
		}
		
		for (Log log : object.getLg()) {
			if (logger.isInfoEnabled()) {
				logger.info(log);
			}
		}

		return Response.status(201).entity("OK").build();

	}
	@POST
	@Path("/post/{param}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createParamLog(@PathParam("param") String param, JsonObject object) {
		
		
		SimpleLayout layout = new SimpleLayout();
		FileAppender appender;
		try {
			appender = new FileAppender(layout, param + ".txt", false);
			logger.addAppender(appender);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Log log : object.getLg()) {
			if (logger.isInfoEnabled()) {
				logger.info(log);
			}
		}
		
		return Response.status(201).entity("OK").build();
		
	}

}