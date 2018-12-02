lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scalaVersion$"
    )),
  name := "$name$"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "$sparkVersion$",
  "org.scalatest" %% "scalatest" % "2.2.1" % Test,
  "org.scalacheck" %% "scalacheck" % "1.12.1" % Test
)

initialCommands := "import $organization$.$name;format="lower,word"$._"