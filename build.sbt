
version := "0.1"


lazy val commonSettings = Seq(
  organization := "com.deciphernow",
  scalaVersion := "2.12.4",
  name := "zkconn",
  resolvers ++= Seq(
    "Sonatype" at "http://repository.sonatype.org/",
    "Search Maven" at "http://search.maven.org/",
    "Maven Central" at "http://central.maven.org/maven2/",
    "Twitter Maven" at "http://maven.twttr.com",
    Resolver.mavenLocal
  )
)


//libraryDependencies += "com.twitter" %% "finagle-core" % "6.42.0"
//libraryDependencies += "com.twitter" %% "finagle-zookeeper" % "6.24.0"

lazy val root = (project in file(".")).
  settings(commonSettings).
  settings(
    mainClass in Compile := Some("zkConn"),
    version := "0.1",
    libraryDependencies ++= Dependencies.root
  )
