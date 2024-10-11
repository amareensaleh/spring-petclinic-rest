package graphql.model;

import java.io.Serializable;
import java.lang.String;

public class RoleDto implements Serializable {
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
