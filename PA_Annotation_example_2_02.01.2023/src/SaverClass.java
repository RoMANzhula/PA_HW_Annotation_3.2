import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {
    public void saveTextToFile(Class clazz) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        // отримуємо методи з класу Контейнер (відносно створених в ньому методів)
        Method[] methods = clazz.getDeclaredMethods(); // отримуємо масив методів класу Контейнер
        for (Method method : methods) { // циклом "для кожного" проходимо по кожному методу з масиву методів
            if (method.isAnnotationPresent(SaverAnnotation.class)) { // якщо метод помічений анотацією @SaverAnnotation, то
                var obj = clazz.newInstance(); // створюємо новий екземпляр, на якому буде викликаний метод invoke(obj) для
                // нестатичного методу потрібен об'єкт у методі invoke()
                method.invoke(obj); // передаємо кожен метод на об'єкт
                // System.out.println(method); // виводимо кожен задекларований метод
            }
        }
    }
}
