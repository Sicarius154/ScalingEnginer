package domain

case class ServiceDefinition (serviceName: String, dependencies: Seq[Dependency], maxReplicas: Int)

case class Dependency(serviceName: String, scaleFactor: Int)
