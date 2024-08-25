package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class SelectChampionHistoryCommand {

    private String championId;
}
