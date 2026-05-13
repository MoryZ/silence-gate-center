package com.old.silence.auth.center.api.assembler;

import com.old.silence.auth.center.domain.model.Menu;
import com.old.silence.auth.center.dto.MenuCommand;
import com.old.silence.auth.center.dto.MenuDto;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class MenuMapperImpl implements MenuMapper {

    @Override
    public Menu convert(MenuCommand menuCommand) {
        if ( menuCommand == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setParentId( menuCommand.getParentId() );
        menu.setName( menuCommand.getName() );
        menu.setType( menuCommand.getType() );
        menu.setModuleType( menuCommand.getModuleType() );
        menu.setPath( menuCommand.getPath() );
        menu.setComponent( menuCommand.getComponent() );
        menu.setRedirect( menuCommand.getRedirect() );
        Map<String, Object> map = menuCommand.getMeta();
        if ( map != null ) {
            menu.setMeta( new LinkedHashMap<String, Object>( map ) );
        }
        menu.setSort( menuCommand.getSort() );

        menu.setStatus( true );

        return menu;
    }

    @Override
    public MenuDto convertToDto(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuDto menuDto = new MenuDto();

        menuDto.setId( menu.getId() );
        menuDto.setParentId( menu.getParentId() );
        menuDto.setName( menu.getName() );
        menuDto.setType( menu.getType() );
        menuDto.setModuleType( menu.getModuleType() );
        menuDto.setPath( menu.getPath() );
        menuDto.setComponent( menu.getComponent() );
        menuDto.setRedirect( menu.getRedirect() );
        Map<String, Object> map = menu.getMeta();
        if ( map != null ) {
            menuDto.setMeta( new LinkedHashMap<String, Object>( map ) );
        }
        menuDto.setSort( menu.getSort() );
        menuDto.setStatus( menu.getStatus() );

        return menuDto;
    }
}
