package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.Crypto;
import com.zipcoder.cryptonator_api.repositories.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by leon on 1/22/18.
 */
@Service
public class CryptoService {

 CryptoRepository repository;
 private final RestTemplate restTemplate;
 private final String url = "https://api.cryptonator.com/api/ticker/";

@Autowired
    public CryptoService(CryptoRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public Crypto getCrypto(String base, String target){
        String finalUrl = this.url+ base+ "-" +target;
        ResponseEntity<Crypto> response = this.restTemplate.getForEntity(finalUrl, Crypto.class);
        return response.getBody();
      }

    public Crypto add(String base, String target){
        return  this.repository.save(getCrypto(base, target));
    }


}
