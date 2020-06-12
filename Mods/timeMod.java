package gurjasclient.mods.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import gurjasclient.gui.hud.ScreenPosition;
import gurjasclient.mods.ModDraggable;

public class timeMod extends ModDraggable {

	/* 
	 * Made by GurJas
	 * 2020-06-12
	 */
	
	@Override
	public int getWidth() {
		return font.getStringWidth("HH:DD:SS a");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		// 24 Hour Clock

//	    Calendar cal = Calendar.getInstance();
//	    Date date=cal.getTime();
//	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//	    String formattedDate = dateFormat.format(date);
		
		
		// 12 Hour Clock
		Date date = new Date();
	    String strDateFormat = "hh:mm:ss a";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate = dateFormat.format(date);
	    
	    // Text
		font.drawString("Time: " + formattedDate, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);	
	}

}
