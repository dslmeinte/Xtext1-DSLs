/*
* generated by Xtext
*/
package nl.dslmeinte.xtext.sgml.base.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant.
 */
public class BaseProposalProvider extends AbstractBaseProposalProvider {

	/**
	 * Provides content assist for entity references, by directly creating the
	 * proposals from what the scope provider returns and taking care to close
	 * the proposal text (replacement string) with the semi-colon ({@code ';'})
	 * required for valid entity references.
	 * <p>
	 * Note that
	 * {@link #complete_PCDATAEntityReference_Entity(EObject, Assignment, ContentAssistContext, ICompletionProposalAcceptor)}
	 * is never called because of the way the grammar is (necessarily) set up.
	 */
	@Override
	public void complete__PCDATAEntityReference(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		AbstractRule rule = ruleCall.getRule();													// == ParserRule('_PCDATAEntityReference');
		AbstractElement alternatives = ((ParserRule) rule).getAlternatives();					// == Group
		AbstractElement element = ((Group) alternatives).getElements().get(1);					// == Assignment('=entity', CrossReference)
		CrossReference crossReference = (CrossReference) ((Assignment) element).getTerminal();	// == CrossReference(=[Entity|IDENTIFIER])
		IScope scope = getScopeProvider().getScope(model, GrammarUtil.getReference(crossReference));	// (cannot be memoised)
		Iterable<IEObjectDescription> candidates = scope.getAllContents();
		for( IEObjectDescription candidate: candidates ) {
			if( !acceptor.canAcceptMoreProposals() ) {
				return;
			}
			// copied and adapted from AbstractJavaBasedContentProposalProvider.DefaultProposalCreator#apply:
			String name = candidate.getName();
			EObject objectOrProxy = candidate.getEObjectOrProxy();
			StyledString displayString = getStyledDisplayString(objectOrProxy, candidate.getQualifiedName(), candidate.getName());
			Image image = getImage(objectOrProxy);
			ICompletionProposal result = createCompletionProposal("&" + name + ";", displayString, image, context); //$NON-NLS-1$ //$NON-NLS-2$
			getPriorityHelper().adjustCrossReferencePriority(result, context.getPrefix());
			acceptor.accept(result);
		}
	}

}
