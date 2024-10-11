package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

public class VisitDto implements Serializable {
  private LocalDate date;

  private String description;

  private Integer id;

  private Integer petId;

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPetId() {
    return this.petId;
  }

  public void setPetId(Integer petId) {
    this.petId = petId;
  }
}
