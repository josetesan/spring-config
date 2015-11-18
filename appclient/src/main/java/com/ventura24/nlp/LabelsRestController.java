package com.ventura24.nlp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by josete on 19/11/15.
 */
@RestController
@RefreshScope
public class LabelsRestController {

    @Value("${labels.first}")
    String labelFirst;

    @Value("${labels.second}")
    String labelSecond;

    public LabelsRestController(){

    }


    @RequestMapping(value = "/labels",method = RequestMethod.GET)
    public String getLabels(){
        return String.join(";",this.labelFirst,this.labelSecond);
    }
}
