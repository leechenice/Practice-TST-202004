//WMV格式视频文件类：具体实现类
public class WMVFile implements VideoFile {
    public void decode(String osType, String fileName) {
        System.out.println(osType+"WMV格式视频文件："+fileName);
    }
}