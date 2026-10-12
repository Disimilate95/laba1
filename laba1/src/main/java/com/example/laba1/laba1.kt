package com.example.laba1

// 2 задание из Variables: константу pi вынес наверх, чтобы внутри main() не ругалось на const val
const val pi: Double = 3.14159

fun main() {
    println("=== VARIABLES ===")

    // 1. Объявить переменную x типа Int и присвоить значение 10.
    var x: Int = 10
    println("1. x = $x")

    // 2. Создать константу pi типа Double со значением 3.14159.
    // (pi уже объявлена сверху как const val)

    // 3. Объявить переменную isActive типа Boolean и задать false.
    var isActive: Boolean = false
    println("3. isActive = $isActive")

    // 4. Создать переменную temperature типа Float, присвоить 36.6.
    var temperature: Float = 36.6f // добавил f, иначе компилятор ругается
    println("4. temperature = $temperature")

    // 5. Объявить переменную count типа Long и присвоить большое число.
    var count: Long = 9999999999L // добавил L в конце
    println("5. count = $count")

    // 6. Объявить переменную letter типа Char и присвоить 'A'.
    var letter: Char = 'A'
    println("6. letter = $letter")

    // 7. Создать две переменные a, b типа Int, сложить их и вывести результат.
    var a: Int = 15
    var b: Int = 25
    var sum = a + b
    println("7. Сумма a и b = $sum")

    // 8. Создать переменную radius и вычислить площадь круга.
    var radius: Double = 5.0
    var area = pi * radius * radius
    println("8. Площадь круга = $area")

    // 9. Создать переменную salary типа Int, увеличить на 15% и вывести.
    var salary: Int = 50000
    salary = (salary * 1.15).toInt() // умножил на 1.15 и перевел обратно в Int
    println("9. Новая зарплата = $salary")

    // 10. Создать переменную price и вычислить цену с налогом (НДС 12%).
    var price: Double = 100.0
    var priceWithTax = price * 1.12
    println("10. Цена с НДС = $priceWithTax")


    println("\n=== DATA TYPES ===")

    // 1. Создать переменные разных типов: Int, Double, Boolean, String, Char.
    var myInt: Int = 42
    var myDouble: Double = 3.14
    var myBool: Boolean = true
    var myString: String = "Привет"
    var myChar: Char = 'K'

    // 2. Преобразовать Double в Int и вывести результат.
    var d1: Double = 9.99
    var i1: Int = d1.toInt()
    println("2. Double to Int: $i1")

    // 3. Создать переменную num = 1234, преобразовать в строку.
    var num = 1234
    var strNum = num.toString()
    println("3. Int to String: $strNum")

    // 4. Взять строку "56", преобразовать в Int и умножить на 2.
    var str56 = "56"
    var result4 = str56.toInt() * 2
    println("4. Строка в Int и умножить: $result4")

    // 5. Проверить, что число 10 больше 5, вывести результат в Boolean.
    var isGreater: Boolean = 10 > 5
    println("5. 10 > 5: $isGreater")

    // 6. Создать переменную isEven, которая хранит результат проверки чётности числа.
    var numberToCheck = 8
    var isEven: Boolean = numberToCheck % 2 == 0
    println("6. Число $numberToCheck четное? $isEven")

    // 7. Преобразовать Boolean в строку.
    var boolToStr = myBool.toString()
    println("7. Boolean to String: $boolToStr")

    // 8. Вывести минимальное и максимальное значение для типа Int.
    println("8. Min Int: ${Int.MIN_VALUE}, Max Int: ${Int.MAX_VALUE}")

    // 9. Создать переменную ch = 'b', преобразовать её в Int.
    var ch = 'b'
    var chToInt = ch.toInt()
    println("9. Char 'b' to Int (код символа): $chToInt")

    // 10. Создать переменную num = 97, преобразовать в символ.
    var num97 = 97
    var intToChar = num97.toChar()
    println("10. Int 97 to Char: $intToChar")


    println("\n=== STRING ===")

    // 1. Создать строку "Kotlin" и вывести её длину.
    var s1 = "Kotlin"
    println("1. Длина строки: ${s1.length}")

    // 2. Вывести первый и последний символ строки "Hello".
    var s2 = "Hello"
    println("2. Первый: ${s2.first()}, Последний: ${s2.last()}")

    // 3. Объединить строки "Good" и "Morning" в одну.
    var s3 = "Good" + " " + "Morning"
    println("3. Объединение: $s3")

    // 4. Создать строку "banana", заменить "a" на "o".
    var s4 = "banana"
    var s4New = s4.replace("a", "o")
    println("4. Замена: $s4New")

    // 5. Сконкатенировать имя и возраст в одну строку с шаблоном.
    var name = "Иван"
    var age = 20
    var s5 = "Меня зовут $name и мне $age лет"
    println("5. Шаблон: $s5")

    // 6. Дана строка "Welcome". Вывести подстроку с 1 по 3 символ.
    var s6 = "Welcome"
    var s6Sub = s6.substring(1, 4)
    println("6. Подстрока: $s6Sub")

    // 7. Создать строку " Kotlin ", удалить пробелы по краям.
    var s7 = " Kotlin "
    var s7Trim = s7.trim()
    println("7. Trim: '$s7Trim'")

    // 8. Проверить, содержится ли слово "Java" в строке "I love Java and Kotlin".
    var s8 = "I love Java and Kotlin"
    var hasJava = s8.contains("Java")
    println("8. Есть ли Java? $hasJava")

    // 9. Создать строку "Hello, World!", преобразовать все буквы в верхний регистр.
    var s9 = "Hello, World!"
    var s9Up = s9.uppercase()
    println("9. Верхний регистр: $s9Up")

    // 10. Создать строку "HELLO", преобразовать в нижний регистр.
    var s10 = "HELLO"
    var s10Low = s10.lowercase()
    println("10. Нижний регистр: $s10Low")

    // 11. Создать строку "Kotlin is fun", подсчитать количество слов.
    var s11 = "Kotlin is fun"
    var words = s11.split(" ")
    var wordCount = words.size
    println("11. Количество слов: $wordCount")

    // 12. Создать строку "abc", повторить её 3 раза (abcabcabc).
    var s12 = "abc"
    var s12Rep = s12.repeat(3)
    println("12. Повтор: $s12Rep")

    // 13. Создать строку "123", преобразовать в список символов.
    var s13 = "123"
    var charList = s13.toList()
    println("13. Список символов: $charList")

    // 14. Из строки "racecar" проверить, является ли она палиндромом.
    var s14 = "racecar"
    var isPal = s14 == s14.reversed()
    println("14. Палиндром? $isPal")

    // 15. Из строки "apple,banana,orange" сделать список слов.
    var s15 = "apple,banana,orange"
    var fruitList = s15.split(",")
    println("15. Список фруктов: $fruitList")
}