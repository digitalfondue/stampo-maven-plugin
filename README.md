# stampo-maven-plugin
maven plugin for [Stampo](https://github.com/digitalfondue/stampo), static website generator

## Goals

### mvn stampo:build
build the website and publish it to the output directory

### mvn stampo:check
check that there are no errors in the source files

### mvn stampo:serve
build the website and make it available on a given local address

### mvn stampo:new [-Darchetype=basic|site|blog|doc]
generate a basic template of the chosen archetype in srcDir

## Configuration parameters

###### srcDir (default={basedir}/src/main/stampo)

location of the source stampo project

###### outputDir (default=${project.build.directory}/stampo)

location where to publish the generated stampo project

###### archetype (default=basic)

define which template to use when generating a basic stampo project.

Allowed values:
* basic: a simple index page
* site: a multilanguage site with paginated news
* blog: a multilanguage blog with pagination and tags support
* doc: a documentation website with table of contents and a choice of both multipage and single page layout.

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
```XML
<groupId>ch.digitalfondue.stampo</groupId>
<artifactId>stampo-maven-plugin</artifactId>
<version>1.2</version>
```

## Example pom.xml
```XML
<plugin>
  <groupId>ch.digitalfondue.stampo</groupId>
  <artifactId>stampo-maven-plugin</artifactId>
  <version>1.2</version>
  <executions>
  <execution>
	  <phase>compile</phase>
	  <goals>
		  <goal>build</goal>
	  </goals>
  </execution>
  </executions>
  <configuration>
    <srcDir>{basedir}/src/main/stampo</srcDir>
    <outputDir>${project.build.directory}/stampo</outputDir>
    <port>45001</port>
  </configuration>
</plugin>
```
