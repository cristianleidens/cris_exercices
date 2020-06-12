package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Cris Leidens
 */

@Getter @Setter

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
