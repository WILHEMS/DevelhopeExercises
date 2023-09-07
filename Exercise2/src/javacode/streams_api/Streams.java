package javacode.streams_api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
        try (var fileContent = new Scanner(Path.of("./src/javacode/streams_api/file.txt"), StandardCharsets.UTF_8)) {
            var list = new ArrayList<String>();
            fileContent.forEachRemaining(list::add);
            list.stream().forEach(System.out::println);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
