package com.example.laba1

fun main() {
    println("--- ARRAYS ---")

    // 1. Создать массив из 5 целых чисел и вывести все элементы.
    val arr = intArrayOf(4, 2, 9, 1, 5) // пусть будет не по порядку сразу
    // выводим, тут можно было и цикл, но forEach короче
    arr.forEach { print("$it ") }
    println()

    // 2. Найти сумму элементов массива.
    // если бы не гугл, я бы тут цикл на 5 строк написал, а тут в одну строчку
    val sum = arr.sum()
    println("Сумма: $sum")

    // 3. Найти максимальный элемент массива.
    // max() почему-то IDE подчеркивает, пишет что deprecated, пишу maxOrNull
    val maxVal = arr.maxOrNull()
    println("Максимум: $maxVal")

    // 4. Посчитать количество чётных чисел в массиве.
    val evenCount = arr.count { it % 2 == 0 }
    println("Четных: $evenCount")

    // 5. Развернуть массив (вывести в обратном порядке).
    print("Задом наперед: ")
    // downTo - удобная штука, от последнего индекса до 0
    for (i in arr.lastIndex downTo 0) {
        print("${arr[i]} ")
    }
    println()

    // 6. Проверить, содержит ли массив заданное число.
    val target = 9
    // оператор in, выглядит как читаемый английский
    val contains = target in arr
    println("Есть ли $target? $contains")

    // 7. Отсортировать массив по возрастанию.
    val sortedArr = arr.sortedArray() // возвращает новый отсортированный массив
    println("Сортировка: ${sortedArr.joinToString()}")

    // 8. Создать массив строк и найти самую длинную строку.
    val strArr = arrayOf("привет", "йо", "ку")
    // maxByOrNull и смотрим на длину (length)
    val longest = strArr.maxByOrNull { it.length }
    println("Самая длинная: $longest")

    // 9. Найти индекс минимального элемента массива.
    val minVal = arr.minOrNull()
    val minIndex =
        minVal?.let { arr.indexOf(it) } // indexOf вернет -1 если не найдет, но мы же знаем что оно тут есть
    println("Индекс минимума ($minVal): $minIndex")

    // 10. Умножить каждый элемент массива на 2.
    // map создает новую коллекцию, потом toIntArray() потому что нам нужен именно массив
    val doubled = arr.map { it * 2 }.toIntArray()
    println("Умножили на 2: ${doubled.joinToString()}")


    println("\n--- ARRAYLIST (MutableList) ---")

    // 1. Создать список целых чисел и добавить в него 10 элементов.
    // в котлине обычный List - неизменяемый, поэтому сразу mutableListOf
    val list = mutableListOf<Int>()
    for (i in 1..10) {
        list.add(i)
    }

    // 2. Удалить элемент из списка по индексу.
    list.removeAt(0) // удалили единичку

    // 3. Найти среднее значение элементов списка.
    // average() возвращает Double, это нормально
    println("Среднее: ${list.average()}")

    // 4. Проверить, пустой ли список.
    println("Пустой ли? ${list.isEmpty()}")

    // 5. Заменить элемент списка на другой.
    list[0] = 99 // теперь вместо двойки (так как единичку удалили) тут 99

    // 6. Перевести список строк в верхний регистр.
    val strList = mutableListOf("apple", "banana", "kotlin")
    val upperList = strList.map { it.uppercase() }
    println("Верхний регистр: $upperList")

    // 7. Создать список чисел и удалить все чётные.
    val nums = mutableListOf(1, 2, 3, 4, 5, 6)
    // removeAll с лямбдой, очень удобно
    nums.removeAll { it % 2 == 0 }
    println("Без четных: $nums")

    // 8. Объединить два списка в один.
    val l1 = listOf(1, 2)
    val l2 = listOf(3, 4)
    val combined = l1 + l2 // оператор + работает и для списков!
    println("Объединили: $combined")

    // 9. Найти второй по величине элемент списка.
    val myList = listOf(10, 5, 8, 20, 3)
    // сортируем и берем предпоследний. не самый эффективный способ (O(N log N)),
    // но для лабы по условию подходит, если бы было 100000 элементов, делал бы по-другому
    val secondMax = myList.sorted()[myList.size - 2]
    println("Второй по величине: $secondMax")

    // 10. Преобразовать список чисел в множество (Set).
    val setFromList = myList.toSet()


    println("\n--- SET ---")

    // 1. Создать множество из чисел и вывести его.
    val set1 = setOf(1, 2, 3, 4, 5)
    println("Множество 1: $set1")

    // 2. Добавить в множество повторяющиеся элементы и проверить результат.
    val mutSet = mutableSetOf(1, 2, 3)
    mutSet.add(2) // пытаемся добавить дубль
    mutSet.add(6)
    // размер должен быть 4, а не 5, потому что 2 уже было
    println("После добавления дубля, размер: ${mutSet.size} (само отфильтровалось)")

    // 3. Найти пересечение двух множеств.
    val setA = setOf(1, 2, 3, 4)
    val setB = setOf(3, 4, 5, 6)
    val intersection = setA.intersect(setB)
    println("Пересечение: $intersection")

    // 4. Найти объединение двух множеств.
    val union = setA.union(setB)
    println("Объединение: $union")

    // 5. Найти разность двух множеств.
    val diff = setA.subtract(setB) // то что в А, но нет в В
    println("Разность (A - B): $diff")

    // 6. Проверить, содержится ли элемент в множестве.
    println("Есть ли 3 в setA? ${3 in setA}")

    // 7. Подсчитать количество уникальных символов в строке.
    val text = "программирование"
    // превращаем строку в множество символов и берем размер. гениально просто
    val uniqueChars = text.toSet().size
    println("Уникальных символов в '$text': $uniqueChars")

    // 8. Преобразовать список в множество для удаления дубликатов.
    val listWithDups = listOf(1, 1, 2, 2, 3)
    val noDups = listWithDups.toSet()
    println("Убрали дубли: $noDups")

    // 9. Найти симметрическую разность двух множеств.
    // в котлине нет готовой функции типа symmetricDifference, пришлось комбинировать
    // это (А - В) + (В - А)
    val symDiff = (setA subtract setB) union (setB subtract setA)
    println("Симметрическая разность: $symDiff")

    // 10. Создать множество строк и проверить, есть ли там слово "Kotlin".
    val words = setOf("Java", "Python", "Kotlin", "C++")
    println("Есть ли Kotlin? ${"Kotlin" in words}")


    println("\n--- MAP ---")

    // 1. Создать словарь (Map) с ключами Int и значениями String (например, ID → имя).
    val students = mapOf(
        101 to "Иванов",
        102 to "Петров",
        103 to "Сидоров"
    )

    // 2. Добавить новый элемент в Map.
    // mapOf создает неизменяемый, поэтому для добавлений нужен mutableMapOf
    val mutMap = mutableMapOf(1 to "А", 2 to "Б")
    mutMap[3] = "В" // добавили

    // 3. Получить значение по ключу.
    val name = students[102] // вернет "Петров"
    println("Студент 102: $name")

    // 4. Проверить, есть ли ключ в Map.
    println("Есть ли ключ 105? ${students.containsKey(105)}")

    // 5. Проверить, есть ли значение в Map.
    println("Есть ли value 'Сидоров'? ${students.containsValue("Сидоров")}")

    // 6. Вывести все ключи и значения.
    println("Все пары:")
    students.forEach { (key, value) -> // можно сразу деструктурировать
        println("$key -> $value")
    }

    // 7. Удалить элемент по ключу.
    mutMap.remove(1)

    // 8. Посчитать количество элементов в Map.
    println("Размер mutMap: ${mutMap.size}")

    // 9. Пройтись циклом по словарю и вывести все пары ключ-значение.
    // тут специально сделал через for, как в задании написано "пройтись циклом"
    for ((k, v) in students) {
        // print чтобы в одну строчку было, для красоты
        print("[$k: $v] ")
    }
    println()

    // 10. Создать Map для хранения оценок студентов и найти среднюю оценку.
    val grades = mapOf(
        "Иван" to 4,
        "Петр" to 5,
        "Ольга" to 3,
        "Анна" to 5
    )
    // берем только значения (оценки) и считаем среднее
    val avgGrade = grades.values.average()
    println("Средняя оценка: $avgGrade")
}