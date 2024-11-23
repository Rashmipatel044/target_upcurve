package com.api.book.bootrestbook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.book.bootrestbook.helper.Fileuploadhelper;

@RestController
public class FileUploading {

    @Autowired
    private Fileuploadhelper fileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Check if the file is empty
            if (file.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("The uploaded file is empty. Please select a valid file.");
            }

            // Check the content type
            String contentType = file.getContentType();
            if (contentType == null || 
                !(contentType.equals("image/jpeg") || contentType.equals("image/png"))) {
                return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
                        .body("Invalid file type. Only JPEG and PNG files are supported.");
            }

            // Attempt file upload
            boolean isUploaded = fileUploadHelper.uploadFile(file);
            if (isUploaded) {
                // return ResponseEntity.ok("File uploaded successfully: " + file.getOriginalFilename());
                return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/Image/").path(file.getOriginalFilename()).toUriString());
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("File upload failed due to an unknown error. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while uploading the file: " + e.getMessage());
        }
    }
}
