package pre.BaseInterfaceCode.siyouyun;

import pre.BaseInterfaceCode.aliyun.Image;

/**
 * @Description: 私有云上传方法
 * @Author: yanzhihao
 * @Date: 2022/1/24 10:22 上午
 */
public class PrivateImageStore implements ImageStore{
    @Override
    public String upload(Image image, String bucketName) {
        // 上传图片到私有云
        // 返回图片url
        createBucketIfNotExisting(bucketName);
        return "";
    }

    @Override
    public Image download(String url) {
        return null;
    }

    private void createBucketIfNotExisting(String bucketName) {
        // ... 创建 bucket...
        // ... 失败会抛出异常..
    }
}
