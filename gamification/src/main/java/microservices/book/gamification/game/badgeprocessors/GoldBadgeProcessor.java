package microservices.book.gamification.game.badgeprocessors;

import microservices.book.gamification.challenge.ChallengeSolvedDTO;
import microservices.book.gamification.domain.BadgeType;
import microservices.book.gamification.domain.ScoreCard;
import microservices.book.gamification.game.BadgeProcessor;

import java.util.List;
import java.util.Optional;

public class GoldBadgeProcessor implements BadgeProcessor {

    public Optional<BadgeType> processForOptionalBadge(
            int currentScore,
            List<ScoreCard> scoreCardList,
            ChallengeSolvedDTO solved) {
        return currentScore > 400 ?
                Optional.of(BadgeType.GOLD) :
                Optional.empty();
    }

    @Override
    public BadgeType badgeType() {
        return BadgeType.GOLD;
    }
}
