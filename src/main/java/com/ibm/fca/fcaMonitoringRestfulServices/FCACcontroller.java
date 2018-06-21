package com.ibm.fca.fcaMonitoringRestfulServices;

import com.ibm.fca.fcaMonitoringRestfulServices.bean.AckType;
import com.ibm.fca.fcaMonitoringRestfulServices.bean.ITILType;
import com.ibm.fca.fcaMonitoringRestfulServices.bean.Stats;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FCACcontroller {

    @RequestMapping("/stats")
    public ResponseEntity stats() {
        List<Stats> statsList = new ArrayList<Stats>();
        statsList.add(new Stats(AckType.YES, "Server1", "INC01212", 86));
        statsList.add(new Stats(AckType.YES, "Server2", "INC01212", 127));
        statsList.add(new Stats(AckType.YES, "Server3", "INC01213", 111));
        statsList.add(new Stats(AckType.YES, "Server4", "INC01213", 131));
        HttpHeaders responseHeaders = new HttpHeaders();

        responseHeaders.set("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<List<Stats>>(statsList, responseHeaders, HttpStatus.CREATED);


    }
}
