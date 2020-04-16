//Unix播放器类：扩充抽象类
public class UnixVersion extends OperatingSystemVersion {
    public void play(String fileName) {
        String osType = "Unix平台播放";
        this.vf.decode(osType,fileName);
    }

}