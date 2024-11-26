package jpabook.model.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.util.Date;

@MappedSuperclass
@Getter
public class BaseEntity {

    private Date createdDate;
    private Date lastModifiedDate;
}
