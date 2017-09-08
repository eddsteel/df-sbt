cancelable in Global := true
forcegc := true
testOptions in Test ++= Seq(Tests.Argument(TestFrameworks.ScalaTest, "-oDF"))
//scalacOptions := (scalacOptions.value.filterNot(s => s == "-encoding" || s == "UTF-8") ++ Seq(
//  "-deprecation",
//  "-feature",
//  "-language:existentials",
//  "-language:higherKinds",
//  "-language:implicitConversions",
//  "-unchecked"//,
//  "-Xfatal-warnings",
//  "-Xlint",
//  "-Yno-adapted-args",
//  "-Ywarn-numeric-widen",
//  "-Ywarn-value-discard",
//  "-Xfuture"
//)).toSet.toSeq ++ Seq("-encoding", "UTF-8")

// this adds a ton of weight to builds :(

//libraryDependencies += "com.lihaoyi" % "ammonite" % "0.8.4" % "test" cross CrossVersion.full
//initialCommands in (Test, console) := """ammonite.Main().run()"""



// commands += AmmCommand.amm
