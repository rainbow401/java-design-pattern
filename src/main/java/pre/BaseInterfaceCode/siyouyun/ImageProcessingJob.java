package pre.BaseInterfaceCode.siyouyun;

import pre.BaseInterfaceCode.aliyun.Image;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 10:26 上午
 */
public class ImageProcessingJob {

    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        Image image = new Image(); //处理图片，并封装为Image对象；
        ImageStore imageStore = new PrivateImageStore();
        imageStore.upload(image, BUCKET_NAME);
    }
}
