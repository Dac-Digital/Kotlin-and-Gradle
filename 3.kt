// excerpt from build.gradle.kts


allprojects {
   // [...]
   dependencies {
testImplementation(Dependencies.Kotest.runnerJunit5)
testImplementation(Dependencies.Kotest.assertionsJson)
testImplementation(Dependencies.Kotest.propertyTesting)
testImplementation(Dependencies.Kotest.Extensions.kotestPropertyArbs)
testImplementation(Dependencies.Kotest.Extensions.ktorAssertions)
testImplementation(Dependencies.Kotest.Extensions.testcontainers)
   }
   // [...]
}
