package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class SpecialtyDto implements Serializable {
  private Integer id;

  private String name;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
