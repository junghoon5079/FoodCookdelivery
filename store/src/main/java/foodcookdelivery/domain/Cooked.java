package foodcookdelivery.domain;

import foodcookdelivery.domain.*;
import foodcookdelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cooked extends AbstractEvent {

    private Long id;
    private Long orderId;
    private List<String> options;

    public Cooked(Cooking aggregate){
        super(aggregate);
    }
    public Cooked(){
        super();
    }
}
