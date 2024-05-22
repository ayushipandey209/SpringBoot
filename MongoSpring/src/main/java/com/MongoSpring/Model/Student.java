package com.MongoSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //table name in mongo db
@Data //boilder code reduce
@NoArgsConstructor //for initializing the value
@AllArgsConstructor
public class Student {

    @Id // integer will be primary and unique
    private  Integer rno;
    private String name;
    private String address;

}
