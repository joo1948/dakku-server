package com.mirim9.dakku.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity extends BaseTimeEntity{

    //등록자/수정자 등의 사용자 코드 넣을 시 Security사용하여 Session처리해줄 것.
    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @CreatedBy
    @Column(updatable = false)
    private String modifiedBy;

}
