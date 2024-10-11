package graphql.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class VetDto implements Serializable {
  private String firstName;

  private String lastName;

  private List<SpecialtyDto> specialties;

  private Integer id;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public List<SpecialtyDto> getSpecialties() {
    return this.specialties;
  }

  public void setSpecialties(List<SpecialtyDto> specialties) {
    this.specialties = specialties;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
