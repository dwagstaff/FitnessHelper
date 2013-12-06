package com.wagstaffnet.projects.fitmgr.client;

import com.wagstaffnet.projects.fitmgr.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.animation.AnimationHelper;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FitnessManager implements EntryPoint {
	  public void onModuleLoad() {
		    // set viewport and other settings for mobile
		    MGWT.applySettings(MGWTSettings.getAppSetting());

		    // build animation helper and attach it
		    AnimationHelper animationHelper = new AnimationHelper();
		    RootPanel.get().add(animationHelper);

		    // build some UI
		    LayoutPanel layoutPanel = new LayoutPanel();
		    Button button = new Button("Hello mgwt");
		    layoutPanel.add(button);

		    // animate
		    animationHelper.goTo(layoutPanel, Animation.SLIDE);

		  }


}
