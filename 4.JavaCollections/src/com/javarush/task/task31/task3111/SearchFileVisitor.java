package com.javarush.task.task31.task3111;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private int minSize;
    private int maxSize;
    private String partOfName;
    private String partOfContent;
    private List<Path> foundFiles = new ArrayList<>();
    private List<String> filters = new ArrayList<>();

    public void setMinSize(int minSize) {
        this.minSize = minSize;
        filters.add("min");
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        filters.add("max");

    }

    public void setPartOfName(String name) {
        this.partOfName = name;
        filters.add("name");

    }

    public void setPartOfContent(String content) {
        this.partOfContent = content;
        filters.add("content");

    }

    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        int numsOfFilter = filters.size();
        //если  число фильтров 0 то поиск прекращаем
        if (numsOfFilter == 0) return FileVisitResult.TERMINATE;
        //счетчик фильтров.
        int countOfFilter=0;

        byte[] content = Files.readAllBytes(file); // размер файла: content.length


        for (String nameFiler : filters) {
            switch (nameFiler) {
                case "name": {
                    if (file.getFileName().toString().contains(partOfName)) countOfFilter++;
                    break;
                }
                case "content": {
                    if (!partOfContent.isEmpty()) {     //если не пусто то создаем строку из массива байт полученного в начале метода.
                        String sb = new String(content);
                        if (sb.contains(partOfContent)) countOfFilter++;
                    }
                    break;
                }
                case "min": {
                    if (content.length >= minSize) countOfFilter++;
                    break;
                }
                case "max": {
                    if (content.length < maxSize) countOfFilter++;
                    break;
                }

            }
            if (countOfFilter == numsOfFilter) {
                foundFiles.add(file);
            }

        }

        //то решение лучше. выше решение мое.
        //FileVisitResult.CONTINUE продолжает обход. тоесть функция прерывается и запускаетсся заного для обхода.
//        if ((partOfName != null) && !file.getFileName().toString().equals(this.partOfName)) return FileVisitResult.CONTINUE;
//        if ((partOfContent != null) && !sb.contains(this.partOfContent)) return FileVisitResult.CONTINUE;
//        if (!(content.length >= minSize)) return FileVisitResult.CONTINUE;
//        if (!(content.length < maxSize)) return FileVisitResult.CONTINUE;
//        foundFiles.add(file);

        return super.visitFile(file, attrs);
    }
}
