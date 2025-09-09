package com.kingsley.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("kingsley-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
