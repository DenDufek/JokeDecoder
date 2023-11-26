import java.io.*;

public class Deshifrator {
    public static void main(String[] args) {
        // Введіть ім'я вхідного і вихідного файлів
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Читання вхідного файлу
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Запис до вихідного файлу
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Читання і обробка рядків
            String line;
            while ((line = reader.readLine()) != null) {
                // Заміна прийменників на "Java"
                String modifiedLine = line.replaceAll("\\b[ПпoOaAeEиIуУіІьЬкКвВзЗсСвВ]\\b", "Java");
                // Запис зміненого рядка у вихідний файл
                writer.write(modifiedLine);
                writer.newLine();
            }

            // Закриття потоків
            reader.close();
            writer.close();

            System.out.println("Програма завершила роботу. Перевірте вихідний файл.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
