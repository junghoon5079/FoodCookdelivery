package foodcookdelivery.domain;

import foodcookdelivery.domain.*;
import foodcookdelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private List<String> options;
    private String rejectionReason;

    public Rejected(Cooking aggregate){
        super(aggregate);
    }
    public Rejected(){
        super();
    }
}
