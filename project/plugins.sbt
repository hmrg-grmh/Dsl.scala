addSbtPlugin("com.thoughtworks.sbt-best-practice" % "sbt-best-practice" % "7.0.1+28-0b91b5bf")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.5")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.3.0+16-0f6d7799")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")

addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.2")

addSbtPlugin("com.thoughtworks.example" % "sbt-example" % "6.0.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.0")

dependencyOverrides += sbt.Defaults.sbtPluginExtra("org.scala-js" % "sbt-scalajs" % "0.6.26",
                                                   (pluginCrossBuild / sbtBinaryVersion).value,
                                                   (update / scalaBinaryVersion).value)
