package graphql.model;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated("Generated by GraphQLify-Java: com.graphqlify.codegen.GraphQLifyAnnotationProcessor")
public class VisitFieldsDtoInput implements Serializable {
  private LocalDate date;

  private String description;

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
}