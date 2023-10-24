package com.example.myfirstapp

data class Result(val isSuccess: Boolean)

class University(val name: String, val year: Int) {
    val professors = mutableListOf<Professor>()
    val students = mutableListOf<Student>()

    fun hire(professor: Professor) {
        professors.add(professor)
        println("${professor.name}  $name.")
    }

    fun enroll(student: Student) {
        students.add(student)
        println("${student.name}  $name.")
    }
}

class Professor(val name: String, val age: Int, val annualSalary: Int) {
    val courses = mutableListOf<Course>()

    fun teach(course: Course) {
        courses.add(course)
        println("$name enseigne le cours ${course.name}.")
    }

    fun doOralExam(student: Student, course: Course): Result {
        val isSuccess = Math.random() < 0.7
        return Result(isSuccess)
    }
}

class Student(val name: String, val age: Int, val studentID: Int) {
    val coursesEnrolled = mutableListOf<Course>()
    var successProbability = 0.8

    fun enroll(course: Course) {
        coursesEnrolled.add(course)
        println("$name s'est inscrit au cours ${course.name}.")
    }

    fun takeExam(course: Course) {
        val result = course.professor.doOralExam(this, course)
        if (result.isSuccess) {
            println("$name a réussi l'examen dans le cours ${course.name}.")
        } else {
            println("$name a échoué à l'examen dans le cours ${course.name}.")
        }
    }

    fun learn() {

    }

    fun party() {

    }

    fun grade(course: Course) {
        if (Math.random() < successProbability) {
            println("$name a obtenu une bonne note dans le cours ${course.name}.")
        } else {
            println("$name a obtenu une mauvaise note dans le cours ${course.name}.")
        }
    }
}

class Course(val name: String, val professor: Professor)

fun main() {
    val myUniversity = University("Ma Belle Université", 1990)
    val prof = Professor("Professeur Smith", 40, 60000)
    val student = Student("Étudiant Johnson", 20, 12345)
    val course = Course("Mathématiques Avancées", prof)

    myUniversity.hire(prof)
    myUniversity.enroll(student)

    prof.teach(course)
    student.enroll(course)
    student.takeExam(course)
    student.learn()
    student.party()
    student.grade(course)
}
