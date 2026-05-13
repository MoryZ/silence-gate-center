package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.Notice;
import com.old.silence.auth.center.dto.NoticeCommand;
import com.old.silence.auth.center.enums.NoticeStatus;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class NoticeMapperImpl implements NoticeMapper {

    @Override
    public Notice convert(NoticeCommand source) {
        if ( source == null ) {
            return null;
        }

        Notice notice = new Notice();

        notice.setSenderId( source.getSenderId() );
        notice.setSenderName( source.getSenderName() );
        notice.setTitle( source.getTitle() );
        notice.setContent( source.getContent() );

        notice.setStatus( NoticeStatus.UN_READ );

        return notice;
    }
}
