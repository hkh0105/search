package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lolrecordsearch.domain.*;
import lolrecordsearch.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ChampionHistorySelected extends AbstractEvent {

    private String championId;

    public ChampionHistorySelected(Champion aggregate) {
        super(aggregate);
    }

    public ChampionHistorySelected() {
        super();
    }
}
//>>> DDD / Domain Event
