package example;

import com.espertech.esper.client.EventType;
import com.espertech.esper.core.context.util.AgentInstanceViewFactoryChainContext;
import com.espertech.esper.core.service.StatementContext;
import com.espertech.esper.epl.expression.core.ExprNode;
import com.espertech.esper.view.*;

import java.util.List;

public class LogViewFactory extends ViewFactorySupport {

	public void setViewParameters(ViewFactoryContext viewFactoryContext, List<ExprNode> viewParameters) throws ViewParameterException {

	}

	public void attach(EventType parentEventType, StatementContext statementContext, ViewFactory optionalParentFactory, List<ViewFactory> parentViewFactories)
			throws ViewParameterException {

	}

	public View makeView(AgentInstanceViewFactoryChainContext agentInstanceViewFactoryContext) {
		return null;
	}

	public EventType getEventType() {
		return null;
	}

	@Override
	public String getViewName() {
		return null;
	}

}
