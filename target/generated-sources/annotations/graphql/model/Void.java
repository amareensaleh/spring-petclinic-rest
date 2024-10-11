package graphql.model;

import java.io.Serializable;
import java.lang.Integer;

public class Void implements Serializable {
  private Integer result;

  public Integer getResult() {
    return this.result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
