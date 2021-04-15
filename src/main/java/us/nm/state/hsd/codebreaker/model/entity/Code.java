package us.nm.state.hsd.codebreaker.model.entity;

import java.sql.Date;
import java.util.UUID;

public class Code {

  private UUID id;
  private Date created;
  private int length;
  private String poolString;
  private String textString;
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public String getPoolString() {
    return poolString;
  }
  public void setPoolString(String poolString) {
    this.poolString = poolString;
  }
  public String getTextString() {
    return textString;
  }
  public void setTextString(String textString) {
    this.textString = textString;
  }
    
}
