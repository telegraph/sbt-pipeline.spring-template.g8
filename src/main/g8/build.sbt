import sbt.Keys._

// give the user a nice default project!
lazy val buildNumber = sys.env.get("BUILD_NUMBER").map( bn => s"b\$bn")

lazy val root = (project in file("."))
  .configs       (IntegrationTest)
  .settings      (Defaults.itSettings:_*)
  .settings(
    name                                  := "$name;format="normalize"$",
    version                               := "1.0.0-" + buildNumber.getOrElse("SNAPSHOT"),
    // Deployment
    (stackCustomParams in DeployDev    )  += ("BuildVersion" -> version.value),
    (stackCustomParams in DeployPreProd)  += ("BuildVersion" -> version.value),
    (stackCustomParams in DeployProd   )  += ("BuildVersion" -> version.value)
  )
