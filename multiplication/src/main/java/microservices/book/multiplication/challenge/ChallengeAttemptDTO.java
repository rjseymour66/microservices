package microservices.book.multiplication.challenge;

import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * Attempt coming from the user
 */
@Value
public class ChallengeAttemptDTO {

    @Min(1) @Max(99)
    private int factorA, factorB;
    @NotBlank
    private String userAlias;
    @Positive(message = "How could you possibly get a negative result here? Try again!")
    private int guess;
}
