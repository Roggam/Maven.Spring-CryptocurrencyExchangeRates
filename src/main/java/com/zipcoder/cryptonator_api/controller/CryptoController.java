package com.zipcoder.cryptonator_api.controller;

import com.zipcoder.cryptonator_api.domain.Crypto;
import com.zipcoder.cryptonator_api.services.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/**
 * Created by leon on 1/22/18.
 */
@RestController
public class CryptoController {

    private CryptoService cryptoService;


   @Autowired
    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }


 @RequestMapping(value = "crypto/{base}-{target}", method = RequestMethod.GET)

    public ResponseEntity<Crypto> getCryptoInfo(@PathVariable String base, @PathVariable String target){
        return new ResponseEntity<>(cryptoService.add(base, target), HttpStatus.OK);
    }

}
