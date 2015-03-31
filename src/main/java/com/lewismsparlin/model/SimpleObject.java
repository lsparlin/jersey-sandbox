package com.lewismsparlin.model;

public class SimpleObject {

  private String name;

  private String description;

  public SimpleObject(String name, String desc) {
    setName(name);
    setDescription(desc);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
