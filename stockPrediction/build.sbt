name := "stock_prediction"
version := "1.0"
scalaVersion := "2.11.7"
 
libraryDependencies ++= {
  Seq(
    /* Cloudera */
    "com.cloudera.sparkts" % "sparkts" % "0.4.0",

    /* Scala */
    "org.scala-lang" % "scala-swing" % "2.11.0-M7",
    "org.apache.spark" %% "spark-sql" % "2.2.0",
    "org.apache.spark" %% "spark-mllib" % "2.2.0",
    "org.apache.spark" %% "spark-core" % "2.2.0"
  )
}
