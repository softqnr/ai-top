package crc6484fad89fba26ff1d;


public class CellBaseView
	extends android.widget.RelativeLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AiForms.Renderers.Droid.CellBaseView, SettingsView.Droid", CellBaseView.class, __md_methods);
	}


	public CellBaseView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CellBaseView.class)
			mono.android.TypeManager.Activate ("AiForms.Renderers.Droid.CellBaseView, SettingsView.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CellBaseView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CellBaseView.class)
			mono.android.TypeManager.Activate ("AiForms.Renderers.Droid.CellBaseView, SettingsView.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CellBaseView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CellBaseView.class)
			mono.android.TypeManager.Activate ("AiForms.Renderers.Droid.CellBaseView, SettingsView.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
