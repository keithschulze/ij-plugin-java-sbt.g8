name := "$name$"

organization := "$organization$"

version := "$version$"

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

resolvers ++= Seq(
    "imagej.releases" at "http://maven.imagej.net/content/repositories/releases",
    "imagej.snapshots" at "http://maven.imagej.net/content/repositories/snapshots",
    "imagej.public" at "http://maven.imagej.net/content/groups/public"
)

libraryDependencies ++= Seq (
    "net.imagej" % "imagej" % "latest.integration"
)

enablePlugins(SbtImageJ)