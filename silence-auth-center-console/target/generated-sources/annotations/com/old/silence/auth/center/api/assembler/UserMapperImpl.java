package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.User;
import com.old.silence.auth.center.dto.UserCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User convert(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setId( userCommand.getId() );
        user.setUsername( userCommand.getUsername() );
        user.setPassword( userCommand.getPassword() );
        user.setNickname( userCommand.getNickname() );
        user.setAvatar( userCommand.getAvatar() );
        user.setEmail( userCommand.getEmail() );
        user.setPhone( userCommand.getPhone() );
        user.setStatus( userCommand.getStatus() );

        return user;
    }
}
