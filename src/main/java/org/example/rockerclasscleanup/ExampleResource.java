package org.example.rockerclasscleanup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class ExampleResource {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String father() {
        return views.HostingPage.template().render().toString();
    }
}
