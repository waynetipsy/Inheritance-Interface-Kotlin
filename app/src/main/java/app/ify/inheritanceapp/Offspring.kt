package app.ify.inheritanceapp

class Offspring : Secondary(), Archery, Singer {
    override fun archery() {
        super.archery()
        println("Archery skills enhanced by offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by offspring")
    }
}