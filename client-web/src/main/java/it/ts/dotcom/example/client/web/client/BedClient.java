package it.ts.dotcom.example.client.web.client;

import it.ts.dotcom.example.client.web.feign.FeignBedClient;
import it.ts.dotcom.example.client.web.model.bean.Bed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BedClient {

    @Autowired
    private FeignBedClient feignBedClient;

    public Bed getBed(String code) throws Exception {
        return this.feignBedClient.getBed(code);
    }

}
