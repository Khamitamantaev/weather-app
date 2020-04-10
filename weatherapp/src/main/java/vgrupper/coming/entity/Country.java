package vgrupper.coming.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    private List<City> cities;

}
