package org.example

import java.lang.*
import java.util.*
import java.io.*
import java.net.*


println "kokos"

def names = ["Johna", "Maryaaa1", "Jane", "111"]

def result = names
    .findAll{ it ==~ /[A-Z][a-z]+/ }
    .collect{ String name -> name.toUpperCase() }
    .sort{ it.length() }

println result



result.eachWithIndex { String entry, int i -> println "${i+1} >> $entry" }

////////////////////////////

def multiplier = { a,b -> a * b }
def doubler = multiplier.curry(2)
def quadrupler = doubler >> doubler

println quadrupler(5)

//////////////////////////////



def something(String value) {
    return value.reverse()
}

Map m = [Amazon: "AWS"].withDefault(this.&something)

println m.Amazon
println m.Google
println m["Amazon"]
println m["Google"]




///////////////////////////////



class Example {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World');
    }
}