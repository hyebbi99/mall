package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String stock;
    private String productImage;

    public StockIncreased(Inventory aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}
