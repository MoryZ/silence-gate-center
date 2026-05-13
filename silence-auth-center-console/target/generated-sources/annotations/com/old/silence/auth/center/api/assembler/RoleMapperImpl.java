package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.Role;
import com.old.silence.auth.center.dto.RoleCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role convert(RoleCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( arg0.getId() );
        role.setName( arg0.getName() );
        role.setCode( arg0.getCode() );
        role.setAppCode( arg0.getAppCode() );
        role.setDescription( arg0.getDescription() );
        role.setStatus( arg0.getStatus() );

        return role;
    }
}
