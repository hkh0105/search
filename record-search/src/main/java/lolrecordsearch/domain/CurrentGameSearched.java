package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lolrecordsearch.domain.*;
import lolrecordsearch.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CurrentGameSearched extends AbstractEvent {

    private String gameId;

    public CurrentGameSearched(Record aggregate) {
        super(aggregate);
    }

    public CurrentGameSearched() {
        super();
    }
}
//>>> DDD / Domain Event
