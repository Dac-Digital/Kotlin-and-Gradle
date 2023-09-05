// excerpt from Dependencies.kt


object Dependencies {
   object Kotest {
       val runnerJunit5 = kotestArtifact("kotest-runner-junit5-jvm")
       val assertionsJson = kotestArtifact("kotest-assertions-json")
       val propertyTesting = kotestArtifact("kotest-property")


       private fun kotestArtifact(artifactId: String) = "io.kotest:$artifactId:${Versions.kotest}"


       object Extensions {
           val ktorAssertions = kotestExtensionsArtifact("kotest-assertions-ktor", Versions.kotestKtorAssertions)
           val kotestPropertyArbs = kotestExtensionsArtifact("kotest-property-arbs", Versions.kotestPropertyArbs)
           val testcontainers = kotestExtensionsArtifact("kotest-extensions-testcontainers", Versions.kotestTestContainers)


           private fun kotestExtensionsArtifact(artifactId: String, version: String) = "io.kotest.extensions:$artifactId:$version"
       }
   }


}
