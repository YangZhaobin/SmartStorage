package dialog;


import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android_serialport_api.demo.R;

public abstract class BaseDialog extends AlertDialog implements android.view.View.OnClickListener{

	protected BaseDialog(Context context) {
		super(context, R.style.BaseDialog);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 主界面，初始化界面，监听器和数据
		super.onCreate(savedInstanceState);
		initView();
		initListener();
		initData();
	}
	
	public abstract void initView();
	public abstract void initListener();
	public abstract void initData();
	public abstract void processClick(View v);
	
	public void onClick(View v) {
		processClick(v);
		
	}
}