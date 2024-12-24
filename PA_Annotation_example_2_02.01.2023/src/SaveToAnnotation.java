import java.lang.annotation.*;

@Inherited // говорить про те, що нова створена інструкція передаватиметься у спадок
@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //вказує до яких членів класу ми можемо
// антоцацію застосовувати
@Retention(value = RetentionPolicy.RUNTIME)// тип анотації, у разі РАНТАЙМ (тобто вона буде доступна для Рефлексії)

public @interface SaveToAnnotation { //куди зберігати
    String fileParam1(); //декларуємо рядковий параметр інструкції
}
