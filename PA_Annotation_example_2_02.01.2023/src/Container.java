import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveToAnnotation(fileParam1 = "C:\\Users\\Admin\\Desktop\\Новый текстовый документ.txt") //анотація з параметром - адреса файлу
public class Container { // клас Контейнер для даних, які ми хочемо зберегти
    private final String text = "If you going to San Francisco..."; // текст, який потрібно зберегти

    public String getText() { // гетер для змінної, яка зберігає текст для збереження (можна використовувати для перевірки
        // зміни даних в рефлексивних методах)
        return text;
    }

    @SaverAnnotation // анотація
    public void save() throws IOException { // метод для збереження тексту в документ
        var fileForWriter = Container.class.getAnnotation(SaveToAnnotation.class).fileParam1(); // створюємо змінну = файл
        // для збереження даних (як адресу використовуємо аргумент параметра анотації)

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriter))) { // за допомогою try with resources,
            // який самостійно закриває потоки, створюємо потік для запису даних у буфер, а потім цілим блоком пишемо в
            // вказаний файл
            bufferedWriter.write(text);
        }
    }

    @Override
    public String toString() { // перевизначаємо метод
        return "Container{" +
                "text='" + text + '\'' +
                '}';
    }
}
