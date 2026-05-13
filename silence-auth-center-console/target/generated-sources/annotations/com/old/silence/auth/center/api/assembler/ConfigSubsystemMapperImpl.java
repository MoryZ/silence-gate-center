package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigSubsystem;
import com.old.silence.auth.center.dto.ConfigSubsystemCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigSubsystemMapperImpl implements ConfigSubsystemMapper {

    @Override
    public ConfigSubsystem convert(ConfigSubsystemCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ConfigSubsystem configSubsystem = new ConfigSubsystem();

        configSubsystem.setName( arg0.getName() );
        configSubsystem.setCode( arg0.getCode() );
        configSubsystem.setDescription( arg0.getDescription() );

        return configSubsystem;
    }
}
