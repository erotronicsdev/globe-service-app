package com.erotronics.gsa.domain;

import lombok.Data;
import javax.persistence.Id;

@Data
public class Event {

    @Id
    String eventId;
    private String eventName;
    private String eventStartTime;
    private String eventEndTime;
    private String eventDescription;
    private String isEventRecurring;
    private String recurringTime;
    private String recurringNumber;

    public Event (String eventName, String eventStartTime, String eventEndTime, String eventDescription,
                  String isEventRecurring, String recurringTime, String recurringNumber) {
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.eventDescription = eventDescription;
        this.isEventRecurring = isEventRecurring;
        this.eventName = eventName;
        this.recurringTime = recurringTime;
        this.recurringNumber = recurringNumber;
    }
}
