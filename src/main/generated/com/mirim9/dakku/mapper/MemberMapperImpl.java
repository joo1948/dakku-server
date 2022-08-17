package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Member;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T23:46:21+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        Member member = new Member();

        return member;
    }

    @Override
    public MemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setCreateDateTime( entity.getCreateDateTime() );
        memberDto.setModifyDateTime( entity.getModifyDateTime() );
        memberDto.setMemberId( entity.getMemberId() );
        memberDto.setNickname( entity.getNickname() );
        memberDto.setEmail( entity.getEmail() );
        memberDto.setPassword( entity.getPassword() );

        return memberDto;
    }

    @Override
    public List<Member> toEntity(List<MemberDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Member> list = new ArrayList<Member>( dtoList.size() );
        for ( MemberDto memberDto : dtoList ) {
            list.add( toEntity( memberDto ) );
        }

        return list;
    }

    @Override
    public List<MemberDto> toDto(List<Member> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MemberDto> list = new ArrayList<MemberDto>( entityList.size() );
        for ( Member member : entityList ) {
            list.add( memberToMemberDto( member ) );
        }

        return list;
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
}
