name := "sprint2cv1"

version := "0.1"

scalaVersion := "2.12.8"

val hadoopVersion = "2.7.7"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % hadoopVersion
libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % hadoopVersion

val sparkVersion = "2.4.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

libraryDependencies += "org.apache.hive" % "hive-jdbc" % "1.1.0-cdh5.16.2"
resolvers += "Cloudera" at "http://repository.cloudera.com/artifactory/cloudera-repos/"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic-extras",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-literal",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


