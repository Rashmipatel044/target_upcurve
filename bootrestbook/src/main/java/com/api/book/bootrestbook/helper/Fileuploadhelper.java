package com.api.book.bootrestbook.helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Fileuploadhelper {

    // Define the upload directory path

    // public final String UPLOAD_DIR = "C:\\Users\\eliza\\OneDrive\\Desktop\\Springboot\\bootrestbook\\src\\main\\resources\\static\\Image";
    
    //NOw Dynamic

    public final String UPLOAD_DIR = new ClassPathResource("static/Image/").getFile().getAbsolutePath();
    public Fileuploadhelper()throws IOException{

    }

    public boolean uploadFile(MultipartFile multipartFile) {
        boolean isUploaded = false;
        try {
            // Resolve the destination path
            Path destinationPath = Paths.get(UPLOAD_DIR).resolve(multipartFile.getOriginalFilename());

            // Ensure the directory exists
            Files.createDirectories(destinationPath.getParent());

            // Copy the file to the destination
            Files.copy(multipartFile.getInputStream(), destinationPath, StandardCopyOption.REPLACE_EXISTING);

            // Set the flag to true if the file is successfully uploaded
            isUploaded = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isUploaded;
    }
}
