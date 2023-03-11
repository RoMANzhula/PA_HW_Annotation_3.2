import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SaverClass saverClass = new SaverClass(); //создаем новый обьект типа и поведения класса SaverClass
        saverClass.saveTextToFile(Container.class); //для нового обьект вызываем метод сохранитьТекстВФайл(аргумент: класс Контейнер)

    }
}