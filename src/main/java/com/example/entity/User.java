package com.example.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Document("user")
@Data
@Builder
public class User {
    @Id
    private ObjectId id;

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;
}
