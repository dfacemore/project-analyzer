package com.example.projectanalyzer.service;

import com.example.projectanalyzer.model.Data;

public interface KafkaDataService {

    void handle(Data data);

}
