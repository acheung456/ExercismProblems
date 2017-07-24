import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    LocalDateTime _birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        _birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return _birthDateTime.plusSeconds((long)Math.pow(10,9));
    }

}
