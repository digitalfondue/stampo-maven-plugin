package ch.digitalfondue.stampo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import ch.digitalfondue.stampo.command.New;

@Mojo(name="new")
public class StampoMavenNew extends AbstractMojo {
	  
	  @Parameter(required=true, defaultValue = "${basedir}/src/main/stampo")
	  private String srcDir;
	  
	  @Parameter(property = "archetype",
	             defaultValue = "basic",
	             required = true)
	  private String archetype;

	  @Override
	  public void execute() throws MojoExecutionException, MojoFailureException {
	    New n = new New();
	    n.setArchetype(archetype);
	    n.setSrcPath(srcDir);
	    n.run();
	  }

	}
