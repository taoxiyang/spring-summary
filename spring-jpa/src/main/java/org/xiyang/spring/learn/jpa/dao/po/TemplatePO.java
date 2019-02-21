package org.xiyang.spring.learn.jpa.dao.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * @author: qiushui
 * @date: 2019-02-20 17:38
 */

@Entity
@Table(name = "cube_query_template")
public class TemplatePO extends BasePO implements Serializable {

    private String type;

    private String index;

    private String code;

    private String template;

    private String resolveScript;


}
