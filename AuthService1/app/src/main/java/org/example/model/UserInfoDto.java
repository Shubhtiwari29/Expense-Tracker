package org.example.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.entites.UserInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

import lombok.NonNull;
import lombok.Setter;

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDto extends UserInfo
{

    @NonNull
    private String firstName; // first_name

    @NonNull
    private String lastName; //last_name


    private Long phoneNumber;

    private String email; // email

}
