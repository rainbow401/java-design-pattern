package com.pre.BaseInterfaceCode.aliyun;


/**
 * @Description: 整个上传流程包含三个步骤：创建 bucket（你可以简单理解为存储目录）、
 * 生成 access token 访问凭证、携带 access token 上传图片到指定的 bucket 中。
 * 代码实现非常简单，类中的几个方法定义得都很干净，用起来也很清晰，乍看起来没有太大问题，
 * 完全能满足我们将图片存储在阿里云的业务需求。
 * @Author: yanzhihao
 * @Date: 2022/1/20 2:34 下午
 */
public class AliyunImageStore {
    public void createBucketIfNotExisting(String bucketName) {
        // ... 创建 bucket 代码逻辑...
        // ... 失败会抛出异常..
    }

    public String generateAccessToken() {
        // ... 根据 accesskey/secrectkey 等生成 access token
        return "";
    }

    public String uploadToAliyun(Image image, String bucketName, String accessTok) {
        //... 上传图片到阿里云...
        // ... 返回图片存储在阿里云上的地址 (url）...
        return "";
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        //... 从阿里云下载图片...
        return null;
    }
}
