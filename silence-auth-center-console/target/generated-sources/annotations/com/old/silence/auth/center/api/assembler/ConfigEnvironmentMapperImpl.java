package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigEnvironment;
import com.old.silence.auth.center.dto.ConfigEnvironmentCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigEnvironmentMapperImpl implements ConfigEnvironmentMapper {

    @Override
    public ConfigEnvironment convert(ConfigEnvironmentCommand command) {
        if ( command == null ) {
            return null;
        }

        ConfigEnvironment configEnvironment = new ConfigEnvironment();

        configEnvironment.setConfigComponentId( command.getConfigComponentId() );
        configEnvironment.setName( command.getName() );
        configEnvironment.setDisplayName( command.getDisplayName() );
        configEnvironment.setEnvType( command.getEnvType() );

        configEnvironment.setDisplay( true );

        return configEnvironment;
    }
}
