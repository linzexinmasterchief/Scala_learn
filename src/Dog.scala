class Dog(name: String) extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
}