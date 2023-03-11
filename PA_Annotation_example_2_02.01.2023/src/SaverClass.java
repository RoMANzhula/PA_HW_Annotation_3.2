import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {
    public void saveTextToFile(Class clazz) throws InstantiationException, IllegalAccessException, InvocationTargetException {
       //получаем методанные из класса Контейнер (относительно созданных в нем методов)
        Method[] methods = clazz.getDeclaredMethods(); //получаем массив из методов класса Контейнер
        for (Method method : methods) { //циклом "для каждого" проходимся по каждому методу из массива методов
            if (method.isAnnotationPresent(SaverAnnotation.class)) { //если метод помечен аннотацией @SaverAnnotation, то
                var obj = clazz.newInstance(); //создаем новый экземпляр, на котором будет вызываться метод invoke(obj) для
                //нестатического метода нужен обьект в метод invoke()
                method.invoke(obj); //передаем каждый метод на обьект
                // System.out.println(method); //печатаем каждый задекларированный метод
            }
        }
    }
}
