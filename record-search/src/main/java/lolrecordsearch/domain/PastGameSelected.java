package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lolrecordsearch.domain.*;
import lolrecordsearch.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PastGameSelected extends AbstractEvent {

    private String gameId;

    public PastGameSelected(Record aggregate) {
        super(aggregate);
    }

    public PastGameSelected() {
        super();
    }
}
//>>> DDD / Domain Event
