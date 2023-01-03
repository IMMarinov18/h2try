package iliikata.h2try.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private Integer horsePower;
    private String driver;
}
