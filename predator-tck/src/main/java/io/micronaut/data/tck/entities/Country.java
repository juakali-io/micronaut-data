package io.micronaut.data.tck.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

import java.util.Set;
import java.util.UUID;

@MappedEntity
public class Country {

    @Id
    private UUID uuid;
    private String name;

    @Relation(Relation.Kind.ONE_TO_MANY)
    private Set<RegionOrCounty> regions;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Set<RegionOrCounty> getRegions() {
        return regions;
    }

    public void setRegions(Set<RegionOrCounty> regions) {
        this.regions = regions;
    }
}
