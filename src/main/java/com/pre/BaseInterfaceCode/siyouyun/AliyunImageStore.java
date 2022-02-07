package com.pre.BaseInterfaceCode.siyouyun;

import com.pre.BaseInterfaceCode.aliyun.Image;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 10:19 上午
 */
public class AliyunImageStore implements ImageStore {
    @Override
    public String upload(Image image, String bucketName) {
        // 上传图片到阿里云
        // 返回图片在阿里云的地址
        createBucketIfNotExisting(bucketName);
        return generateAccessToken();
    }

    @Override
    public Image download(String url) {
        String accessToken = generateAccessToken();
        return null;
    }

    private void createBucketIfNotExisting(String bucketName) {
        // ... 创建 bucket...
        // ... 失败会抛出异常..
    }

    private String generateAccessToken() {
        // ... 根据 accesskey/secrectkey 等生成 access token
        return "token";
    }
}
