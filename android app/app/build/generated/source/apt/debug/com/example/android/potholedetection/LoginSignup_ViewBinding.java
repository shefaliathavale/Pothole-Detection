// Generated code from Butter Knife. Do not modify!
package com.example.android.potholedetection;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginSignup_ViewBinding implements Unbinder {
  private LoginSignup target;

  @UiThread
  public LoginSignup_ViewBinding(LoginSignup target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginSignup_ViewBinding(LoginSignup target, View source) {
    this.target = target;

    target._emailText = Utils.findRequiredViewAsType(source, R.id.input_email, "field '_emailText'", EditText.class);
    target._usernameText = Utils.findRequiredViewAsType(source, R.id.input_username, "field '_usernameText'", EditText.class);
    target._passwordText = Utils.findRequiredViewAsType(source, R.id.input_password, "field '_passwordText'", EditText.class);
    target._loginButton = Utils.findRequiredViewAsType(source, R.id.btn_login, "field '_loginButton'", Button.class);
    target._signupLink = Utils.findRequiredViewAsType(source, R.id.link_signup, "field '_signupLink'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginSignup target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target._emailText = null;
    target._usernameText = null;
    target._passwordText = null;
    target._loginButton = null;
    target._signupLink = null;
  }
}
