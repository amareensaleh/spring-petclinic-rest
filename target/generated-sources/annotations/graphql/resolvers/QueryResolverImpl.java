package graphql.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.model.OwnerDto;
import graphql.model.PetDto;
import graphql.model.PetTypeDto;
import graphql.model.SpecialtyDto;
import graphql.model.VetDto;
import graphql.model.VisitDto;
import graphql.model.Void;
import graphql.schema.DataFetchingEnvironment;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.samples.petclinic.rest.api.OopsApi;
import org.springframework.samples.petclinic.rest.api.OwnersApi;
import org.springframework.samples.petclinic.rest.api.PetsApi;
import org.springframework.samples.petclinic.rest.api.PettypesApi;
import org.springframework.samples.petclinic.rest.api.SpecialtiesApi;
import org.springframework.samples.petclinic.rest.api.VetsApi;
import org.springframework.samples.petclinic.rest.api.VisitsApi;
import org.springframework.samples.petclinic.rest.controller.RootRestController;

@Generated("Generated by GraphQLify-Java: com.graphqlify.codegen.GraphQLifyAnnotationProcessor")
public class QueryResolverImpl implements GraphQLQueryResolver {
  public PetsApi petsApi;

  public VisitsApi visitsApi;

  public SpecialtiesApi specialtiesApi;

  public OopsApi oopsApi;

  public RootRestController rootRestController;

  public PettypesApi pettypesApi;

  public OwnersApi ownersApi;

  public VetsApi vetsApi;

  public String failingRequest(DataFetchingEnvironment dataFetchingEnvironment) {

    java.lang.String response = oopsApi.failingRequest().getBody();

    String response_ = response;
    return response_;
  }

  public OwnerDto getOwner(Integer ownerId, DataFetchingEnvironment dataFetchingEnvironment) {
    Integer ownerId_ = ownerId;

    org.springframework.samples.petclinic.rest.dto.OwnerDto response = ownersApi.getOwner(ownerId_).getBody();

    OwnerDto response_ = new OwnerDto();
    // Mapping field: firstName
    String response_firstName = response.getFirstName();
    response_.setFirstName(response_firstName);
    // Mapping field: lastName
    String response_lastName = response.getLastName();
    response_.setLastName(response_lastName);
    // Mapping field: address
    String response_address = response.getAddress();
    response_.setAddress(response_address);
    // Mapping field: city
    String response_city = response.getCity();
    response_.setCity(response_city);
    // Mapping field: telephone
    String response_telephone = response.getTelephone();
    response_.setTelephone(response_telephone);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    // Mapping field: pets
    java.util.List<PetDto> response_pets = new java.util.ArrayList<>();
    for (var item1 : response.getPets()) {
      PetDto item1_ = new PetDto();
      // Mapping field: name
      String item1_name = item1.getName();
      item1_.setName(item1_name);
      // Mapping field: birthDate
      LocalDate item1_birthDate = item1.getBirthDate();
      item1_.setBirthDate(item1_birthDate);
      // Mapping field: type
      PetTypeDto item1_type = new PetTypeDto();
      // Mapping field: name
      String item1_type_name = item1.getType().getName();
      item1_type.setName(item1_type_name);
      // Mapping field: id
      Integer item1_type_id = item1.getType().getId();
      item1_type.setId(item1_type_id);
      item1_.setType(item1_type);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: ownerId
      Integer item1_ownerId = item1.getOwnerId();
      item1_.setOwnerId(item1_ownerId);
      // Mapping field: visits
      java.util.List<VisitDto> item1_visits = new java.util.ArrayList<>();
      for (var item2 : item1.getVisits()) {
        VisitDto item2_ = new VisitDto();
        // Mapping field: date
        LocalDate item2_date = item2.getDate();
        item2_.setDate(item2_date);
        // Mapping field: description
        String item2_description = item2.getDescription();
        item2_.setDescription(item2_description);
        // Mapping field: id
        Integer item2_id = item2.getId();
        item2_.setId(item2_id);
        // Mapping field: petId
        Integer item2_petId = item2.getPetId();
        item2_.setPetId(item2_petId);
        item1_visits.add(item2_);
      }
      item1_.setVisits(item1_visits);
      response_pets.add(item1_);
    }
    response_.setPets(response_pets);
    return response_;
  }

  public PetDto getOwnersPet(Integer ownerId, Integer petId,
      DataFetchingEnvironment dataFetchingEnvironment) {
    Integer ownerId_ = ownerId;
    Integer petId_ = petId;

    org.springframework.samples.petclinic.rest.dto.PetDto response = ownersApi.getOwnersPet(ownerId_, petId_).getBody();

    PetDto response_ = new PetDto();
    // Mapping field: name
    String response_name = response.getName();
    response_.setName(response_name);
    // Mapping field: birthDate
    LocalDate response_birthDate = response.getBirthDate();
    response_.setBirthDate(response_birthDate);
    // Mapping field: type
    PetTypeDto response_type = new PetTypeDto();
    // Mapping field: name
    String response_type_name = response.getType().getName();
    response_type.setName(response_type_name);
    // Mapping field: id
    Integer response_type_id = response.getType().getId();
    response_type.setId(response_type_id);
    response_.setType(response_type);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    // Mapping field: ownerId
    Integer response_ownerId = response.getOwnerId();
    response_.setOwnerId(response_ownerId);
    // Mapping field: visits
    java.util.List<VisitDto> response_visits = new java.util.ArrayList<>();
    for (var item1 : response.getVisits()) {
      VisitDto item1_ = new VisitDto();
      // Mapping field: date
      LocalDate item1_date = item1.getDate();
      item1_.setDate(item1_date);
      // Mapping field: description
      String item1_description = item1.getDescription();
      item1_.setDescription(item1_description);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: petId
      Integer item1_petId = item1.getPetId();
      item1_.setPetId(item1_petId);
      response_visits.add(item1_);
    }
    response_.setVisits(response_visits);
    return response_;
  }

  public PetDto getPet(Integer petId, DataFetchingEnvironment dataFetchingEnvironment) {
    Integer petId_ = petId;

    org.springframework.samples.petclinic.rest.dto.PetDto response = petsApi.getPet(petId_).getBody();

    PetDto response_ = new PetDto();
    // Mapping field: name
    String response_name = response.getName();
    response_.setName(response_name);
    // Mapping field: birthDate
    LocalDate response_birthDate = response.getBirthDate();
    response_.setBirthDate(response_birthDate);
    // Mapping field: type
    PetTypeDto response_type = new PetTypeDto();
    // Mapping field: name
    String response_type_name = response.getType().getName();
    response_type.setName(response_type_name);
    // Mapping field: id
    Integer response_type_id = response.getType().getId();
    response_type.setId(response_type_id);
    response_.setType(response_type);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    // Mapping field: ownerId
    Integer response_ownerId = response.getOwnerId();
    response_.setOwnerId(response_ownerId);
    // Mapping field: visits
    java.util.List<VisitDto> response_visits = new java.util.ArrayList<>();
    for (var item1 : response.getVisits()) {
      VisitDto item1_ = new VisitDto();
      // Mapping field: date
      LocalDate item1_date = item1.getDate();
      item1_.setDate(item1_date);
      // Mapping field: description
      String item1_description = item1.getDescription();
      item1_.setDescription(item1_description);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: petId
      Integer item1_petId = item1.getPetId();
      item1_.setPetId(item1_petId);
      response_visits.add(item1_);
    }
    response_.setVisits(response_visits);
    return response_;
  }

  public PetTypeDto getPetType(Integer petTypeId, DataFetchingEnvironment dataFetchingEnvironment) {
    Integer petTypeId_ = petTypeId;

    org.springframework.samples.petclinic.rest.dto.PetTypeDto response = pettypesApi.getPetType(petTypeId_).getBody();

    PetTypeDto response_ = new PetTypeDto();
    // Mapping field: name
    String response_name = response.getName();
    response_.setName(response_name);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    return response_;
  }

  public SpecialtyDto getSpecialty(Integer specialtyId,
      DataFetchingEnvironment dataFetchingEnvironment) {
    Integer specialtyId_ = specialtyId;

    org.springframework.samples.petclinic.rest.dto.SpecialtyDto response = specialtiesApi.getSpecialty(specialtyId_).getBody();

    SpecialtyDto response_ = new SpecialtyDto();
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    // Mapping field: name
    String response_name = response.getName();
    response_.setName(response_name);
    return response_;
  }

  public VetDto getVet(Integer vetId, DataFetchingEnvironment dataFetchingEnvironment) {
    Integer vetId_ = vetId;

    org.springframework.samples.petclinic.rest.dto.VetDto response = vetsApi.getVet(vetId_).getBody();

    VetDto response_ = new VetDto();
    // Mapping field: firstName
    String response_firstName = response.getFirstName();
    response_.setFirstName(response_firstName);
    // Mapping field: lastName
    String response_lastName = response.getLastName();
    response_.setLastName(response_lastName);
    // Mapping field: specialties
    java.util.List<SpecialtyDto> response_specialties = new java.util.ArrayList<>();
    for (var item1 : response.getSpecialties()) {
      SpecialtyDto item1_ = new SpecialtyDto();
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: name
      String item1_name = item1.getName();
      item1_.setName(item1_name);
      response_specialties.add(item1_);
    }
    response_.setSpecialties(response_specialties);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    return response_;
  }

  public VisitDto getVisit(Integer visitId, DataFetchingEnvironment dataFetchingEnvironment) {
    Integer visitId_ = visitId;

    org.springframework.samples.petclinic.rest.dto.VisitDto response = visitsApi.getVisit(visitId_).getBody();

    VisitDto response_ = new VisitDto();
    // Mapping field: date
    LocalDate response_date = response.getDate();
    response_.setDate(response_date);
    // Mapping field: description
    String response_description = response.getDescription();
    response_.setDescription(response_description);
    // Mapping field: id
    Integer response_id = response.getId();
    response_.setId(response_id);
    // Mapping field: petId
    Integer response_petId = response.getPetId();
    response_.setPetId(response_petId);
    return response_;
  }

  public List<OwnerDto> listOwners(String lastName,
      DataFetchingEnvironment dataFetchingEnvironment) {
    String lastName_ = lastName;

    java.util.List<org.springframework.samples.petclinic.rest.dto.OwnerDto> response = ownersApi.listOwners(lastName_).getBody();

    java.util.List<OwnerDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      OwnerDto item1_ = new OwnerDto();
      // Mapping field: firstName
      String item1_firstName = item1.getFirstName();
      item1_.setFirstName(item1_firstName);
      // Mapping field: lastName
      String item1_lastName = item1.getLastName();
      item1_.setLastName(item1_lastName);
      // Mapping field: address
      String item1_address = item1.getAddress();
      item1_.setAddress(item1_address);
      // Mapping field: city
      String item1_city = item1.getCity();
      item1_.setCity(item1_city);
      // Mapping field: telephone
      String item1_telephone = item1.getTelephone();
      item1_.setTelephone(item1_telephone);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: pets
      java.util.List<PetDto> item1_pets = new java.util.ArrayList<>();
      for (var item2 : item1.getPets()) {
        PetDto item2_ = new PetDto();
        // Mapping field: name
        String item2_name = item2.getName();
        item2_.setName(item2_name);
        // Mapping field: birthDate
        LocalDate item2_birthDate = item2.getBirthDate();
        item2_.setBirthDate(item2_birthDate);
        // Mapping field: type
        PetTypeDto item2_type = new PetTypeDto();
        // Mapping field: name
        String item2_type_name = item2.getType().getName();
        item2_type.setName(item2_type_name);
        // Mapping field: id
        Integer item2_type_id = item2.getType().getId();
        item2_type.setId(item2_type_id);
        item2_.setType(item2_type);
        // Mapping field: id
        Integer item2_id = item2.getId();
        item2_.setId(item2_id);
        // Mapping field: ownerId
        Integer item2_ownerId = item2.getOwnerId();
        item2_.setOwnerId(item2_ownerId);
        // Mapping field: visits
        java.util.List<VisitDto> item2_visits = new java.util.ArrayList<>();
        for (var item3 : item2.getVisits()) {
          VisitDto item3_ = new VisitDto();
          // Mapping field: date
          LocalDate item3_date = item3.getDate();
          item3_.setDate(item3_date);
          // Mapping field: description
          String item3_description = item3.getDescription();
          item3_.setDescription(item3_description);
          // Mapping field: id
          Integer item3_id = item3.getId();
          item3_.setId(item3_id);
          // Mapping field: petId
          Integer item3_petId = item3.getPetId();
          item3_.setPetId(item3_petId);
          item2_visits.add(item3_);
        }
        item2_.setVisits(item2_visits);
        item1_pets.add(item2_);
      }
      item1_.setPets(item1_pets);
      response_.add(item1_);
    }
    return response_;
  }

  public List<PetTypeDto> listPetTypes(DataFetchingEnvironment dataFetchingEnvironment) {

    java.util.List<org.springframework.samples.petclinic.rest.dto.PetTypeDto> response = pettypesApi.listPetTypes().getBody();

    java.util.List<PetTypeDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      PetTypeDto item1_ = new PetTypeDto();
      // Mapping field: name
      String item1_name = item1.getName();
      item1_.setName(item1_name);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      response_.add(item1_);
    }
    return response_;
  }

  public List<PetDto> listPets(DataFetchingEnvironment dataFetchingEnvironment) {

    java.util.List<org.springframework.samples.petclinic.rest.dto.PetDto> response = petsApi.listPets().getBody();

    java.util.List<PetDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      PetDto item1_ = new PetDto();
      // Mapping field: name
      String item1_name = item1.getName();
      item1_.setName(item1_name);
      // Mapping field: birthDate
      LocalDate item1_birthDate = item1.getBirthDate();
      item1_.setBirthDate(item1_birthDate);
      // Mapping field: type
      PetTypeDto item1_type = new PetTypeDto();
      // Mapping field: name
      String item1_type_name = item1.getType().getName();
      item1_type.setName(item1_type_name);
      // Mapping field: id
      Integer item1_type_id = item1.getType().getId();
      item1_type.setId(item1_type_id);
      item1_.setType(item1_type);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: ownerId
      Integer item1_ownerId = item1.getOwnerId();
      item1_.setOwnerId(item1_ownerId);
      // Mapping field: visits
      java.util.List<VisitDto> item1_visits = new java.util.ArrayList<>();
      for (var item2 : item1.getVisits()) {
        VisitDto item2_ = new VisitDto();
        // Mapping field: date
        LocalDate item2_date = item2.getDate();
        item2_.setDate(item2_date);
        // Mapping field: description
        String item2_description = item2.getDescription();
        item2_.setDescription(item2_description);
        // Mapping field: id
        Integer item2_id = item2.getId();
        item2_.setId(item2_id);
        // Mapping field: petId
        Integer item2_petId = item2.getPetId();
        item2_.setPetId(item2_petId);
        item1_visits.add(item2_);
      }
      item1_.setVisits(item1_visits);
      response_.add(item1_);
    }
    return response_;
  }

  public List<SpecialtyDto> listSpecialties(DataFetchingEnvironment dataFetchingEnvironment) {

    java.util.List<org.springframework.samples.petclinic.rest.dto.SpecialtyDto> response = specialtiesApi.listSpecialties().getBody();

    java.util.List<SpecialtyDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      SpecialtyDto item1_ = new SpecialtyDto();
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: name
      String item1_name = item1.getName();
      item1_.setName(item1_name);
      response_.add(item1_);
    }
    return response_;
  }

  public List<VetDto> listVets(DataFetchingEnvironment dataFetchingEnvironment) {

    java.util.List<org.springframework.samples.petclinic.rest.dto.VetDto> response = vetsApi.listVets().getBody();

    java.util.List<VetDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      VetDto item1_ = new VetDto();
      // Mapping field: firstName
      String item1_firstName = item1.getFirstName();
      item1_.setFirstName(item1_firstName);
      // Mapping field: lastName
      String item1_lastName = item1.getLastName();
      item1_.setLastName(item1_lastName);
      // Mapping field: specialties
      java.util.List<SpecialtyDto> item1_specialties = new java.util.ArrayList<>();
      for (var item2 : item1.getSpecialties()) {
        SpecialtyDto item2_ = new SpecialtyDto();
        // Mapping field: id
        Integer item2_id = item2.getId();
        item2_.setId(item2_id);
        // Mapping field: name
        String item2_name = item2.getName();
        item2_.setName(item2_name);
        item1_specialties.add(item2_);
      }
      item1_.setSpecialties(item1_specialties);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      response_.add(item1_);
    }
    return response_;
  }

  public List<VisitDto> listVisits(DataFetchingEnvironment dataFetchingEnvironment) {

    java.util.List<org.springframework.samples.petclinic.rest.dto.VisitDto> response = visitsApi.listVisits().getBody();

    java.util.List<VisitDto> response_ = new java.util.ArrayList<>();
    for (var item1 : response) {
      VisitDto item1_ = new VisitDto();
      // Mapping field: date
      LocalDate item1_date = item1.getDate();
      item1_.setDate(item1_date);
      // Mapping field: description
      String item1_description = item1.getDescription();
      item1_.setDescription(item1_description);
      // Mapping field: id
      Integer item1_id = item1.getId();
      item1_.setId(item1_id);
      // Mapping field: petId
      Integer item1_petId = item1.getPetId();
      item1_.setPetId(item1_petId);
      response_.add(item1_);
    }
    return response_;
  }

  public Void redirectToSwagger(DataFetchingEnvironment dataFetchingEnvironment) {

    rootRestController.redirectToSwagger();

    Void response_ = new Void();
    return response_;
  }
}