package RestAssured.cats.models;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Cat {

    @NonNull
    @NotNull
    private String name;

    @NonNull
    @NotNull
    private String color;

    @NonNull
    @NotNull
    private String character;

    @NonNull
    @NotNull
    private String gender;

    @NonNull
    @NotNull
    private int price;
}
