name := "ravent-rest-api"

scalaVersion := "2.10.2"

version := "1.0"

seq(webSettings :_*)

libraryDependencies ++= Seq(
"javax.ws.rs" % "javax.ws.rs-api" % "2.0",
"org.jboss.resteasy" % "resteasy-jaxrs" % "3.0.3.Final" exclude("org.slf4j", "slf4j-simple"),
"com.fasterxml.jackson.jaxrs" % "jackson-jaxrs-json-provider" % "2.2.1",
"org.eclipse.jetty" % "jetty-webapp" % "9.0.5.v20130815" % "container",
"com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.2.1",
"ch.qos.logback" % "logback-classic" % "1.0.13",
"org.slf4j" % "log4j-over-slf4j" % "1.7.5"
)
