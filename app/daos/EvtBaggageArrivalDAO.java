package daos;

import models.EvtBaggageArrival;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by prate_000 on 16-05-2016.
 */
public interface EvtBaggageArrivalDAO extends MongoRepository<EvtBaggageArrival, Integer>{
    List<EvtBaggageArrival> findAll();
    List<EvtBaggageArrival> findByTime(int time);
}
