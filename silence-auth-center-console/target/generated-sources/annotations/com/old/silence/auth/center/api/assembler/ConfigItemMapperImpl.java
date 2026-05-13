package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigItem;
import com.old.silence.auth.center.dto.ConfigItemCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigItemMapperImpl implements ConfigItemMapper {

    @Override
    public ConfigItem convert(ConfigItemCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ConfigItem configItem = new ConfigItem();

        configItem.setConfigEnvironmentId( arg0.getConfigEnvironmentId() );
        configItem.setNamespaceId( arg0.getNamespaceId() );
        configItem.setNamespaceStatus( arg0.getNamespaceStatus() );
        configItem.setFormatType( arg0.getFormatType() );
        configItem.setType( arg0.getType() );
        configItem.setOldContent( arg0.getOldContent() );
        configItem.setContent( arg0.getContent() );
        configItem.setMd5( arg0.getMd5() );

        return configItem;
    }
}
