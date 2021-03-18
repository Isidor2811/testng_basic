Commit #1 (regular execution)

Смотреть файл testng_simple_for_regular_runs.

Данный файл является сьютом с названием "**Left menu suite**".
В данном сьюте созданы два теста "**Open top 2 left menu item**" и "**Open last 3 left menu item**"

Каждый тест запускает несколько методов с класса **FirstTestClass**

Вся конфигурация запуска (аннотации) находятся в **BaseTest** классе.
Обратить внимание на Dependency injection (параметры, которые передаются в метод с аннотациями), более детально все описано в документации

https://testng.org/doc/documentation-main.html#dependency-injection


Commit #2 (work with groups)

Был добавлен testng_with_groups.xml 
В данном файле сконфигурировано какие группы должны попадать в run, а какие нет.
Дальше над каждым тестом нужно добавить соответствующий тег группы.

В классе **BaseTest** добавлено два новых метода с аннотациями 
@BeforeGroups, @AfterGroups, в параметры этих аннотаций нужно передавать название групп перед и после которых они должны срабатывать

Тут как то непонятно работают пред идущие методы (@BeforeSuite, @BeforeMethod), работает только @BeforeTest, так как в нем есть параметр alwaysRun=true