package com.codeit.otboo.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing //Auditing 활성화 설정
public class JpaAuditingConfiguration {

}
