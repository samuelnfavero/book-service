package com.ms.bookservice.client;

import com.ms.bookservice.dto.request.CambioRequest;
import com.ms.bookservice.dto.response.CambioResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;

@FeignClient(name = "cambio-service")
public interface CambioClient {

    @GetMapping("cambio-service/{amount}/{from}/{to}")
    public CambioResponse getCambio(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to);

}
