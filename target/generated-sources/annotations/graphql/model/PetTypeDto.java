package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class PetTypeDto implements Serializable {
  private String name;

  private Integer id;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
