import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveToAnnotation(fileParam1 = "C:\\Users\\Admin\\Desktop\\Новый текстовый документ.txt") //аннотация  параметром - адрес файла
public class Container { //класс Контейнер для данных - которые мы хотим сохранить
    private final String text = "If you going to San Francisco..."; //текст, который нужно сохранить

    public String getText() { //геттер для переменной, которая хранит текст для сохранения (можно использовать для проверки
        //изменения данных в рефлексных методах)
        return text;
    }

    @SaverAnnotation //аннотация
    public void save() throws IOException { //метод для сохранения текста в документ
        var fileForWriter = Container.class.getAnnotation(SaveToAnnotation.class).fileParam1(); //создаем переменную = файл
        //для сохранения данных (в качестве адреса используем аргумент параметра аннотации)

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriter))) { //с помощью try with resource,
            //который самостоятельно закрывает потоки, создаем поток для записи данных в буфер, а потом целым куском пишем в
            //указанный файл
            bufferedWriter.write(text);
        }
    }

    @Override
    public String toString() { //переопределяем метод
        return "Container{" +
                "text='" + text + '\'' +
                '}';
    }
}
