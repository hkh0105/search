package lolrecordsearch.domain;

import java.util.*;
import lolrecordsearch.domain.*;
import lolrecordsearch.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class RecordSearched extends AbstractEvent {

    private String gameId;
}
