package crc6484fad89fba26ff1d;


public class CustomFooterViewHolder
	extends crc6484fad89fba26ff1d.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AiForms.Renderers.Droid.CustomFooterViewHolder, SettingsView.Droid", CustomFooterViewHolder.class, __md_methods);
	}


	public CustomFooterViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == CustomFooterViewHolder.class)
			mono.android.TypeManager.Activate ("AiForms.Renderers.Droid.CustomFooterViewHolder, SettingsView.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
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
