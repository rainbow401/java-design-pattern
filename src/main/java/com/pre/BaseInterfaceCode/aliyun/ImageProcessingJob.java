package com.pre.BaseInterfaceCode.aliyun;


/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/20 2:40 下午
 */
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        Image image = new Image(); //处理图片，并封装为Image对象；
        AliyunImageStore imageStore = new AliyunImageStore();
        imageStore.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken = imageStore.generateAccessToken();
        imageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
    }
}
