package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lolrecordsearch.ChampionHistoryApplication;
import lolrecordsearch.domain.ChampionHistorySelected;
import lombok.Data;

@Entity
@Table(name = "Champion_table")
@Data
//<<< DDD / Aggregate Root
public class Champion {

    @Id
    private String championId;

    private List<String> gameHistory;

    private Double winRate;

    @PostPersist
    public void onPostPersist() {
        ChampionHistorySelected championHistorySelected = new ChampionHistorySelected(
            this
        );
        championHistorySelected.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ChampionRepository repository() {
        ChampionRepository championRepository = ChampionHistoryApplication.applicationContext.getBean(
            ChampionRepository.class
        );
        return championRepository;
    }
}
//>>> DDD / Aggregate Root
