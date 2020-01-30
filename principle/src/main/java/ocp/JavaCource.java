package ocp;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  java 课程
 * Created by qincasin on 2020/1/30.
 */
@Data
@AllArgsConstructor
public class JavaCource implements ICource{

    private Integer id;
    private String name;
    private Double price;
}
