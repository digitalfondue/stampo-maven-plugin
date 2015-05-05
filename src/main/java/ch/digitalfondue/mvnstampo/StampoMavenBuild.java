package ch.digitalfondue.mvnstampo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import ch.digitalfondue.stampo.command.Build;

@Mojo(name="build")
public class StampoMavenBuild extends AbstractMojo {
  
  @Parameter(required=true)
  private String srcDir;
  
  @Parameter(required=true)
  private String outputDir;

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Build build = new Build();
    build.setSrcPath(srcDir);
    build.setDistPath(outputDir);
    build.run();
  }

}
