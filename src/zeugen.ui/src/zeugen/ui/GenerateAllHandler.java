package zeugen.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;

public class GenerateAllHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event)
			throws org.eclipse.core.commands.ExecutionException {
		System.out.println("Generate All");
		return null;
	}

	
}
