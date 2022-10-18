package foodcookdelivery.domain;

import foodcookdelivery.domain.*;
import foodcookdelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private List<String> options;

    public Accepted(Cooking aggregate){
        super(aggregate);
    }
    public Accepted(){
        super();
    }
}
