package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    /**
     * 파일 이름이 2개 인 이유:
     * 다른 사람들이 같은 이름을 저장할 수 있기 때문에.
     *
     */

    // 업로드한 파일 이름
    private String uploadFileName;
    // 저장된 파일 이름
    private String storeFileName;
    
    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}