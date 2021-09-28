package microservices.book.multiplication.challenge;

import lombok.*;
import microservices.book.multiplication.user.User;

/**
 * Identifes the attempt from a {@link User} to solve a challenge.
 */

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    private User userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
