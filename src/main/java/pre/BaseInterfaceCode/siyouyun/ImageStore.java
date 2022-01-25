package pre.BaseInterfaceCode.siyouyun;

import pre.BaseInterfaceCode.aliyun.Image;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 10:19 上午
 */
public interface ImageStore {
    String upload(Image image, String bucketName);
    Image download(String url);
}
