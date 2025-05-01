.class Lcn/sharesdk/tencent/qq/ShareActivity$1;
.super Ljava/lang/Object;
.source "ShareActivity.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/ShareActivity;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:I

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:Ljava/lang/String;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:Lcn/sharesdk/tencent/qq/ShareActivity;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/ShareActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    iput p2, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->a:I

    iput-object p3, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->c:Ljava/lang/String;

    iput-object p5, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->d:Ljava/lang/String;

    iput-object p6, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    iput-object p7, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->f:Ljava/lang/String;

    iput-object p8, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->g:Ljava/lang/String;

    iput-object p9, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->h:Ljava/lang/String;

    iput p10, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->i:I

    iput-object p11, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    iput-object p12, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    iput-object p13, p0, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/mob/tools/utils/DH$DHResponse;->getAppName()Ljava/lang/String;

    move-result-object v9

    .line 2
    iget v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->a:I

    const/16 v3, 0xf

    const/4 v4, 0x0

    const/16 v15, 0x9

    if-ne v2, v3, :cond_2

    .line 3
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    const-string v3, "8.0.8"

    new-array v4, v4, [I

    invoke-virtual {v0, v4}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->resultCompareVersion(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    .line 4
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    const-string v4, "808\u4ee5\u4e0b\u4e0d\u652f\u6301\u5206\u4eab\u5c0f\u7a0b\u5e8f"

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v15, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_0
    return-void

    .line 6
    :cond_1
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->b:Ljava/lang/String;

    iget-object v4, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->c:Ljava/lang/String;

    iget-object v5, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->d:Ljava/lang/String;

    iget-object v6, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    iget-object v7, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->f:Ljava/lang/String;

    iget-object v8, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->g:Ljava/lang/String;

    iget-object v10, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->h:Ljava/lang/String;

    iget v11, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->i:I

    iget-object v12, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    iget-object v13, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    iget-object v14, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    iget v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->a:I

    move v15, v0

    invoke-static/range {v2 .. v15}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$200(Lcn/sharesdk/tencent/qq/ShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 7
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v2

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v3}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v3

    const/16 v5, 0x9

    invoke-interface {v2, v3, v5, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    goto/16 :goto_0

    :cond_2
    const/16 v5, 0x9

    const/16 v3, 0x16

    if-ne v2, v3, :cond_9

    .line 10
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    const-string v4, "Result is MINIAPP_ID_EMPTY : -1"

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v5, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_3
    return-void

    .line 13
    :cond_4
    invoke-static {}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$300()Ljava/util/List;

    move-result-object v2

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 14
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    const-string v4, "Result is MINIAPP_VERSION_WRONG : -7"

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v5, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_5
    return-void

    .line 16
    :cond_6
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    const-string v3, "8.1.8"

    new-array v4, v4, [I

    invoke-virtual {v0, v4}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->resultCompareVersion(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_8

    .line 17
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 18
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    const-string v4, "Result is MINIAPP_SHOULD_DOWNLOAD : -2"

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2, v5, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_7
    return-void

    .line 19
    :cond_8
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    iget-object v4, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    invoke-static {v0, v2, v3, v4}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$400(Lcn/sharesdk/tencent/qq/ShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v2}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$000(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v2

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    invoke-static {v3}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$100(Lcn/sharesdk/tencent/qq/ShareActivity;)Lcn/sharesdk/framework/Platform;

    move-result-object v3

    invoke-interface {v2, v3, v5, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    goto/16 :goto_0

    .line 23
    :cond_9
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->f:Ljava/lang/String;

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    new-instance v0, Ljava/io/File;

    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->f:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    iget-object v0, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 25
    new-instance v0, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;

    invoke-direct {v0, v1, v9}, Lcn/sharesdk/tencent/qq/ShareActivity$1$1;-><init>(Lcn/sharesdk/tencent/qq/ShareActivity$1;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 27
    :cond_b
    iget-object v2, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->m:Lcn/sharesdk/tencent/qq/ShareActivity;

    iget-object v3, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->b:Ljava/lang/String;

    iget-object v4, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->c:Ljava/lang/String;

    iget-object v5, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->d:Ljava/lang/String;

    iget-object v6, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->e:Ljava/lang/String;

    iget-object v7, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->f:Ljava/lang/String;

    iget-object v8, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->g:Ljava/lang/String;

    iget-object v10, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->h:Ljava/lang/String;

    iget v11, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->i:I

    iget-object v12, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->j:Ljava/lang/String;

    iget-object v13, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->k:Ljava/lang/String;

    iget-object v14, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->l:Ljava/lang/String;

    iget v15, v1, Lcn/sharesdk/tencent/qq/ShareActivity$1;->a:I

    invoke-static/range {v2 .. v15}, Lcn/sharesdk/tencent/qq/ShareActivity;->access$600(Lcn/sharesdk/tencent/qq/ShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 28
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :cond_c
    :goto_0
    return-void
.end method
