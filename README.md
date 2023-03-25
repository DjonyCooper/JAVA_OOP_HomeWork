# Домашние работы по Java ООП

Выполненная домашняя работа лежит в:

`package OOP_*number_seminar*`

внутри директории `Java`

<details><summary>Цели на репозиторий:</summary>
<p>
<!-- <b><u>✔️ Выполнить:</u></b> -->

✔️ Выполнить домашнюю работу 1 семинара
  
✔️ Выполнить домашнюю работу 2 семинара

✔️ Выполнить домашнюю работу 3 семинара
  
✔️ Выполнить домашнюю работу 4 семинара
  
✔️ Выполнить домашнюю работу 5 семинара
  
✔️ Выполнить домашнюю работу 6 семинара
  
➖ Выполнить домашнюю работу 7 семинара

</p>
</details>


↓ Домашние работы по семинарам с заданиями:

<details><summary><h4>Семинар 1: Принципы ООП: Инкапсуляция, наследование, полиморфизм</h4></summary>

✔️ Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
В файле readme.md в репозитории github (или ему подобных) описать какие проблемы в таком проектировании Вы увидели,
там же написать возникшие при выполнении дз вопросы (если они есть).

</details>

<details><summary><h4>Семинар 2: Принципы ООП Абстракция и интерфейсы. Пример проектирования</h4></summary>

✔️ Создать класс Doctor. Создайте интерфейсы Runnable, Flyable, Swimmable. У интерфейсов должны быть
методы получения скорости заданного действия.
Добавьте наследников этим интерфейсам, но таким образом,
чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих и вообще всех животных.
Постарайтесь максимально логично переписать архитектуру проекта.

➖ *Факультативное задание (особенно java-разработчикам). Установить gradle. Добавить lombok в зависимости, и заменить геттеры и сеттеры на аннотации. Если сделаете это задание, скопируйте код проекта в проект gradle.

</details>

<details><summary><h4>Семинар 3: Некоторые стандартные интерфейсы Java и примеры их использования</h4></summary>

✔️ Создать сет компонентов, и сделать так, чтобы в нем не было 2 одинаковых. (Специально создать два одинаковых компонента в Main и попытаться их добавить в сет)
✔️ * Set<Component> result = new HashSet<>(components); (подсказка переопределить методы equals и hashCode).
✔️ Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства

</details>

<details><summary><h4>Семинар 4: ООП: Обобщения. ч1</h4></summary>

✔️ Реализовать свой LinkedList с методами вставки в начало, конец списка, получения размера списка и получения элемента по индексу (можете добавить какие-то еще).

</details>

<details><summary><h4>Семинар 5: От простого к практике</h4></summary>

**Доработать справочник пользователей, для удаления. Поработать над проектом.(не обязательно, желательно для java-разработчиков)
Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой, и разделителем - пустой строкой. Предусмотреть сохранение в старом формате. На ваше усмотрение (по вкусу), но что - то изменить надо.
Попробуйте создать систему логирования.

✔️ ИЛИ ВНЕСИТЕ СВОИ ИЗМЕНЕНИЯ В ПРОЕКТ, КОТОРЫЕ КАЖУТЬСЯ ЛОГИЧНЫМИ ВАМ.

****Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, добавив в него систему логирования

✔️ Добавил сохранение данных в другом формате, для этого:

• Добавил в класс UserMapper новое поле: separator, и изменил констукторы и методы для преобразования данных

• Изменил класс DBConnector, заменил все статичексие методы на обычные, так как появилась необходимость сохранения данных в разных форматах и разных "БД". Добавил в него поле operation, и возможность создания экземпляров класса DBConnector при помощи уже существующих файловых операций. (впоследствии убрал)

• Изменил конструкторы класса UserRepository

✔️ Добавил удаление данных из БД, для этого:

• Реализовал в классе UserRepository соотв. метод из интерфейса

• Добавил в класс UserView поведение при команде DELETE

✔️ Перенес в класс UserRepository и интерфейс GBRepository методы DAO (в метод write добавил поведение из метода saveAll, метод readAll для наглядности оставил как есть)

</details>

<details><summary><h4>Семинар 6: ООП Дизайн и Solid</h4></summary>

✔️ Подумать и исправить те принципы SOLID которые нарушены в пакете homework. Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а

В классе User нарушены два принципа SOLID: единственной ответственности и инверсии зависимостей.

Класс User за разные спектры задач (сохранение данных и составление отчетов), их следует вынести в другие классы.

1. Составлением отчетов. Для этого создаем отдельный интерфейс Reportable и реализуем его в классе UserReporter. Далее добавляем поле reporter в классе User и конструктор этого класса. Таким образом, в методе report класса User просто вызывается метод report наследников интерфейса Reportable.

2. В методе save класса User нарушается принцип инверсии зависимостей, нужно решить эту проблему. Создаем класс UserSaver со статическим методом save. От метода save в классе User можно избавиться, сохраняя данные пользователей только при вызове метода класса UserSaver.

</details>
# JAVA_OOP_HomeWork
