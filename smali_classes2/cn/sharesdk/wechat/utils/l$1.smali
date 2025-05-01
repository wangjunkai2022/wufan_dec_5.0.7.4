.class Lcn/sharesdk/wechat/utils/l$1;
.super Ljava/lang/Object;
.source "WechatHelper.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/wechat/utils/l;->c(Lcn/sharesdk/wechat/utils/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcn/sharesdk/wechat/utils/k;

.field final synthetic c:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic d:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic e:Lcn/sharesdk/wechat/utils/l;


# direct methods
.method constructor <init>(Lcn/sharesdk/wechat/utils/l;ILcn/sharesdk/wechat/utils/k;Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/wechat/utils/l$1;->e:Lcn/sharesdk/wechat/utils/l;

    iput p2, p0, Lcn/sharesdk/wechat/utils/l$1;->a:I

    iput-object p3, p0, Lcn/sharesdk/wechat/utils/l$1;->b:Lcn/sharesdk/wechat/utils/k;

    iput-object p4, p0, Lcn/sharesdk/wechat/utils/l$1;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-object p5, p0, Lcn/sharesdk/wechat/utils/l$1;->d:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget v1, p0, Lcn/sharesdk/wechat/utils/l$1;->a:I

    const/16 v2, 0xb

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v1, 0x25000001

    if-ge p1, v1, :cond_0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    const-string v1, "not support share miniprogram"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$1;->e:Lcn/sharesdk/wechat/utils/l;

    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$1;->b:Lcn/sharesdk/wechat/utils/k;

    const/4 v2, 0x4

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$1;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v4, p0, Lcn/sharesdk/wechat/utils/l$1;->d:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-static {p1, v1, v2, v3, v4}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Lcn/sharesdk/wechat/utils/k;ILcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$1;->e:Lcn/sharesdk/wechat/utils/l;

    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$1;->b:Lcn/sharesdk/wechat/utils/k;

    iget v2, p0, Lcn/sharesdk/wechat/utils/l$1;->a:I

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$1;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v4, p0, Lcn/sharesdk/wechat/utils/l$1;->d:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-static {p1, v1, v2, v3, v4}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Lcn/sharesdk/wechat/utils/k;ILcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 5
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wx share "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :goto_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/utils/l$1;->a(Ljava/lang/Integer;)V

    return-void
.end method
