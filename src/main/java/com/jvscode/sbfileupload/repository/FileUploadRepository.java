package com.jvscode.sbfileupload.repository;

import com.jvscode.sbfileupload.model.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepository extends JpaRepository<FileUpload,Long> {
}
