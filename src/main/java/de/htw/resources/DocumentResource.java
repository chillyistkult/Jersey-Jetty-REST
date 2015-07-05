package de.htw.resources;

import javax.ws.rs.*;

import de.htw.core.DocumentManager;

import com.google.inject.Inject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

@Path("/resources")
public class DocumentResource {
	private final DocumentManager manager;

	@Inject
	public DocumentResource(DocumentManager manager) {
		this.manager = manager;
	}

	@GET
	@Produces("application/json")
	public HashMap retrieve() {
		return manager.getResources();
	}

	@POST
	@Consumes("application/json")
	public void update(HashMap resources) {
		manager.setResources(resources);
	}

	@GET
	@Path("{id}")
	@Produces("application/json")
	public String getDocumentById(@PathParam("id") int id) throws IOException {
		return new String(Files.readAllBytes(Paths.get(manager.getResources().get(id).getPath())));
	}

	@DELETE
	@Path("{id}")
	@Produces("application/json")
	public HashMap deleteDocumentById(@PathParam("id") int id) throws IOException {
		manager.getResources().remove(id);
		return manager.getResources();
	}


}