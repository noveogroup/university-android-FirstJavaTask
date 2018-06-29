# Android: Kotlin - Первая задача

В папке app/src/main/kotlin можно найти исходники проекта, с которого можно начать работу. Вы можете модифицировать код в этом проекте как вам угодно.

## Задание
Есть три типа устройств: телефоны, ноутбуки и планшеты. У каждого из них есть своя цена.
Необходимо написать несколько функций сортировки, которые могли бы сортировать по возрастанию/убыванию цены массив устройств.

### Указания
1. Алгоритмы для реализации: сортировка пузырьком, сортировка вставками, быстрая сортировка (quicksort).
1. Для каждого  алгоритма сортировки и для каждого девайса необходимо выделить свой класс.
1. Классы сортировок должны реализовывать интерфейс Algorithm.
1. Классы устройств должны реализовывать интерфейс Device.

### Как начать работу
1. Скопировать https ссылку для клонирования репозитория
2. Открыть Gitlab, и нажать `New Project`
3. На странице создания выбрать:
    * Create from template - Blank
    * Import project from - Repo by URL
    * Project name - {account}-kotlin-01, где account - ваше короткое имя
4. Нажать `Create project`
5. Теперь можно клонировать проект из вашего собственного репозитория

### Как открыть проект в Intelij IDEA
1. Открываем IDE, Выбираем `File \ Open ...`.
1. В появившемся диалоговом окне ищем путь до проекта, выбиарем build.gradle в корне.
1. Выбираем `Open as project`.
1. В появившемся диалоговом окне указываем JDK, если не найдена, соглашаемся со всем, ничего не меняя.
1. Открываем `app/src/main/kotlin/.../Main.kt` и жмем кнопку "play" около функции main.