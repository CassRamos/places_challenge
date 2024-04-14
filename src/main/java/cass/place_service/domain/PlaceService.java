package cass.place_service.domain;

import cass.place_service.api.PlaceRequest;
import reactor.core.publisher.Mono;


public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest request) {
        var place = new Place(
                null,
                request.name(),
                request.slug(),
                request.state(),
                request.createdAt(),
                request.updatedAt());
        return placeRepository.save(place);
    }
}
