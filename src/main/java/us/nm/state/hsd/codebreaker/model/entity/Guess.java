package us.nm.state.hsd.codebreaker.model.entity;

import java.sql.Date;
import java.util.UUID;

public class Guess {

  private UUID id;
  private Date created;
  private UUID codeId;
  private String text;
  int exactMatches;
  int nearMatches;
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
  public UUID getCodeId() {
    return codeId;
  }
  public void setCodeId(UUID codeId) {
    this.codeId = codeId;
  }
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public int getExactMatches() {
    return exactMatches;
  }
  public void setExactMatches(int exactMatches) {
    this.exactMatches = exactMatches;
  }
  public int getNearMatches() {
    return nearMatches;
  }
  public void setNearMatches(int nearMatches) {
    this.nearMatches = nearMatches;
  }
  
 }
