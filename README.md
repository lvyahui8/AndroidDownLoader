AndroidDownLoader
=================
    This is a multi-threaded download, can run on Android platform,
    The org.lyh.androiddownloader.service.DownLoader class is the main
##You can use this class in any place
e.g
-----
```Java
final String uri = "http://www.voidtools.com/Everything-1.3.4.686.x86-Setup.exe";
DownLoader downLoader = new DownLoader(uri);
String fullName = SDCardUtils.getSDCardPath() + "ecerthing.exe";
downLoader.setFileFullName(fullName);
downLoader.setThreadCount(4); 
downLoader.startDownload();
