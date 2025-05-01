.class Lcn/sharesdk/tencent/qq/ShareActivity$1$1;
.super Ljava/lang/Thread;
.source "ShareActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/ShareActivity$1;->onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcn/sharesdk/tencent/qq/ShareActivity$1;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/ShareActivity$1;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->b:Lcn/sharesdk/tencent/qq/ShareActivity$1;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 19

    move-object/from16 v1, p0

    const-string v2, "ShareSDK"

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 1
    :try_start_0
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->b:Lcn/sharesdk/tencent/qq/ShareActivity$1;

    iget-object v0, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$500(Lcn/sharesdk/tencent/qq/ShareActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v5, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->b:Lcn/sharesdk/tencent/qq/ShareActivity$1;

    iget-object v5, v5, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    invoke-static {v0, v5}, Lcom/mob/tools/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v5

    new-array v6, v4, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, " QQ ShareActivity path: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-virtual {v5, v2, v6}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    :try_start_1
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v5

    new-array v6, v4, [Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, " QQ ShareActivity path catch "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-virtual {v5, v2, v6}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    :goto_0
    move-object v10, v0

    .line 5
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->b:Lcn/sharesdk/tencent/qq/ShareActivity$1;

    iget-object v5, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    iget-object v6, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->b:Ljava/lang/String;

    iget-object v7, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->c:Ljava/lang/String;

    iget-object v8, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->d:Ljava/lang/String;

    iget-object v9, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    iget-object v11, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->g:Ljava/lang/String;

    iget-object v12, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;->a:Ljava/lang/String;

    iget-object v13, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->h:Ljava/lang/String;

    iget v14, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->i:I

    iget-object v15, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    iget-object v3, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    iget-object v4, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    iget v0, v0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->a:I

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move/from16 v18, v0

    invoke-static/range {v5 .. v18}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$600(Lcn/sharesdk/tencent/qq/ShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    .line 7
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, " QQ ShareActivity run catch "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v3, v2, v4}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :goto_1
    return-void
.end method
