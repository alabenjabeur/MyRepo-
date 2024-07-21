package com.jvscode.sbfileupload.controller;

import com.jvscode.sbfileupload.model.FileUpload;
import com.jvscode.sbfileupload.service.FileUploadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/uploads")
@Controller
public class FileUploadController {


    private final FileUploadService fileUploadService;

    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }
    @PostMapping
      public ResponseEntity<FileUpload> uploadFile
         (@RequestParam("ownedBy") String ownedBy,
         @RequestParam("description") String description,
         @RequestParam("file") MultipartFile file) throws IOException {

      FileUpload theFile= fileUploadService.uploadFile(ownedBy,description,file);
      return new ResponseEntity<>(theFile, HttpStatus.OK);
}
}

