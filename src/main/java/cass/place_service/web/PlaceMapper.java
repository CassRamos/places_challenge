package cass.place_service.web;

import cass.place_service.api.PlaceResponse;
import cass.place_service.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(
                place.name(),
                place.slug(),
                place.state(),
                place.createdAt(),
                place.updatedAt()
        );
    }
}
