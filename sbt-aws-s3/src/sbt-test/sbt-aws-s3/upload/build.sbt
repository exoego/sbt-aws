s3BucketName in aws := "sbt-aws-s3-test"

s3Key in aws := "build.sbt"

credentialProfileName in aws := Some("sbt-aws-scripted-test")

s3File in aws := Some(file("build.sbt"))

s3OverwriteObject in aws := true

s3CreateBucket in aws := true