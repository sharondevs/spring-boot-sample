package com.ub.cse.workshop.springstartupsvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Technologies {
    private int techid;
    private String techname;

    public void tech()
    {
        System.out.println("technologies object Returned Successfully");
    }
}
