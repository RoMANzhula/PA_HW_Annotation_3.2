import java.lang.annotation.*;

@Inherited //говорит о том, что новая созданная аннотация будет передаваться по наследству
@Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //указывает к каким членам класса мы можем
// аннтоцацию применять
@Retention(value = RetentionPolicy.RUNTIME)// тип аннотации, в данном случае РАНТАЙМ (это значит она будет доступна для Рефлексии)

public @interface SaveToAnnotation { //куда сохранять
    String fileParam1(); //декларируем строковый параметр аннотации
}
