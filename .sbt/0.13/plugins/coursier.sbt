if (sys.env.get("DISABLE_COURSIER").isEmpty)
  addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC11")
else
  Seq()
