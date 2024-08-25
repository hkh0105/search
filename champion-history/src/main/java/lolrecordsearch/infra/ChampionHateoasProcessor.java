package lolrecordsearch.infra;

import lolrecordsearch.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ChampionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Champion>> {

    @Override
    public EntityModel<Champion> process(EntityModel<Champion> model) {
        return model;
    }
}
