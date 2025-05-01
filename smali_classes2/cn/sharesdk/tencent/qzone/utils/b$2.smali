.class Lcn/sharesdk/tencent/qzone/utils/b$2;
.super Ljava/lang/Object;
.source "QZoneHelper.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/utils/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic i:Lcn/sharesdk/tencent/qzone/utils/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/utils/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->i:Lcn/sharesdk/tencent/qzone/utils/b;

    iput-object p2, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->b:Ljava/lang/String;

    iput p4, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->c:I

    iput-object p5, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->d:Ljava/lang/String;

    iput-object p6, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->e:Ljava/lang/String;

    iput-object p7, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->f:Ljava/lang/String;

    iput-object p8, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->g:Ljava/lang/String;

    iput-object p9, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->h:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 10

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getAppName()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->a:Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->b:Ljava/lang/String;

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 5
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x14

    if-le v1, v3, :cond_1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "..."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    move-object v7, p1

    .line 7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v1, 0xc8

    if-le p1, v1, :cond_2

    .line 8
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v3, v2

    .line 9
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->i:Lcn/sharesdk/tencent/qzone/utils/b;

    iget v2, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->c:I

    iget-object v4, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->d:Ljava/lang/String;

    iget-object v5, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->e:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->f:Ljava/lang/String;

    iget-object v8, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->g:Ljava/lang/String;

    iget-object v9, p0, Lcn/sharesdk/tencent/qzone/utils/b$2;->h:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-virtual/range {v1 .. v9}, Lcn/sharesdk/tencent/qzone/utils/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 10
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "qzone share "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :goto_1
    return-void
.end method
