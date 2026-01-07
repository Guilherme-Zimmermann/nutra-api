package br.com.nutra.model.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_account")
public class UserAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotNull
  private String name;

  @NotNull
  @Email
  private String email;

  @NotNull
  private String password;

  @NotNull
  private Integer failedLoginAttempts;

  @NotNull
  private String role;

  @CreatedDate
  @Column(updatable = false)
  private LocalDateTime criadoEm;

  @LastModifiedDate
  private LocalDateTime atualizadoEm;

  public UserAccount() {
  }

  public UserAccount(Integer id, String name, String email, String password,Integer failedLoginAttempts, String role) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.failedLoginAttempts = failedLoginAttempts;
    this.role = role;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
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
  public Integer getFailedLoginAttempts() {
    return failedLoginAttempts;
  }
  public void setFailedLoginAttempts(Integer failedLoginAttempts) {
    this.failedLoginAttempts = failedLoginAttempts;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public LocalDateTime getCriadoEm() {
    return criadoEm;
  }
  public LocalDateTime getAtualizadoEm() {
    return atualizadoEm;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    UserAccount other = (UserAccount) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}
