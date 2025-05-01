.class public Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;
.super Ljava/lang/Object;
.source "ImageManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/utilities/ImageManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RequestCreatorRunnble"
.end annotation


# instance fields
.field errorResId:I

.field holderResId:I

.field imageView:Landroid/widget/ImageView;

.field final synthetic this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

.field url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/utilities/ImageManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    return-void
.end method

.method private getBitmapFile()Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$300()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/beizi/ad/lance/a/h;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private showError()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$200(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble$2;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble$2;-><init>(Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public error(I)Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->errorResId:I

    return-object p0
.end method

.method public into(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->imageView:Landroid/widget/ImageView;

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$000(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroidx/collection/LruCache;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->getBitmapFile()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$000(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroidx/collection/LruCache;

    move-result-object p1

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$100(Lcom/beizi/ad/internal/utilities/ImageManager;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public placeholder(I)Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->holderResId:I

    return-object p0
.end method

.method public run()V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    const-string v1, "GET"

    .line 3
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v1, 0x7d0

    .line 4
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$200(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble$1;

    invoke-direct {v2, p0, v0}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble$1;-><init>(Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->this$0:Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$000(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroidx/collection/LruCache;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->url:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v2, Ljava/io/File;

    invoke-static {}, Lcom/beizi/ad/internal/utilities/ImageManager;->access$300()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/beizi/ad/lance/a/h;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    .line 12
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 14
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_0

    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->showError()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;->showError()V

    :catch_1
    :goto_0
    return-void
.end method
