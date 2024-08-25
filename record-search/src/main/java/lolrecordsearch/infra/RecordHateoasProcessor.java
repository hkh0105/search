package lolrecordsearch.infra;

import lolrecordsearch.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RecordHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Record>> {

    @Override
    public EntityModel<Record> process(EntityModel<Record> model) {
        return model;
    }
}
