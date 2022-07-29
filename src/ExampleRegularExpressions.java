public class ExampleRegularExpressions {
    public static void main(String[] args) {
        /*
            Синтаксис регулярных выражений:
            \\d - одна цифра
            \\w - одна английская буква
            \\w = [a-zA-Z] - идентичные выражения

            + - 1 или более
            * - 0 или более
            -\\d - одна отрицательная цифра
            ? - 0 или 1 символов до
            -?\\d - одна отрицательная или положительная цифра

            (x|y|z) - одна строка из множества строк
            (-|\\+)?\\d - одна отрицательная или положительная цифра
            [abc] = (a|b|c) - идентичные выражения
            [0-9] = \\d - идентичные выражения
            [a-zA-Z] - множество всех английских букв
            [^abc] - все символы после символа ^ не должны быть в сравниваемом множестве

            . - означает любой символ

            {2} - 2 символа до (пример \\d{2})
            {2,} - 2 или более символа (пример \\d{2,})
            {2,5} - от 2 до 5 символов (пример \\d{2,5})
        */
        // пример сравнения строк
        String a = "123456789";
        String b = "-123456789";
        String c = "+123456789";
        System.out.println(a.matches("(-|\\+)?\\d*")); // true
        System.out.println(b.matches("(-|\\+)?\\d23456789")); // true
        System.out.println(c.matches("(-|\\+)?\\d*")); // true
        // все плюсы необходимо экранировать "\\+"

        String d = "a123456789";
        String e = "abcdef123456789";
        String f = "abc1def123456789";
        System.out.println(d.matches("[a-zA-Z]\\d*")); // true
        System.out.println(e.matches("[a-zA-Z]+\\d*")); // true
        System.out.println(f.matches("[a-zA-Z0-9]+\\d*")); // true

        String g = "hello";
        System.out.println(g.matches("[^abc]*")); // true

        String i = "123";
        System.out.println(i.matches("\\d{3}")); // true

        // определение валидности домена
        String url = "https://www.yandex.ru";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)")); // true
        // все точки в домене необходимо экранировать "\\."
    }
}
