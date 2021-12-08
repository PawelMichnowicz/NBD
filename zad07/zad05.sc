    val products = Map("Cheeseburger" -> 3, "Hamburger" -> 6, "Hot-Dog" -> 5)
    val cheapProducts = products.map(mc => (mc._1, 0.9*mc._2))
    println(cheapProducts)