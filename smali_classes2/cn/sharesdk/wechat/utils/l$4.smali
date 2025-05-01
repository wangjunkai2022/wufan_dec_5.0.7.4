.class Lcn/sharesdk/wechat/utils/l$4;
.super Ljava/lang/Object;
.source "WechatHelper.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/k;ILcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/wechat/utils/k;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:Landroid/graphics/Bitmap;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic i:Lcn/sharesdk/framework/Platform;

.field final synthetic j:Lcn/sharesdk/wechat/utils/l;


# direct methods
.method constructor <init>(Lcn/sharesdk/wechat/utils/l;Lcn/sharesdk/wechat/utils/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/wechat/utils/l$4;->j:Lcn/sharesdk/wechat/utils/l;

    iput-object p2, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    iput-object p3, p0, Lcn/sharesdk/wechat/utils/l$4;->b:Ljava/lang/String;

    iput-object p4, p0, Lcn/sharesdk/wechat/utils/l$4;->c:Ljava/lang/String;

    iput-object p5, p0, Lcn/sharesdk/wechat/utils/l$4;->d:Ljava/lang/String;

    iput p6, p0, Lcn/sharesdk/wechat/utils/l$4;->e:I

    iput-object p7, p0, Lcn/sharesdk/wechat/utils/l$4;->f:Landroid/graphics/Bitmap;

    iput-object p8, p0, Lcn/sharesdk/wechat/utils/l$4;->g:Ljava/lang/String;

    iput-object p9, p0, Lcn/sharesdk/wechat/utils/l$4;->h:Lcn/sharesdk/framework/PlatformActionListener;

    iput-object p10, p0, Lcn/sharesdk/wechat/utils/l$4;->i:Lcn/sharesdk/framework/Platform;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/k;->a()Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/InnerShareParams;->setUrl(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$4;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$4;->c:Ljava/lang/String;

    iget-object v4, p0, Lcn/sharesdk/wechat/utils/l$4;->d:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$4;->b:Ljava/lang/String;

    iget v7, p0, Lcn/sharesdk/wechat/utils/l$4;->e:I

    iget-object v8, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    move-object v5, p1

    invoke-static/range {v1 .. v8}, Lcn/sharesdk/wechat/utils/l;->b(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->f:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$4;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$4;->c:Ljava/lang/String;

    iget-object v4, p0, Lcn/sharesdk/wechat/utils/l$4;->d:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$4;->f:Landroid/graphics/Bitmap;

    iget v7, p0, Lcn/sharesdk/wechat/utils/l$4;->e:I

    iget-object v8, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    move-object v5, p1

    invoke-static/range {v1 .. v8}, Lcn/sharesdk/wechat/utils/l;->b(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 7
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$4;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/mob/tools/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 8
    iget-object v2, p0, Lcn/sharesdk/wechat/utils/l$4;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcn/sharesdk/wechat/utils/l$4;->c:Ljava/lang/String;

    iget-object v5, p0, Lcn/sharesdk/wechat/utils/l$4;->d:Ljava/lang/String;

    iget v8, p0, Lcn/sharesdk/wechat/utils/l$4;->e:I

    iget-object v9, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    move-object v6, p1

    invoke-static/range {v2 .. v9}, Lcn/sharesdk/wechat/utils/l;->b(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/wechat/utils/l$4;->c:Ljava/lang/String;

    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$4;->d:Ljava/lang/String;

    const-string v5, ""

    iget v6, p0, Lcn/sharesdk/wechat/utils/l$4;->e:I

    iget-object v7, p0, Lcn/sharesdk/wechat/utils/l$4;->a:Lcn/sharesdk/wechat/utils/k;

    move-object v4, p1

    invoke-static/range {v0 .. v7}, Lcn/sharesdk/wechat/utils/l;->b(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 10
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$4;->h:Lcn/sharesdk/framework/PlatformActionListener;

    if-eqz v0, :cond_3

    .line 11
    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$4;->i:Lcn/sharesdk/framework/Platform;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/utils/l$4;->a(Ljava/lang/String;)V

    return-void
.end method
