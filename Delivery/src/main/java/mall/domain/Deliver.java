package mall.domain;

import mall.domain.DeliveryStarted;
import mall.domain.DeliverCompleted;
import mall.domain.DeliverCancelled;
import mall.domain.DeliveryReturned;
import mall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Deliver_table")
@Data

public class Deliver  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliverCompleted deliverCompleted = new DeliverCompleted(this);
        deliverCompleted.publishAfterCommit();



        DeliverCancelled deliverCancelled = new DeliverCancelled(this);
        deliverCancelled.publishAfterCommit();



        DeliveryReturned deliveryReturned = new DeliveryReturned(this);
        deliveryReturned.publishAfterCommit();

    }

    public static DeliverRepository repository(){
        DeliverRepository deliverRepository = DeliveryApplication.applicationContext.getBean(DeliverRepository.class);
        return deliverRepository;
    }




    public static void startDelivery(Ordered ordered){

        /** Example 1:  new item 
        Deliver deliver = new Deliver();
        repository().save(deliver);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(deliver->{
            
            deliver // do something
            repository().save(deliver);


         });
        */

        
    }
    public static void cancelDelivery(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        Deliver deliver = new Deliver();
        repository().save(deliver);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(deliver->{
            
            deliver // do something
            repository().save(deliver);


         });
        */

        
    }


}
