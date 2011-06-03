package nl.dslmeinte.xtext.examples.ui;

import nl.dslmeinte.xtext.examples.ui.syntaxcoloring.DTDTokenToAttributeIDMapper;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DTDLanguageUiModule extends nl.dslmeinte.xtext.examples.ui.AbstractDTDLanguageUiModule {

	public DTDLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

    public void configureTokenToAttributeIDMapper(Binder binder)
    {
        binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(DTDTokenToAttributeIDMapper.class);
    }

}
