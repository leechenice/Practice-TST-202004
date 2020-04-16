//Windows播放器类：扩充抽象类
public class WindowsVersion extends OperatingSystemVersion {
    public void play(String fileName) {
        String osType = "Windows平台播放";
        this.vf.decode(osType,fileName);
    }
}