//客户端测试类
public class Client {

    public static void main(String args[]) {
        VideoFile vf;
        OperatingSystemVersion osType1 = new WindowsVersion();
//        vf = new AVIFile();
//        vf = new RMVBFile();
//        vf = new MPEGFile();
        vf = new WMVFile();
        osType1.setVideo(vf);
        osType1.play("低俗小说");

        OperatingSystemVersion osType2 = new LinuxVersion();
//        vf = new AVIFile();
//        vf = new RMVBFile();
//        vf = new MPEGFile();
        vf = new WMVFile();
        osType2.setVideo(vf);
        osType2.play("落水狗");

        OperatingSystemVersion osType3 = new UnixVersion();
//        vf = new AVIFile();
//        vf = new RMVBFile();
//        vf = new MPEGFile();
        vf = new WMVFile();
        osType3.setVideo(vf);
        osType3.play("杀死比尔");
    }
}
