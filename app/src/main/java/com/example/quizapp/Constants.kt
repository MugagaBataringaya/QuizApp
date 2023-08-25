package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val question1 = Question(1, "Can you name this animal?",
            R.drawable.ic_crocodile,
            "Lion",
            "Deer",
            "Crocodile",
            "Shark",
            3
            )
        questionsList.add(question1)

        val question2 = Question(2, "Can you name this animal?", R.drawable.ic_dinosaurs,
            "Elephant",
            "Dinosaur",
            "Snake",
            "Segal",
            2
        )
        questionsList.add(question2)

        val question3 = Question(3, "Can you name this animal?", R.drawable.ic_elephant,
            "Elephant",
            "Dinosaur",
            "Snake",
            "Lion",
            1
        )
        questionsList.add(question3)

        val question4 = Question(4, "Can you name this animal?", R.drawable.ic_horse,
            "Elephant",
            "Lion",
            "Deer",
            "Horse",
            4
        )
        questionsList.add(question4)

        val question5 = Question(5, "Can you name this animal?", R.drawable.ic_leopard,
            "Elephant",
            "Leopard",
            "Shark",
            "Horse",
            2
        )
        questionsList.add(question5)

        val question6 = Question(6, "Can you name this animal?", R.drawable.ic_segal,
            "Parrot",
            "Sparrow",
            "Segal",
            "None of these",
            3
        )
        questionsList.add(question6)

        val question7 = Question(7, "Can you name this animal?", R.drawable.ic_shark,
            "Shark",
            "Leopard",
            "Elephant",
            "Sparrow",
            1
        )
        questionsList.add(question7)

        val question8 = Question(8, "Can you name this animal?", R.drawable.ic_snake,
            "Lion",
            "Leopard",
            "Shark",
            "Snake",
            4
        )
        questionsList.add(question8)

        val question9 = Question(9, "Can you name this animal?", R.drawable.ic_wolf,
            "Wolf",
            "Shark",
            "Leopard",
            "Lion",
            1
        )
        questionsList.add(question9)

        val question10 = Question(10, "Can you name this animal?", R.drawable.ic_deer,
            "Leopard",
            "Lion",
            "Deer",
            "Lion",
            3
        )
        questionsList.add(question10)
        return questionsList
    }

}