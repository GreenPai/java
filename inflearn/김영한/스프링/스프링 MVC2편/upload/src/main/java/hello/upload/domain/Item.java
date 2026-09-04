package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    
    private Long id;
    private String itemName;
    private UploadFile attachFile;
    
    // 여러개의 업로드를 위해서 
    private List<UploadFile> imageFiles;
}