package com.rest.rest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Entry {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  private String endPoint;
  private String data;

  public Entry() {
  }

  public Entry(String endPoint, String data) {
    this.endPoint = endPoint;
    this.data = data;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getDate() {
    return date;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
