package com.old.silence.auth.center.api.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;
import com.old.silence.core.mapstruct.MapStructSpringConfig;
import com.old.silence.auth.center.domain.model.ConfigComponent;
import com.old.silence.auth.center.dto.ConfigComponentCommand;

/**
 * @author MurrayZhang
 */

@Mapper(uses = MapStructSpringConfig.class)
public interface ConfigComponentMapper extends Converter<ConfigComponentCommand, ConfigComponent> {


    @Mapping(target = "status", constant = "true")
    ConfigComponent convert(ConfigComponentCommand command) ;
}