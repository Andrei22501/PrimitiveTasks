package primitive;

public class DoubleExpression {
    /*
    Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
В качестве примера написано заведомо неправильное выражение. Исправьте его.

Требования:
Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
*/
    public static boolean doubleExpression(double a, double b, double c) {
        return a == c;
    }
}
