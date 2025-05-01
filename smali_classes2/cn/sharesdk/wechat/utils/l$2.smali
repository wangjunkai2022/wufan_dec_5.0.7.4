.class Lcn/sharesdk/wechat/utils/l$2;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:Lcn/sharesdk/wechat/utils/k;

.field final synthetic f:Landroid/graphics/Bitmap;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic i:Lcn/sharesdk/framework/Platform;

.field final synthetic j:Lcn/sharesdk/wechat/utils/l;


# direct methods
.method constructor <init>(Lcn/sharesdk/wechat/utils/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;Landroid/graphics/Bitmap;Ljava/lang/String;Lcn/sharesdk/framework/PlatformActionListener;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/wechat/utils/l$2;->j:Lcn/sharesdk/wechat/utils/l;

    iput-object p2, p0, Lcn/sharesdk/wechat/utils/l$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcn/sharesdk/wechat/utils/l$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lcn/sharesdk/wechat/utils/l$2;->c:Ljava/lang/String;

    iput p5, p0, Lcn/sharesdk/wechat/utils/l$2;->d:I

    iput-object p6, p0, Lcn/sharesdk/wechat/utils/l$2;->e:Lcn/sharesdk/wechat/utils/k;

    iput-object p7, p0, Lcn/sharesdk/wechat/utils/l$2;->f:Landroid/graphics/Bitmap;

    iput-object p8, p0, Lcn/sharesdk/wechat/utils/l$2;->g:Ljava/lang/String;

    iput-object p9, p0, Lcn/sharesdk/wechat/utils/l$2;->h:Lcn/sharesdk/framework/PlatformActionListener;

    iput-object p10, p0, Lcn/sharesdk/wechat/utils/l$2;->i:Lcn/sharesdk/framework/Platform;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 12

    const-string v0, " "

    .line 1
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v7, v1, v2

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v8, p1, v0

    .line 3
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$2;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    .line 4
    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$2;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcn/sharesdk/wechat/utils/l$2;->b:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$2;->c:Ljava/lang/String;

    iget-object v9, p0, Lcn/sharesdk/wechat/utils/l$2;->a:Ljava/lang/String;

    iget v10, p0, Lcn/sharesdk/wechat/utils/l$2;->d:I

    iget-object v11, p0, Lcn/sharesdk/wechat/utils/l$2;->e:Lcn/sharesdk/wechat/utils/k;

    invoke-static/range {v3 .. v11}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$2;->f:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$2;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcn/sharesdk/wechat/utils/l$2;->b:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$2;->c:Ljava/lang/String;

    iget-object v9, p0, Lcn/sharesdk/wechat/utils/l$2;->f:Landroid/graphics/Bitmap;

    iget v10, p0, Lcn/sharesdk/wechat/utils/l$2;->d:I

    iget-object v11, p0, Lcn/sharesdk/wechat/utils/l$2;->e:Lcn/sharesdk/wechat/utils/k;

    invoke-static/range {v3 .. v11}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcn/sharesdk/wechat/utils/l$2;->g:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 8
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$2;->g:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/mob/tools/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 9
    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$2;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcn/sharesdk/wechat/utils/l$2;->b:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$2;->c:Ljava/lang/String;

    iget v10, p0, Lcn/sharesdk/wechat/utils/l$2;->d:I

    iget-object v11, p0, Lcn/sharesdk/wechat/utils/l$2;->e:Lcn/sharesdk/wechat/utils/k;

    invoke-static/range {v3 .. v11}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v3, p0, Lcn/sharesdk/wechat/utils/l$2;->j:Lcn/sharesdk/wechat/utils/l;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcn/sharesdk/wechat/utils/l$2;->b:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/wechat/utils/l$2;->c:Ljava/lang/String;

    const-string v9, ""

    iget v10, p0, Lcn/sharesdk/wechat/utils/l$2;->d:I

    iget-object v11, p0, Lcn/sharesdk/wechat/utils/l$2;->e:Lcn/sharesdk/wechat/utils/k;

    invoke-static/range {v3 .. v11}, Lcn/sharesdk/wechat/utils/l;->a(Lcn/sharesdk/wechat/utils/l;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 11
    iget-object v0, p0, Lcn/sharesdk/wechat/utils/l$2;->h:Lcn/sharesdk/framework/PlatformActionListener;

    if-eqz v0, :cond_3

    .line 12
    iget-object v1, p0, Lcn/sharesdk/wechat/utils/l$2;->i:Lcn/sharesdk/framework/Platform;

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

    invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/utils/l$2;->a(Ljava/lang/String;)V

    return-void
.end method
