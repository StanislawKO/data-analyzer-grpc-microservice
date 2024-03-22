package com.example.dataanalyzergrpcmicroservice.service;

import com.example.dataanalyzergrpcmicroservice.model.Data;

import java.util.List;

public interface DataService {

    void handle(Data data);

    List<Data> getWithBatch(long batchSize);

}
