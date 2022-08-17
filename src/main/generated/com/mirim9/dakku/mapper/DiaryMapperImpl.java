package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.DiaryDto;
import com.mirim9.dakku.dto.HeartDto;
import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.dto.ReplyDto;
import com.mirim9.dakku.dto.ReplyDto.ReplyDtoBuilder;
import com.mirim9.dakku.entity.Diary;
import com.mirim9.dakku.entity.Heart;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.entity.Reply;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-18T00:13:00+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class DiaryMapperImpl implements DiaryMapper {

    @Override
    public Diary toEntity(DiaryDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Diary diary = new Diary();

        if ( diary.getReplyList() != null ) {
            List<Reply> list = replyDtoListToReplyList( arg0.getReplyList() );
            if ( list != null ) {
                diary.getReplyList().addAll( list );
            }
        }
        if ( diary.getHeartList() != null ) {
            List<Heart> list1 = heartDtoListToHeartList( arg0.getHeartList() );
            if ( list1 != null ) {
                diary.getHeartList().addAll( list1 );
            }
        }

        return diary;
    }

    @Override
    public DiaryDto toDto(Diary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DiaryDto diaryDto = new DiaryDto();

        diaryDto.setCreateDateTime( arg0.getCreateDateTime() );
        diaryDto.setModifyDateTime( arg0.getModifyDateTime() );
        diaryDto.setDiaryId( arg0.getDiaryId() );
        diaryDto.setTitle( arg0.getTitle() );
        diaryDto.setFileS3Url( arg0.getFileS3Url() );
        diaryDto.setFileS3Name( arg0.getFileS3Name() );
        diaryDto.setMember( memberToMemberDto( arg0.getMember() ) );
        diaryDto.setReplyList( replyListToReplyDtoList( arg0.getReplyList() ) );
        diaryDto.setHeartList( heartListToHeartDtoList( arg0.getHeartList() ) );

        return diaryDto;
    }

    @Override
    public List<Diary> toEntity(List<DiaryDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Diary> list = new ArrayList<Diary>( arg0.size() );
        for ( DiaryDto diaryDto : arg0 ) {
            list.add( toEntity( diaryDto ) );
        }

        return list;
    }

    @Override
    public List<DiaryDto> toDto(List<Diary> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DiaryDto> list = new ArrayList<DiaryDto>( arg0.size() );
        for ( Diary diary : arg0 ) {
            list.add( diaryToDiaryDto( diary ) );
        }

        return list;
    }

    @Override
    public Heart map(HeartDto value) {
        if ( value == null ) {
            return null;
        }

        Heart heart = new Heart();

        return heart;
    }

    @Override
    public Reply map(ReplyDto value) {
        if ( value == null ) {
            return null;
        }

        Reply reply = new Reply();

        return reply;
    }

    @Override
    public HeartDto mapDto(Heart heart) {
        if ( heart == null ) {
            return null;
        }

        HeartDto heartDto = new HeartDto();

        heartDto.setCreateDateTime( heart.getCreateDateTime() );
        heartDto.setModifyDateTime( heart.getModifyDateTime() );
        heartDto.setHeartId( heart.getHeartId() );
        heartDto.setMember( memberToMemberDto( heart.getMember() ) );
        heartDto.setDiary( toDto( heart.getDiary() ) );

        return heartDto;
    }

    @Override
    public ReplyDto mapDto(Reply reply) {
        if ( reply == null ) {
            return null;
        }

        ReplyDtoBuilder replyDto = ReplyDto.builder();

        replyDto.replyId( reply.getReplyId() );
        replyDto.content( reply.getContent() );
        replyDto.depth( reply.getDepth() );
        replyDto.diary( toDto( reply.getDiary() ) );
        replyDto.member( memberToMemberDto( reply.getMember() ) );

        return replyDto.build();
    }

    protected List<Reply> replyDtoListToReplyList(List<ReplyDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Reply> list1 = new ArrayList<Reply>( list.size() );
        for ( ReplyDto replyDto : list ) {
            list1.add( map( replyDto ) );
        }

        return list1;
    }

    protected List<Heart> heartDtoListToHeartList(List<HeartDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Heart> list1 = new ArrayList<Heart>( list.size() );
        for ( HeartDto heartDto : list ) {
            list1.add( map( heartDto ) );
        }

        return list1;
    }

    protected MemberDto memberToMemberDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setCreateDateTime( member.getCreateDateTime() );
        memberDto.setModifyDateTime( member.getModifyDateTime() );
        memberDto.setMemberId( member.getMemberId() );
        memberDto.setNickname( member.getNickname() );
        memberDto.setEmail( member.getEmail() );
        memberDto.setPassword( member.getPassword() );

        return memberDto;
    }

    protected List<ReplyDto> replyListToReplyDtoList(List<Reply> list) {
        if ( list == null ) {
            return null;
        }

        List<ReplyDto> list1 = new ArrayList<ReplyDto>( list.size() );
        for ( Reply reply : list ) {
            list1.add( mapDto( reply ) );
        }

        return list1;
    }

    protected List<HeartDto> heartListToHeartDtoList(List<Heart> list) {
        if ( list == null ) {
            return null;
        }

        List<HeartDto> list1 = new ArrayList<HeartDto>( list.size() );
        for ( Heart heart : list ) {
            list1.add( mapDto( heart ) );
        }

        return list1;
    }

    protected DiaryDto diaryToDiaryDto(Diary diary) {
        if ( diary == null ) {
            return null;
        }

        DiaryDto diaryDto = new DiaryDto();

        diaryDto.setCreateDateTime( diary.getCreateDateTime() );
        diaryDto.setModifyDateTime( diary.getModifyDateTime() );
        diaryDto.setDiaryId( diary.getDiaryId() );
        diaryDto.setTitle( diary.getTitle() );
        diaryDto.setFileS3Url( diary.getFileS3Url() );
        diaryDto.setFileS3Name( diary.getFileS3Name() );
        diaryDto.setMember( memberToMemberDto( diary.getMember() ) );
        diaryDto.setReplyList( replyListToReplyDtoList( diary.getReplyList() ) );
        diaryDto.setHeartList( heartListToHeartDtoList( diary.getHeartList() ) );

        return diaryDto;
    }
}
