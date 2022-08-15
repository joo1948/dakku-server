package com.mirim9.dakku.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Diary extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long diaryId;

    @NotBlank
    private String title;

    @NotBlank
    private String fileS3Url;

    @NotBlank
    private String fileS3Name;

    @ManyToOne
    @JoinColumn(name ="member_id")
    private Member member;

    @OneToMany(
            mappedBy = "diary",
            fetch = FetchType.LAZY
    )
    private List<Reply> replyList = new ArrayList<>();

    @OneToMany(
            mappedBy = "diary",
            fetch = FetchType.LAZY
    )
    private List<Heart> heartList = new ArrayList<>();
}
