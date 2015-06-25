package md5e7832a0341eabf929e5c4d5e013ccfa4;


public class MainView
	extends md5e7832a0341eabf929e5c4d5e013ccfa4.BaseView
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Festival.Droid.Views.MainView, Festival.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainView.class, __md_methods);
	}


	public MainView () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainView.class)
			mono.android.TypeManager.Activate ("Festival.Droid.Views.MainView, Festival.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
