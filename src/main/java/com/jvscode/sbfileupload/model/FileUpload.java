package com.jvscode.sbfileupload.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Data
@Entity
@Table(name = "file_upload")
@Component
@ConfigurationProperties(prefix = "file")
public class FileUpload implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String description;
    private String ownedBy;
    @Lob
    private  byte [] file;
    @Column(name = "upload_dir")
    private String uploadDir;
}
