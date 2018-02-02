name := "zkconn"

version := "0.1"

scalaVersion := "2.11.8"

resolvers += "twitter" at "https://maven.twttr.com"

libraryDependencies += "com.twitter" %% "finagle-core" % "6.24.0"
libraryDependencies += "com.twitter" %% "finagle-zookeeper" % "6.24.0"