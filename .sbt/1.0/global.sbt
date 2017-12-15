cancelable in Global := true
forcegc := true
testOptions in Test ++= Seq(Tests.Argument(TestFrameworks.ScalaTest, "-oDF"))

cancelable in Global := true

shellPrompt := { state => "> " }
