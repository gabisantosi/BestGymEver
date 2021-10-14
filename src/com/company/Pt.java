package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class Pt {

    public boolean writeTrainingActivity(Member member) throws IOException {

        LocalDate now = LocalDate.now();

        Path path = Paths.get("/Users/gabi/IdeaProjects/BestGymEver/Resources/pt.txt");

        BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        writer.write(member.getFirstName() + " " + member.getLastName() + ", " + member.getIdNumber() + ": " + LocalDate.now() + "\n");
        writer.close();
        System.exit(0);
        return true;
    }
}
