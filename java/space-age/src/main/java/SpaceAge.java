
class SpaceAge {
    double _ageInSeconds;

    SpaceAge(double seconds) {
        _ageInSeconds = seconds;
    }

    double secondsToRelativeYears(double seconds, double orbitalPeriod) {
        // Convert seconds to years and divide by orbitalPeriod for relative age
        return  seconds /60 /60 /24 /365.25 /orbitalPeriod;
    }

    double getSeconds() {
        return _ageInSeconds;
    }

    double onEarth() {
        return secondsToRelativeYears(_ageInSeconds, 1);
    }

    double onMercury() {
        return secondsToRelativeYears(_ageInSeconds, 0.2408467);
    }

    double onVenus() {
        return secondsToRelativeYears(_ageInSeconds,  0.61519726 );
    }

    double onMars() {
        return secondsToRelativeYears(_ageInSeconds, 1.8808158);
    }

    double onJupiter() {
        return secondsToRelativeYears(_ageInSeconds, 11.862615);
    }

    double onSaturn() {
        return secondsToRelativeYears(_ageInSeconds, 29.447498);
    }

    double onUranus() {
        return secondsToRelativeYears(_ageInSeconds,  84.016846);
    }

    double onNeptune() {
        return secondsToRelativeYears(_ageInSeconds, 164.79132);
    }

}
