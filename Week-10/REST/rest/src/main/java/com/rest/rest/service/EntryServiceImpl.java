package com.rest.rest.service;

import com.rest.rest.model.Entry;
import com.rest.rest.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EntryServiceImpl implements  EntryService{

  private EntryRepository entryRepository;

  @Autowired
  EntryServiceImpl(EntryRepository entryRepository) {
    this.entryRepository = entryRepository;
  }

  @Override
  public void addEntry(Entry entry) {
    entry.setDate(new Date());
    entryRepository.save(entry);
  }

  @Override
  public List<Entry> listEntries() {
    List<Entry> entries = new ArrayList<>();
    entryRepository.findAll().forEach(entries::add);
    return entries;
  }
}
