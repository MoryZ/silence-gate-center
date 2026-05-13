package org.mapstruct.extensions.spring.converter;

import com.old.silence.auth.center.domain.model.ConfigAccessKeys;
import com.old.silence.auth.center.domain.model.ConfigComponent;
import com.old.silence.auth.center.domain.model.ConfigCyberarkInfo;
import com.old.silence.auth.center.domain.model.ConfigEnvironment;
import com.old.silence.auth.center.domain.model.ConfigItem;
import com.old.silence.auth.center.domain.model.ConfigItemHistory;
import com.old.silence.auth.center.domain.model.ConfigItemReleaseHistory;
import com.old.silence.auth.center.domain.model.ConfigSubsystem;
import com.old.silence.auth.center.domain.model.Menu;
import com.old.silence.auth.center.domain.model.Notice;
import com.old.silence.auth.center.domain.model.Role;
import com.old.silence.auth.center.domain.model.User;
import com.old.silence.auth.center.dto.ConfigAccessKeysCommand;
import com.old.silence.auth.center.dto.ConfigComponentCommand;
import com.old.silence.auth.center.dto.ConfigCyberarkInfoCommand;
import com.old.silence.auth.center.dto.ConfigEnvironmentCommand;
import com.old.silence.auth.center.dto.ConfigItemCommand;
import com.old.silence.auth.center.dto.ConfigItemHistoryCommand;
import com.old.silence.auth.center.dto.ConfigItemReleaseHistoryCommand;
import com.old.silence.auth.center.dto.ConfigSubsystemCommand;
import com.old.silence.auth.center.dto.MenuCommand;
import com.old.silence.auth.center.dto.NoticeCommand;
import com.old.silence.auth.center.dto.RoleCommand;
import com.old.silence.auth.center.dto.UserCommand;
import javax.annotation.processing.Generated;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

@Generated("org.mapstruct.extensions.spring.converter.ConversionServiceAdapterGenerator")
@Component
public class ConversionServiceAdapter {
  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGENVIRONMENTCOMMAND = TypeDescriptor.valueOf(ConfigEnvironmentCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGENVIRONMENT = TypeDescriptor.valueOf(ConfigEnvironment.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGCYBERARKINFOCOMMAND = TypeDescriptor.valueOf(ConfigCyberarkInfoCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGCYBERARKINFO = TypeDescriptor.valueOf(ConfigCyberarkInfo.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMRELEASEHISTORYCOMMAND = TypeDescriptor.valueOf(ConfigItemReleaseHistoryCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEMRELEASEHISTORY = TypeDescriptor.valueOf(ConfigItemReleaseHistory.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGSUBSYSTEMCOMMAND = TypeDescriptor.valueOf(ConfigSubsystemCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGSUBSYSTEM = TypeDescriptor.valueOf(ConfigSubsystem.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_ROLECOMMAND = TypeDescriptor.valueOf(RoleCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_ROLE = TypeDescriptor.valueOf(Role.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMHISTORYCOMMAND = TypeDescriptor.valueOf(ConfigItemHistoryCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEMHISTORY = TypeDescriptor.valueOf(ConfigItemHistory.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_MENUCOMMAND = TypeDescriptor.valueOf(MenuCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_MENU = TypeDescriptor.valueOf(Menu.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGCOMPONENTCOMMAND = TypeDescriptor.valueOf(ConfigComponentCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGCOMPONENT = TypeDescriptor.valueOf(ConfigComponent.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMCOMMAND = TypeDescriptor.valueOf(ConfigItemCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEM = TypeDescriptor.valueOf(ConfigItem.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_NOTICECOMMAND = TypeDescriptor.valueOf(NoticeCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_NOTICE = TypeDescriptor.valueOf(Notice.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGACCESSKEYSCOMMAND = TypeDescriptor.valueOf(ConfigAccessKeysCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGACCESSKEYS = TypeDescriptor.valueOf(ConfigAccessKeys.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_USERCOMMAND = TypeDescriptor.valueOf(UserCommand.class);

  private static final TypeDescriptor TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_USER = TypeDescriptor.valueOf(User.class);

  private final ConversionService conversionService;

  public ConversionServiceAdapter(@Lazy final ConversionService conversionService) {
    this.conversionService = conversionService;
  }

  public ConfigEnvironment mapConfigEnvironmentCommandToConfigEnvironment(
      final ConfigEnvironmentCommand source) {
    return (ConfigEnvironment) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGENVIRONMENTCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGENVIRONMENT);
  }

  public ConfigCyberarkInfo mapConfigCyberarkInfoCommandToConfigCyberarkInfo(
      final ConfigCyberarkInfoCommand source) {
    return (ConfigCyberarkInfo) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGCYBERARKINFOCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGCYBERARKINFO);
  }

  public ConfigItemReleaseHistory mapConfigItemReleaseHistoryCommandToConfigItemReleaseHistory(
      final ConfigItemReleaseHistoryCommand source) {
    return (ConfigItemReleaseHistory) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMRELEASEHISTORYCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEMRELEASEHISTORY);
  }

  public ConfigSubsystem mapConfigSubsystemCommandToConfigSubsystem(
      final ConfigSubsystemCommand source) {
    return (ConfigSubsystem) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGSUBSYSTEMCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGSUBSYSTEM);
  }

  public Role mapRoleCommandToRole(final RoleCommand source) {
    return (Role) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_ROLECOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_ROLE);
  }

  public ConfigItemHistory mapConfigItemHistoryCommandToConfigItemHistory(
      final ConfigItemHistoryCommand source) {
    return (ConfigItemHistory) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMHISTORYCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEMHISTORY);
  }

  public Menu mapMenuCommandToMenu(final MenuCommand source) {
    return (Menu) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_MENUCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_MENU);
  }

  public ConfigComponent mapConfigComponentCommandToConfigComponent(
      final ConfigComponentCommand source) {
    return (ConfigComponent) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGCOMPONENTCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGCOMPONENT);
  }

  public ConfigItem mapConfigItemCommandToConfigItem(final ConfigItemCommand source) {
    return (ConfigItem) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGITEMCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGITEM);
  }

  public Notice mapNoticeCommandToNotice(final NoticeCommand source) {
    return (Notice) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_NOTICECOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_NOTICE);
  }

  public ConfigAccessKeys mapConfigAccessKeysCommandToConfigAccessKeys(
      final ConfigAccessKeysCommand source) {
    return (ConfigAccessKeys) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_CONFIGACCESSKEYSCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_CONFIGACCESSKEYS);
  }

  public User mapUserCommandToUser(final UserCommand source) {
    return (User) conversionService.convert(source, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DTO_USERCOMMAND, TYPE_DESCRIPTOR_COM_OLD_SILENCE_AUTH_CENTER_DOMAIN_MODEL_USER);
  }
}
