package org.xiyang.spring.learn.jpa.dao.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author: qiushui
 * @date: 2019-02-20 17:46
 */
@Data
@MappedSuperclass
public class BasePO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected boolean active = true;
    protected String createdBy;
    protected String updatedBy;
    protected Date updatedTime;
    protected Date createdTime;
}
