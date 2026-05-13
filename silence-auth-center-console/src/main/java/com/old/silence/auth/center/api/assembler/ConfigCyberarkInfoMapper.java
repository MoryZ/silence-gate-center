package com.old.silence.auth.center.api.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;
import com.old.silence.auth.center.domain.model.ConfigCyberarkInfo;
import com.old.silence.auth.center.dto.ConfigCyberarkInfoCommand;
import com.old.silence.core.mapstruct.MapStructSpringConfig;

/**
 * @author MurrayZhang
 */

@Mapper(uses = MapStructSpringConfig.class)
public interface ConfigCyberarkInfoMapper extends Converter<ConfigCyberarkInfoCommand, ConfigCyberarkInfo> {


    @Mapping(target = "enabled", constant = "true")
    ConfigCyberarkInfo convert(ConfigCyberarkInfoCommand command) ;
}