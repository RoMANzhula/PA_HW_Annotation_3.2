import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SaverClass saverClass = new SaverClass(); //створюємо новий об'єкт типу та поведінки класу SaverClass
        saverClass.saveTextToFile(Container.class); //для нового об'єкту викликаємо метод зберегтиТекстВФайл(аргумент: клас Контейнер)
    }
}
