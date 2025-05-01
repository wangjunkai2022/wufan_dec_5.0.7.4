package com.tencent.cos;

import com.tencent.cos.model.CreateDirRequest;
import com.tencent.cos.model.CreateDirResult;
import com.tencent.cos.model.DeleteObjectRequest;
import com.tencent.cos.model.DeleteObjectResult;
import com.tencent.cos.model.GetObjectMetadataRequest;
import com.tencent.cos.model.GetObjectMetadataResult;
import com.tencent.cos.model.GetObjectRequest;
import com.tencent.cos.model.GetObjectResult;
import com.tencent.cos.model.HeadBucketRequest;
import com.tencent.cos.model.HeadBucketResult;
import com.tencent.cos.model.ListDirRequest;
import com.tencent.cos.model.ListDirResult;
import com.tencent.cos.model.PutObjectRequest;
import com.tencent.cos.model.PutObjectResult;
import com.tencent.cos.model.RemoveEmptyDirRequest;
import com.tencent.cos.model.RemoveEmptyDirResult;
import com.tencent.cos.model.UpdateObjectRequest;
import com.tencent.cos.model.UpdateObjectResult;
import com.tencent.cos.task.Task;
import java.util.List;
/* loaded from: classes5.dex */
public interface COS {
    boolean cancelTask(int i4);

    CreateDirResult createDir(CreateDirRequest createDirRequest);

    DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest);

    GetObjectResult getObject(GetObjectRequest getObjectRequest);

    GetObjectMetadataResult getObjectMetadata(GetObjectMetadataRequest getObjectMetadataRequest);

    HeadBucketResult headBucket(HeadBucketRequest headBucketRequest);

    ListDirResult listDir(ListDirRequest listDirRequest);

    List<Task> listTasks();

    boolean pauseTask(int i4);

    PutObjectResult putObject(PutObjectRequest putObjectRequest);

    RemoveEmptyDirResult removeEmptyDir(RemoveEmptyDirRequest removeEmptyDirRequest);

    boolean resumeTask(int i4);

    UpdateObjectResult updateObject(UpdateObjectRequest updateObjectRequest);
}
