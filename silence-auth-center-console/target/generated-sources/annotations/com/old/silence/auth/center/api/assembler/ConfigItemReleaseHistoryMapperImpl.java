package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.ConfigItemReleaseHistory;
import com.old.silence.auth.center.dto.ConfigItemReleaseHistoryCommand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ConfigItemReleaseHistoryMapperImpl implements ConfigItemReleaseHistoryMapper {

    @Override
    public ConfigItemReleaseHistory convert(ConfigItemReleaseHistoryCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ConfigItemReleaseHistory configItemReleaseHistory = new ConfigItemReleaseHistory();

        configItemReleaseHistory.setReleaseName( arg0.getReleaseName() );
        configItemReleaseHistory.setConfigItemId( arg0.getConfigItemId() );
        configItemReleaseHistory.setOldContent( arg0.getOldContent() );
        configItemReleaseHistory.setContent( arg0.getContent() );
        configItemReleaseHistory.setReleaseType( arg0.getReleaseType() );

        return configItemReleaseHistory;
    }
}
