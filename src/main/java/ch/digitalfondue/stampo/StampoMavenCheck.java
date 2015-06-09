package ch.digitalfondue.stampo;

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
  
  @Parameter(defaultValue="false")
  private boolean hideDraft;
  
  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Check check = new Check();
    check.setHideDraft(hideDraft);
    check.setSrcPath(srcDir);
    check.setDistPath(outputDir);
    check.run();
  }

}
