package br.com.dpacanhella.generator.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dpacanhella.generator.dto.AttributesDTO;
import br.com.dpacanhella.generator.dto.ClassDTO;
import br.com.dpacanhella.generator.dto.GeneratorDTO;

@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @PostMapping
    public void create(@RequestBody GeneratorDTO dto) {

        String classeName = dto.getClassDTO().getClassName().toString();
        String src = "/Users/infra/Desktop/arquivo-java/";

        try {

            File file = new File(src, classeName + ".java");

            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // nome do package
            bw.write("package " + dto.getPackageName());
            jumpLines(bw, 1);

            // imports
            writeImports(bw, dto.getImports());
            jumpLines(bw, 1);

            // cabeçalho
            writeCabecalho(bw, dto.getClassDTO());

            // attributes
            writeAttributes(bw, dto.getAttributesDTO());

            closeChannel(fw, bw);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void writeAttributes(BufferedWriter bw, List<AttributesDTO> attributesDTO) {

        

    }

    private void writeCabecalho(BufferedWriter bw, ClassDTO classDTO) {
        classDTO.getClassInjectionsDTO().forEach(c -> {
            try {
                bw.write(c.getName() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        try {
            bw.write("@Table(name=" + '"' + classDTO.getTableName() + '"' + ") \n");
            bw.write("public class " + classDTO.getClassName() + " {");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeImports(BufferedWriter bw, List<String> imports) {

        imports.forEach(i -> {
            try {
                bw.write("import " + i + "; \n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    private void closeChannel(FileWriter fw, BufferedWriter bw) throws IOException {
        bw.write("}");
        bw.close();
        fw.close();
    }

    private void jumpLines(BufferedWriter bw, int lines) {

        try {
            for (int i = 0; i <= lines; i++) {
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
