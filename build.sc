import mill._, scalalib._

object main extends Cross[EncaseModule]("2.13.2", "2.11.12", "2.12.10")

class EncaseModule(val crossScalaVersion: String) extends CrossScalaModule {
  def scalaVersion = crossScalaVersion

  object test extends Tests {
    def ivyDeps        = Agg(ivy"org.scalatest::scalatest:3.1.2")
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}
