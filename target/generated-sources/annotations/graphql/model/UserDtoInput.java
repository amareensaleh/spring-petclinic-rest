package graphql.model;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("Generated by GraphQLify-Java: com.graphqlify.codegen.GraphQLifyAnnotationProcessor")
public class UserDtoInput implements Serializable {
  private String username;

  private String password;

  private Boolean enabled;

  private List<RoleDtoInput> roles;

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getEnabled() {
    return this.enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public List<RoleDtoInput> getRoles() {
    return this.roles;
  }

  public void setRoles(List<RoleDtoInput> roles) {
    this.roles = roles;
  }
}