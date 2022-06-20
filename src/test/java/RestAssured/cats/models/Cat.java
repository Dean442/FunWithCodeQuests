package RestAssured.cats.models;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Cat {

    @NonNull
    private String name;

    @NonNull
    private String color;

    @NonNull
    private String character;

    @NonNull
    private String gender;

    private int price;
}
