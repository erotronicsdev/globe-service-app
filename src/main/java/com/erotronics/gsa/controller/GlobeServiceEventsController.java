package com.erotronics.gsa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/globe-service/event")
public class GlobeServiceEventsController {

    @RequestMapping(
            value = "/{timePeriod}",
            headers = { "church=globe", "town=reading" }, consumes = MediaType.ALL_VALUE, method =  RequestMethod.GET)
    public HttpStatus eventAtTimePeriod(@PathVariable String timePeriod) {
        return HttpStatus.OK;
    }

    @RequestMapping(
            value = "/{eventName&time}",
            headers = { "church=globe", "town=reading" }, consumes = MediaType.ALL_VALUE, method =  RequestMethod.DELETE)
    public HttpStatus deleteEventNameAtTime(@PathVariable String songName) {
        return HttpStatus.GONE;
    }

    @RequestMapping(
            value = "/add",
            headers = { "church=globe", "town=reading" }, consumes = MediaType.ALL_VALUE, method =  RequestMethod.POST)
    public HttpStatus eventsUpdate(@RequestBody String event) {
         return HttpStatus.ACCEPTED;
    }


}
