package it.uniba.di.socialcdeforeclipse.action;

import it.uniba.di.socialcdeforeclipse.controller.Controller;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Widget;

public class ActionDynamicPeople {

	public ActionDynamicPeople(Widget widget, Event event)
	{
		String widgetName = widget.getData("ID_action").toString();
		
		switch (widgetName) {
		case "User_selected":
			Controller.temporaryInformation.put("User_selected", widget.getData("User_data")); 
			Controller.temporaryInformation.put("User_type", widget.getData("User_type")); 
			
			Controller.selectDynamicWindow(3); 
			break;
		
		

		default:
			break;
		}
		
	}
	
}
