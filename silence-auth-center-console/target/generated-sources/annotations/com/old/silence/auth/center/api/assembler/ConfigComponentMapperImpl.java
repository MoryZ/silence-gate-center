package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigComponent;
import com.old.silence.auth.center.dto.ConfigComponentCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigComponentMapperImpl implements ConfigComponentMapper {

    @Override
    public ConfigComponent convert(ConfigComponentCommand command) {
        if ( command == null ) {
            return null;
        }

        ConfigComponent configComponent = new ConfigComponent();

        configComponent.setName( command.getName() );
        configComponent.setCode( command.getCode() );
        configComponent.setSubsystemId( command.getSubsystemId() );
        configComponent.setDescription( command.getDescription() );

        configComponent.setStatus( true );

        return configComponent;
    }
}
