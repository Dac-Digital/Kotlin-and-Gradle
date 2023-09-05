// excerpt from build.gradle.kts


jib {
   val acr: String by project
   val imageName: String by project
   val baseImageName: String by project
   val dockerPort: String by project
   val buildId: String? by project


   from {
       image = baseImageName
   }
   container {
       ports = listOf(dockerPort)
       mainClass = appMainClass
       jvmFlags = listOf(
           "-server",
           "-Xmx512M",
           "-Xms512M",
           "-XX:+UseG1GC",
           "-XX:MaxGCPauseMillis=500",
           "-XX:+UseStringDeduplication"
       )
   }
   to {
       image = "$acr/$imageName"
       tags = setOf(buildId)
   }
}
