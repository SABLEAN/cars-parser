lazy val root = project
  .in(file("."))
  .settings(
    organization               := "com.example",
    name                       := "cars-parser",
    version                    := "0.1",
    scalaVersion               := "2.13.7",
    assembly / assemblyJarName := "cars-parser.jar",
    assembly / mainClass       := Some("CarsParser"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest"          % "3.2.10" % "test",
      "org.scalatest" %% "scalatest-wordspec" % "3.2.10" % "test",
      "org.typelevel" %% "cats-effect"        % "3.2.9",
      "org.typelevel" %% "cats-core"          % "2.6.1"
    )
  )
