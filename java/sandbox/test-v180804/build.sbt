name := """test-v180804"""
organization := "com.codepianist"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += "org.projectlombok" % "lombok" % "1.16.16"
