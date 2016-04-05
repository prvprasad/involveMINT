package org.involvemint.service.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.involvemint.data.dao.IMAdminDAO;
import org.involvemint.data.model.ProjectCause;
import org.involvemint.data.model.ProjectType;

@Path("/admin")
public class AdminREST {

	@Path("/types")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<ProjectType> getAllTypes() {
		System.out.println("Getting all Project Types...");
		return IMAdminDAO.getProjectTypes();
	}

	@Path("/types/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectType getTypeById(@PathParam("id") Integer id) {
		System.out.println("Getting ProjectType by ID: " + id);

		return IMAdminDAO.getProjectType(id);
	}

	@Path("/types/{id}")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectType updateProjectType(ProjectType projType) {
		System.out.println("Updating Project Type");
		IMAdminDAO.updateProjectType(projType);
		return projType;
	}

	@Path("/types/add")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectType addProjectType(ProjectType projType) {
		System.out.println("Adding Projetc Type " + projType.getProjTypeName());

		IMAdminDAO.addProjectType(projType);
		return projType;
	}

	@Path("/types/{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public int deleteProjTypeById(@PathParam("id") Integer id) {
		System.out.println("Deleting Project Type with ID: " + id);
		return IMAdminDAO.deleteProjectType(id);
	}

	@Path("/causes")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<ProjectCause> getAllCauses() {
		System.out.println("Getting all Project Causes...");
		return IMAdminDAO.getProjectCauses();
	}

	@Path("/causes/{id}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectCause getCauseById(@PathParam("id") Integer id) {
		System.out.println("Getting ProjectCause by ID: " + id);

		return IMAdminDAO.getProjectCause(id);
	}

	@Path("/causes/{id}")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectCause updateProjectCause(ProjectCause projCause) {
		System.out.println("Updating Project Cause");
		IMAdminDAO.updateProjectCause(projCause);
		return projCause;
	}

	@Path("/causes/add")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ProjectCause addProjectCause(ProjectCause projCause) {
		System.out.println("Adding Projetc Cause " + projCause.getProjCauseName());

		IMAdminDAO.addProjectCause(projCause);
		return projCause;
	}

	@Path("/causes/{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public int deleteProjCauseById(@PathParam("id") Integer id) {
		System.out.println("Deleting Project Cause with ID: " + id);
		return IMAdminDAO.deleteProjectCause(id);
	}
}
