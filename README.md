# stampo-maven-plugin
maven plugin for [Stampo](https://github.com/digitalfondue/stampo), static website generator

## Goals

### mvn stampo:build
build the website and publish it to the output directory

### mvn stampo:check
check that there are no errors in the source files

### mvn stampo:serve
build the website and make it available on a given local address

## Configuration parameters

###### srcDir (required)

location of the source stampo project

###### outputDir (required)

location where to publish the generated stampo project

###### hostame (default=localhost)

hostname for the serve goal

###### port (default=8080)

port for the serve goal

###### disableAutoReload (default=false)

disable auto reload of the source project

###### disableRebuildOnChange (default=false)

disable rebuild the source project when there are changes

###### hideDraft (default=false)

hide or show content marked with "draft: true" metadata

## Maven central repository
```
<groupId>ch.digitalfondue.stampo</groupId>
<artifactId>stampo-maven-plugin</artifactId>
<version>1.1</version>
```

## Example pom.xml
```
<plugin>
  <groupId>ch.digitalfondue.stampo</groupId>
  <artifactId>stampo-maven-plugin</artifactId>
  <version>1.1</version>
  <executions>
  <execution>
	  <phase>compile</phase>
	  <goals>
		  <goal>build</goal>
	  </goals>
  </execution>
  </executions>
  <configuration>
    <srcDir>site</srcDir>
    <outputDir>${project.build.directory}/site/</outputDir>
    <port>45001</port>
  </configuration>
</plugin>
```
