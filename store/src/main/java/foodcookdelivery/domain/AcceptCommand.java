package foodcookdelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class AcceptCommand {

        private String acceptOrNot;
        private String rejectionReason;


}
