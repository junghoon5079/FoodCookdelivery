package foodcookdelivery.domain;

import foodcookdelivery.domain.*;
import foodcookdelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Object options;
}


