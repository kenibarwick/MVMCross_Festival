package md5e7832a0341eabf929e5c4d5e013ccfa4;


public abstract class BaseView
	extends md57b8dd31b26d57b878589ceca204f3b49.MvxActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Festival.Droid.Views.BaseView, Festival.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseView.class, __md_methods);
	}


	public BaseView () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BaseView.class)
			mono.android.TypeManager.Activate ("Festival.Droid.Views.BaseView, Festival.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
