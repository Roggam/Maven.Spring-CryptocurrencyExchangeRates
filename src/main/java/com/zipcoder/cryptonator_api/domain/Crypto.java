package com.zipcoder.cryptonator_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by leon on 1/22/18.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Crypto  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Ticker ticker;
    private Long timestamp;
    private Boolean success;
    private String error;

    public Crypto() {
    }

    public Crypto(Long id, Ticker ticker, Long timestamp, Boolean success, String error) {
        this.id = id;
        this.ticker = ticker;
        this.timestamp = timestamp;
        this.success = success;
        this.error = error;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "\n"+"Crypto {" +"\n"+
                "id: " + id + ",\n"+
                "ticker: " + ticker + ",\n"+
                "timestamp: " + timestamp + ",\n"+
                "success: " + success + ",\n"+
                "error: '" + error + '\'' +
                '}' + "\n";
    }
}
