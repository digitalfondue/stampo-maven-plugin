package ch.digitalfondue.stampo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import ch.digitalfondue.stampo.command.Build;

@Mojo(name="build")
public class StampoMavenBuild extends AbstractMojo {
  
  @Parameter(required=true, defaultValue = "${basedir}/src/main/stampo")
  private String srcDir;
  
  @Parameter(required=true, defaultValue = "${project.build.directory}/stampo")
  private String outputDir;
  
  @Parameter(defaultValue="false")
  private boolean hideDraft;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Build build = new Build();
    build.setHideDraft(hideDraft);
    build.setSrcPath(srcDir);
    build.setDistPath(outputDir);
    build.run();
  }

}
