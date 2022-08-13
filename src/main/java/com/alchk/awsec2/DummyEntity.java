package com.alchk.awsec2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DUMMY_DATA")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DummyEntity {

    @Id
    private String key;
    private String value;
}
