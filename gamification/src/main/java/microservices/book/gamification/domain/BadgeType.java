package microservices.book.gamification.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enumeration with the different types of Badges that a user can win.
 */

@RequiredArgsConstructor
@Getter
public enum BadgeType {

    // Badges depending on score
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("GOLD"),

    // other badges won for different conditions
    FIRST_WON("First time"),
    LUCKY_NUMBER("Lucky number");

    private final String description;
}
