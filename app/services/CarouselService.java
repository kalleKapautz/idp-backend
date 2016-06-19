package services;

import com.fasterxml.jackson.databind.JsonNode;
import models.Carousel;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by prate_000 on 16-05-2016.
 */
public interface CarouselService {
    void addCarousel(Carousel carousel);
    int getMaxCapacity(int carouselId);
    int getCurrentCapacity(int carouselId);
    JsonNode getCarousels();
    Carousel findById(int id);
    int countWorkStations(int carouselId);
    JsonNode getFlightList(int carouselId);
    List<Integer> getAllCarouselsId();
}
