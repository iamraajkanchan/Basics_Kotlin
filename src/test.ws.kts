val apple = setOf<String>("Apple", "Orange", "Mango", "Banana")

apple.stream().distinct().findFirst()