package org.xiyang.spring.learn.jpa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xiyang.spring.learn.jpa.dao.po.TemplatePO;

import java.util.Optional;

/**
 * @author: qiushui
 * @date: 2019-02-20 17:38
 */
public interface TemplateRepository extends JpaRepository<TemplatePO,Long> {

    Optional<TemplatePO> findByCode(String code);
}
