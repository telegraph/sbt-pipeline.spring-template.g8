
resolvers += "mvn-artifacts" atS3 "s3://mvn-artifacts/release"

addSbtPlugin("uk.co.telegraph"    % "sbt-pipeline-plugin"  % "1.1.0-b+")
