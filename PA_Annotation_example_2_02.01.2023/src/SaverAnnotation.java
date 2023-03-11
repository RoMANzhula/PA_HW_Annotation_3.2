import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //указываем к каким членам класса мы можем применять аннотацию (к методам)
@Retention(RetentionPolicy.RUNTIME) //тип аннотации доступный для рефлексии
public @interface SaverAnnotation { //чем сохранять
}
