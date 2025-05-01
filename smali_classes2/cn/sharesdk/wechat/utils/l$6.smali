.class Lcn/sharesdk/wechat/utils/l$6;
.super Ljava/lang/Object;
.source "WechatHelper.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/wechat/utils/l;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcn/sharesdk/wechat/utils/WXImageObject;

.field final synthetic c:Lcn/sharesdk/wechat/utils/k;

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Landroid/content/Context;

.field final synthetic h:Lcn/sharesdk/wechat/utils/l;


# direct methods
.method constructor <init>(Lcn/sharesdk/wechat/utils/l;Ljava/lang/String;Lcn/sharesdk/wechat/utils/WXImageObject;Lcn/sharesdk/wechat/utils/k;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/wechat/utils/l$6;->h:Lcn/sharesdk/wechat/utils/l;

    iput-object p2, p0, Lcn/sharesdk/wechat/utils/l$6;->a:Ljava/lang/String;

    iput-object p3, p0, Lcn/sharesdk/wechat/utils/l$6;->b:Lcn/sharesdk/wechat/utils/WXImageObject;

    iput-object p4, p0, Lcn/sharesdk/wechat/utils/l$6;->c:Lcn/sharesdk/wechat/utils/k;

    iput p5, p0, Lcn/sharesdk/wechat/utils/l$6;->d:I

    iput-object p6, p0, Lcn/sharesdk/wechat/utils/l$6;->e:Ljava/lang/String;

    iput-object p7, p0, Lcn/sharesdk/wechat/utils/l$6;->f:Ljava/lang/String;

    iput-object p8, p0, Lcn/sharesdk/wechat/utils/l$6;->g:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$6;->h:Lcn/sharesdk/wechat/utils/l;

    invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/l;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->a:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->h:Lcn/sharesdk/wechat/utils/l;

    invoke-virtual {v0, p1}, Lcn/sharesdk/wechat/utils/l;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->b:Lcn/sharesdk/wechat/utils/WXImageObject;

    iput-object p1, v0, Lcn/sharesdk/wechat/utils/WXImageObject;->imagePath:Ljava/lang/String;

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ShareSDK share file with FileProvider path is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/String;)I

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$6;->c:Lcn/sharesdk/wechat/utils/k;

    invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/k;->c()Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 8
    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Wecaht Version is not new"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->c:Lcn/sharesdk/wechat/utils/k;

    invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/k;->c()Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$6;->c:Lcn/sharesdk/wechat/utils/k;

    invoke-virtual {v1}, Lcn/sharesdk/wechat/utils/k;->b()Lcn/sharesdk/framework/Platform;

    move-result-object v1

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    .line 10
    :cond_1
    :goto_0
    new-instance p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;

    invoke-direct {p1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V

    .line 11
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->b:Lcn/sharesdk/wechat/utils/WXImageObject;

    iput-object v0, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;

    .line 12
    iget v0, p0, Lcn/sharesdk/wechat/utils/l$6;->d:I

    if-eqz v0, :cond_2

    .line 13
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->e:Ljava/lang/String;

    iput-object v0, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;

    .line 14
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->f:Ljava/lang/String;

    iput-object v0, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;

    .line 15
    :cond_2
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->h:Lcn/sharesdk/wechat/utils/l;

    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$6;->g:Landroid/content/Context;

    iget-object v2, p0, Lcn/sharesdk/wechat/utils/l$6;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Z)[B

    move-result-object v0

    iput-object v0, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B

    .line 16
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$6;->h:Lcn/sharesdk/wechat/utils/l;

    const-string v1, "img"

    iget v2, p0, Lcn/sharesdk/wechat/utils/l$6;->d:I

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$6;->c:Lcn/sharesdk/wechat/utils/k;

    invoke-static {v0, p1, v1, v2, v3}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 17
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/utils/l$6;->a(Ljava/lang/Boolean;)V

    return-void
.end method
