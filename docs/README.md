<p class="josman-to-strip">
WARNING: WORK IN PROGRESS - THIS IS ONLY A TEMPLATE FOR THE DOCUMENTATION. <br/>
RELEASE DOCS ARE ON THE <a href="http://diversicon-kb.eu/manual/diversicon-wordnet-3.1" target="_blank">PROJECT WEBSITE</a>
</p>


If you use Maven as build system, put the following snippets in `dependencies` section of your `pom.xml`:



### Java metadata

```xml
	<dependency>
		<groupId>eu.kidf</groupId>
		<artifactId>div-wn31-model</artifactId>
		<version>0.1.0</version>		
	</dependency>

```


### H2 db 

```xml
	<dependency>
		<groupId>eu.kidf</groupId>
		<artifactId>div-wn31-h2db</artifactId>
		<version>0.1.0</version>		
	</dependency>

```

To access the database, use these credentials:

User: `root`
Password: `pass`

### SQL

```xml
	<dependency>
		<groupId>eu.kidf</groupId>
		<artifactId>div-wn31-sql</artifactId>
		<version>0.1.0</version>		
	</dependency>

```


### XML 

```xml
	<dependency>
		<groupId>eu.kidf</groupId>
		<artifactId>div-wn31-xml</artifactId>
		<version>0.1.0</version>		
	</dependency>

```
