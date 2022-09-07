package com.mirim9.dakku.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@NoArgsConstructor
public class Attachment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attachmentId;

    @NotBlank
    private String name;

    @NotBlank
    private String fileS3Url;

    @NotBlank
    private String fileS3Name;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
