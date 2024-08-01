package Lection_5.HW_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFile {
    /**
     *Метода создает backup папке в корневую директорию
     * @param sourceDirPath путь к папке
     */
    public static void backupFiles(String sourceDirPath) {
        File sourceDir = new File(sourceDirPath);
        File backupDir = new File("./backup");

        // Создаем директорию для резервной копии, если она не существует
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        // Проверяем, что источник - это директория
        if (sourceDir.isDirectory()) {
            // Получаем список файлов в директории
            File[] files = sourceDir.listFiles(File::isFile);

            if (files != null) {
                for (File file : files) {
                    try {
                        // Копируем файл в директорию резервной копии
                        Path sourcePath = file.toPath();
                        Path backupPath = backupDir.toPath().resolve(file.getName());
                        Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Скопирован: " + file.getName());
                    } catch (IOException e) {
                        System.err.println("Ошибка при копировании файла: " + file.getName());
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("В директории нет файлов для резервного копирования.");
            }
        } else {
            System.out.println("Указанный путь не является директорией.");
        }
    }
}
