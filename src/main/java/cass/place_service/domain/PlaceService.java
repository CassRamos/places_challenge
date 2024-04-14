package cass.place_service.domain;

import cass.place_service.api.PlaceRequest;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;


public class PlaceService {
    private final PlaceRepository placeRepository;
    private final Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest request) {
        var place = new Place(
                null,
                request.name(),
                slg.slugify(request.name()),
                request.state(),
                request.createdAt(),
                request.updatedAt());
        return placeRepository.save(place);
    }
}
