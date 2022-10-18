package foodcookdelivery.domain;

import foodcookdelivery.domain.*;
import foodcookdelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}


