package com.store.demo.dto;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.List;

import com.store.demo.model.UserEntity;

public class UserDTO {
    private static final long serialVersionUID = 4835606708278639517L;

    private long idUser;
    private String name;
    private String email;
    private String password;


    public UserDTO(long idUser, String name, String email, String password) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDTO(UserEntity user) {
        this.idUser = user.getIdUser();
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return idUser == userDTO.idUser &&
                Objects.equals(name, userDTO.name) &&
                Objects.equals(email, userDTO.email) &&
                Objects.equals(password, userDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, email, password);
    }

    public static List<UserDTO> mapToDTO(List<UserEntity> list) {
        return list.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public static UserDTO mapToDTO(UserEntity user){
        return new UserDTO(user);
    }
    public static  UserEntity mapToEntity(UserDTO userDTO){
    	UserEntity user = new UserEntity();
        if(userDTO != null) {
            user.setIdUser(userDTO.getIdUser());
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setPassword(userDTO.getPassword());
        }
        return  user;
    }

}
