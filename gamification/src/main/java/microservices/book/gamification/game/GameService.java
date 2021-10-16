package microservices.book.gamification.game;


import lombok.Value;
import microservices.book.gamification.challenge.ChallengeSolvedDTO;
import microservices.book.gamification.domain.BadgeCard;
import microservices.book.gamification.domain.BadgeType;

import java.util.List;

public interface GameService {

    /**
     * Process a new attempt from a given user.
     * @param challenge the challenge data with user details, factors, etc.
     * @return a {@link GameResult} object containing the new score and badge
     * cards obtained.
     */
    GameResult newAttemptForUser(ChallengeSolvedDTO challenge);

    @Value
    class GameResult {
        int score;
        List<BadgeType> badges;
    }
}