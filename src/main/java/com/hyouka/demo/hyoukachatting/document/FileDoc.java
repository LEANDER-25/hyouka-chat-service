package com.hyouka.demo.hyoukachatting.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "files")
public class FileDoc extends BaseDocument{
    private String fileName;
    private String fileSize;
    private String fileExtension;
    private String fileType;
    private String fileLink;
}
