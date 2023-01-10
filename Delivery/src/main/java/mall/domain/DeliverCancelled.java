package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliverCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private String address;
    private String status;

    public DeliverCancelled(Deliver aggregate){
        super(aggregate);
    }
    public DeliverCancelled(){
        super();
    }
}
