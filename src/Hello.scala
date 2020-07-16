object Hello extends App {
  var boo = true
  var text = "aaaaaaaaaa!!!"

  if (!boo) println("wiiiii!!! Hello, World!" + text)
  if (boo) println(text)

  var x = for (i <- 1 to 5) yield i * 2
  for (i <- x) println(i)

  var h = new HelloWorld()
  var s = h.sayHi()
  println(s)
}