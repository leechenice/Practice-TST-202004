//Linux播放器类：扩充抽象类
public class LinuxVersion extends OperatingSystemVersion {
    public void play(String fileName) {
        String osType = "Linux平台播放";
        this.vf.decode(osType,fileName);
    }
}