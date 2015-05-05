package ch.digitalfondue.mvnstampo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import ch.digitalfondue.stampo.command.Check;

@Mojo(name="check")
public class StampoMavenCheck extends AbstractMojo {

  @Parameter(required=true)
  private String srcDir;
  
  @Parameter(required=true)
  private String outputDir;
  
  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Check check = new Check();
    check.setSrcPath(srcDir);
    check.setDistPath(outputDir);
    check.run();
  }

}
