package br.com.synapps.uniso_help_database_api.database.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentEntity {

    private Integer id;
    private Integer ra;
    private String password;
    private String name;

}
