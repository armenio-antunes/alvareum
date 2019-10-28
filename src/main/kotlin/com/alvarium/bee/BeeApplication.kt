package com.alvarium.bee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.math.BigDecimal
import kotlin.math.roundToInt

@SpringBootApplication
class BeeApplication

fun main(args: Array<String>) {
	//runApplication<BeeApplication>(*args)

	val myDouble = 21.4
	println("Is myDouble a Double? ${myDouble is Double}")
	println("mDouble is a ${myDouble::class.qualifiedName}")
	println("myDouble javaClass is a ${myDouble.javaClass}")

	val myInteger = myDouble.roundToInt()
	println("myInteger is a ${myInteger::class.qualifiedName}")

	val bd = BigDecimal(17)
	val bd2 : BigDecimal

	bd2 = bd.add(BigDecimal(30))

	var name = "armenio"
	val surname = "antunes"

	name = "john"

	println("hello $name ${surname.toUpperCase()}")
	println("The \$name variable has ${name.length} characters")

	val story = """It was a dark stormy night.
		|A foul smell crept accross the city.
		|Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")

	println(story)

	println(story.replaceAfterLast("it", " would be dawn"))
}

