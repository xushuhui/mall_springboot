package cn.phpst.mall.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Spu  extends BaseEntity{
    @Id
    private long id;
}
