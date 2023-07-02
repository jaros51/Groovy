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

//////////////////////////////

def str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor."
def result1 = (str =~ /\b[A-Za-z]/)
    .replaceAll{match ->
      "[${match.group()}]".toString()
}
println(result1)
///////////////////////////////


abstract class Something {
    abstract void foo()
    abstract void bar()
}

Something something = [
        foo: { println "Ffoo" },
        bar: { println "Bbar" }
] as Something

something.foo()
something.bar()

////////////////////////////////

Runnable runnable = {
    println "Im koko"
}

runnable.run()



////////////////////////////////

def sum = (0..20).inject(0) { acc, n-> acc + n }

println sum

def product = (1..10).inject(1) { acc, n-> acc * n }

println product

////////////////////////////////


def closure = {
    add(1)
    add(2)
}

def list =  []

closure.delegate = list
closure.resolveStrategy = Closure.DELEGATE_ONLY
closure()

println list



////////////////////////////////

def filename =  "c:/temp/${UUID.randomUUID().toString()}" /// TODO !!! WIN / MAC

new File(filename) << """
${UUID.randomUUID().toString()}
${UUID.randomUUID().toString()}
${UUID.randomUUID().toString()}
""".trim()

new File(filename).eachLine { line ->
    println line
}
////////////////////////////////


//System.in.eachLine { line ->
//    println line.toUpperCase()
//
//}
System.in.eachByte { byte b->
    println b
}

////////////////////////////////


class Example {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World');
    }
}