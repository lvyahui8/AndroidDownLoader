package org.lyh.androiddownloader;

import org.lyh.androiddownloader.service.DownLoader;
import org.lyh.androiddownloader.utils.SDCardUtils;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final String uri = "http://www.voidtools.com/Everything-1.3.4.686.x86-Setup.exe";
		DownLoader downLoader = new DownLoader(uri);
		String fullName = SDCardUtils.getSDCardPath() + "ecerthing.exe";
		downLoader.setFileFullName(fullName);
		downLoader.setThreadCount(4); 
		downLoader.startDownload();
	}
}
