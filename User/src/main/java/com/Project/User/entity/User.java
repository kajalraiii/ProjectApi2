package com.Project.User.entity;

import com.Project.User.classes.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String  userId;
    private String userName;
    private List<Role> roles;
    private String school_id;


}
