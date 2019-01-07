package com.rest.rest.service;

import com.rest.rest.model.Entry;

import java.util.List;

public interface EntryService {

  public void addEntry(Entry entry);
  public List<Entry> listEntries();
}
