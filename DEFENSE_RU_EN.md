# Strategy defense practice

**EN:** Strategy is a behavioral design pattern. It lets us change an algorithm while the program is running.

**RU:** Strategy — поведенческий паттерн. Он позволяет менять алгоритм во время работы программы.

**EN:** My project is a calculator. It has three strategies: addition, subtraction, and multiplication.

**RU:** Мой проект — калькулятор. В нём три стратегии: сложение, вычитание и умножение.

**EN:** OperationStrategy is the common interface. Each strategy has an execute method.

**RU:** OperationStrategy — общий интерфейс. Каждая стратегия реализует метод execute.

**EN:** Calculator is the Context. It stores a strategy and calls its execute method. It does not choose the operation.

**RU:** Calculator — контекст. Он хранит стратегию и вызывает её execute. Сам контекст не выбирает операцию.

**EN:** Main is the client. It chooses a strategy. The setStrategy method changes the strategy on the same calculator object.

**RU:** Main — клиент. Он выбирает стратегию. Метод setStrategy меняет стратегию у того же объекта калькулятора.

**EN:** First, I add twelve and four. The result is sixteen. Then I change the strategy to subtraction. The result is eight. With multiplication, the result is forty-eight.

**RU:** Сначала я складываю 12 и 4. Результат — 16. Затем меняю стратегию на вычитание. Результат — 8. При умножении результат — 48.

**EN:** There is no if or switch for operation selection inside Calculator. It calls strategy.execute.

**RU:** В Calculator нет if или switch для выбора операции. Он вызывает strategy.execute.

**EN:** To add division, I create a new class with the same interface. I do not change Calculator or the old strategies. The client selects the new strategy.

**RU:** Чтобы добавить деление, я создаю новый класс с тем же интерфейсом. Calculator и старые стратегии не меняются. Новую стратегию выбирает клиент.

**EN:** Strategy changes the algorithm. State changes behavior based on the object's internal state. Here, we choose an operation, so I use Strategy.

**RU:** Strategy меняет алгоритм. State меняет поведение в зависимости от внутреннего состояния объекта. Здесь мы выбираем операцию, поэтому используется Strategy.

**EN:** Facade gives a simple interface to several services. Strategy lets us choose between different algorithms.

**RU:** Facade даёт простой интерфейс к нескольким сервисам. Strategy позволяет выбирать между разными алгоритмами.
