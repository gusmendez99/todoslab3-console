package com.gustavomendez.lab3.models

class ToDoList (
        val name: String,
        private val toDoList: ArrayList<ToDo> = ArrayList()
) {

    //Funcion privada solamete para busqueda de la clase

    fun addToDo(toDo: ToDo) {
        toDoList.add(toDo)
    }

    fun getAllToDos(): ArrayList<ToDo> {
        return toDoList
    }

    fun getAllToDosString():String {
        var toDos:String = ""
        for(i in toDoList.indices){
            toDos += "${i + 1}. ${toDoList.get(i)}\n"
        }
        return toDos
    }

    fun getIncompleteToDos(): List<ToDo> {
        return toDoList.filter{!it.state}
    }

    fun getIncompleteToDosString():String {
        var toDos:String = ""
        val incompleteToDos = getIncompleteToDos()

        for(i in incompleteToDos.indices){
            toDos += "${i + 1}. ${incompleteToDos.get(i)}\n"
        }
        return toDos
    }

    fun getToDo(pos:Int):ToDo? {
        if(toDoList.get(pos) != null) {
            return toDoList.get(pos)
        }
        return null
    }

    fun deleteToDo(pos:Int) {
        toDoList.removeAt(pos)
    }


    /*
    override fun toString(): String {
        val studentNames = students.map{ it.name }.joinToString()
        return """
            Level:
                Name: $name
                Students: $studentNames
        """.trimIndent()
    }
    */


}