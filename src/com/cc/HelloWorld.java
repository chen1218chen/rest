package com.cc;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


//url中具体访问方法
@Path("/cc1")
public class HelloWorld {

	//http://localhost:8080/rest/jaxrs/cc1?name=xiaoma
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getResult(@QueryParam("name") String name) {
		return result(name);
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String postResult(@QueryParam("name") String name) {
		return result(name);
	}

	private String result(String name) {
		return name + ", hello";
	}
	
	 @GET        //设置此服务为get请求的服务  
	 @Path("add/{id}")       //add/1+1  
	 //http://localhost:8080/rest/jaxrs/cc1/add/1+1
    public String add(@PathParam("id") String s){  
        String[]ss = s.split("\\+");  
        return s+"="+String.valueOf(Integer.parseInt(ss[0])+Integer.parseInt(ss[1]));  
    }
	
}
