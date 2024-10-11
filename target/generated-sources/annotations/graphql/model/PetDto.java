package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;

public class PetDto implements Serializable {
  private String name;

  private LocalDate birthDate;

  private PetTypeDto type;

  private Integer id;

  private Integer ownerId;

  private List<VisitDto> visits;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public PetTypeDto getType() {
    return this.type;
  }

  public void setType(PetTypeDto type) {
    this.type = type;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public List<VisitDto> getVisits() {
    return this.visits;
  }

  public void setVisits(List<VisitDto> visits) {
    this.visits = visits;
  }
}
