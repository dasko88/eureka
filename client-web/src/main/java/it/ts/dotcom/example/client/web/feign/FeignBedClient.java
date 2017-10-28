package it.ts.dotcom.example.client.web.feign;

import it.ts.dotcom.example.client.web.model.bean.Bed;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("client-eav")
public interface FeignBedClient {

    @RequestMapping(method = RequestMethod.GET, value = "/beds/{code}")
    public Bed getBed(@PathVariable("code") String code);

}
