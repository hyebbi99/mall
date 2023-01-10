package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private Integer qty;
    private String customerId;
    private Date orderDate;
    private String address;
    private String productName;
    private String status;
}


