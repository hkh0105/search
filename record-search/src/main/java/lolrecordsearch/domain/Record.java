package lolrecordsearch.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lolrecordsearch.RecordSearchApplication;
import lolrecordsearch.domain.CurrentGameSearched;
import lolrecordsearch.domain.PastGameSelected;
import lolrecordsearch.domain.RecordSearched;
import lombok.Data;

@Entity
@Table(name = "Record_table")
@Data
//<<< DDD / Aggregate Root
public class Record {

    @Id
    private String gameId;

    private Double winRate;

    private List<String> gameHistory;

    private String currentGame;

    private List<String> pastGames;

    @PostPersist
    public void onPostPersist() {
        RecordSearched recordSearched = new RecordSearched(this);
        recordSearched.publishAfterCommit();

        CurrentGameSearched currentGameSearched = new CurrentGameSearched(this);
        currentGameSearched.publishAfterCommit();

        PastGameSelected pastGameSelected = new PastGameSelected(this);
        pastGameSelected.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RecordRepository repository() {
        RecordRepository recordRepository = RecordSearchApplication.applicationContext.getBean(
            RecordRepository.class
        );
        return recordRepository;
    }
}
//>>> DDD / Aggregate Root
