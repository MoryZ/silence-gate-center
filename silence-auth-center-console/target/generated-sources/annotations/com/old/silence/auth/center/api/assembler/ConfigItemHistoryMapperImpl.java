package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigItemHistory;
import com.old.silence.auth.center.dto.ConfigItemHistoryCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigItemHistoryMapperImpl implements ConfigItemHistoryMapper {

    @Override
    public ConfigItemHistory convert(ConfigItemHistoryCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ConfigItemHistory configItemHistory = new ConfigItemHistory();

        configItemHistory.setConfigItemId( arg0.getConfigItemId() );
        configItemHistory.setOldContent( arg0.getOldContent() );
        configItemHistory.setContent( arg0.getContent() );
        configItemHistory.setOperationType( arg0.getOperationType() );

        return configItemHistory;
    }
}
