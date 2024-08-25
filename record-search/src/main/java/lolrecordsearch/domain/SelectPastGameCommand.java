package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class SelectPastGameCommand {

    private String gameId;
}
