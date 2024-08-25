package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lolrecordsearch.domain.*;
import lolrecordsearch.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RecordSearched extends AbstractEvent {

    private String gameId;

    public RecordSearched(Record aggregate) {
        super(aggregate);
    }

    public RecordSearched() {
        super();
    }
}
//>>> DDD / Domain Event
