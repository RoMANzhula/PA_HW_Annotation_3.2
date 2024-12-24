import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // вказуємо до яких членів класу ми можемо застосовувати анотацію (до методів)
@Retention(RetentionPolicy.RUNTIME) // тип анотації доступний для рефлексії
public @interface SaverAnnotation { // чим зберігати
}
