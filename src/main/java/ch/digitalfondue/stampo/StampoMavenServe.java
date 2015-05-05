package ch.digitalfondue.stampo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import ch.digitalfondue.stampo.command.Serve;

@Mojo(name="serve")
public class StampoMavenServe extends AbstractMojo {

  @Parameter(required=true)
  private String srcDir;
  
  @Parameter(required=true)
  private String outputDir;
  
  @Parameter(defaultValue="8080")
  private int port;
  
  @Parameter(defaultValue="localhost")
  private String hostname;
  
  @Parameter(defaultValue="false")
  private boolean disableRebuildOnChange;
  
  @Parameter(defaultValue="false")
  private boolean disableAutoReload;
  
  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    Serve serve = new Serve();
    serve.setSrcPath(srcDir);
    serve.setDistPath(outputDir);
    serve.setPort(port);
    serve.setHostname(hostname);
    serve.setDisableAutoReload(disableAutoReload);
    serve.setDisableRebuildOnChange(disableRebuildOnChange);
    serve.setBlockingOnStart(true);
    
    serve.run();
  }

}
