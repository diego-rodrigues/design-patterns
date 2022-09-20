package com.marionete.patterns.creational.builder;

/**
 * The builder can be used when the constructors become too big, it provides a more structured way
 * of instantiating objects.
 */
public class Car {

    private final String model;
    private final int year;
    private final String color;
    private final int doors;
    private final boolean hasGps, hasRadio, hasAirConditioning;

    private Car(String model,
                String color,
                int year,
                int doors,
                boolean hasGps,
                boolean hasRadio,
                boolean hasAirConditioning) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.doors = doors;
        this.hasGps = hasGps;
        this.hasRadio = hasRadio;
        this.hasAirConditioning = hasAirConditioning;
    }

    public String description() {
        String description = String.format("This is a %s %s - %d with %d doors.", color, model, year, doors);
        description = hasGps ? description + " It has GPS." : description;
        description = hasRadio ? description + " It has radio." : description;
        description = hasAirConditioning ? description + " It has air conditioning." : description;
        return description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();

        // add all attributes to the builder
        return builder
                .fromModel(model)
                .withDoors(doors)
                .withColor(color)
                .fromYear(year)
                .withGps(hasGps)
                .withRadio(hasRadio)
                .withAirConditioning(hasAirConditioning);
    }

    public static class Builder {
        private int year;
        private String model, color;
        private int doors;
        private boolean hasGps, hasRadio, hasAirConditioning;

        private Builder() {
            model = "Blank";
            year = 1970;
            color = "black";
            doors = 2;
            hasGps = false;
            hasRadio = false;
            hasAirConditioning = false;
        }

        public Builder fromModel(String model) {
            this.model = model;
            return this;
        }

        public Builder fromYear(int year) {
            this.year = year;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder withGps(boolean hasGps) {
            this.hasGps = hasGps;
            return this;
        }

        public Builder withRadio(boolean hasRadio) {
            this.hasRadio = hasRadio;
            return this;
        }

        public Builder withAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public Builder allInCar() {
            // quickly start an "all-in" car which has air conditioning, radio and gps.
            this.hasRadio = true;
            this.hasAirConditioning = true;
            this.hasGps = true;
            return this;
        }

        public Builder simpleCar() {
            // quickly start a simple car which does not have any of the fancy stuff.
            this.hasRadio = false;
            this.hasGps = false;
            this.hasAirConditioning = false;
            return this;
        }

        public Car build() {
            return new Car(this.model, this.color, this.year, this.doors,
                    this.hasGps, this.hasRadio, this.hasAirConditioning);
        }
    }
}
