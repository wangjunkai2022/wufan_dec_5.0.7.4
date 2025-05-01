.class Lcom/beizi/ad/internal/view/f$2;
.super Ljava/lang/Object;
.source "MRAIDImplementation.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/f;->d(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beizi/ad/internal/view/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/f;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->b:Lcom/beizi/ad/internal/view/f;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string p2, "data:"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string p2, "image/gif"

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b

    const-string p2, ".png"

    if-eqz p1, :cond_0

    :try_start_1
    const-string p2, ".gif"

    goto :goto_1

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "image/jpeg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "image/pjpeg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "image/png"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "image/tiff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p2, ".tif"

    goto :goto_1

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "image/svg+xml"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p2, ".svg"

    goto :goto_1

    :cond_4
    :goto_0
    const-string p2, ".jpg"

    .line 7
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    const-string v0, "base64"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    .line 8
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/f$2;->b:Lcom/beizi/ad/internal/view/f;

    iget-object v1, v1, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/lance/a/h;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_b

    const/4 p2, 0x0

    .line 9
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 10
    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result p2
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p2, :cond_7

    const-string p2, ","

    if-nez p1, :cond_6

    .line 11
    :try_start_4
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/Hex;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_2

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lcom/beizi/ad/internal/view/f$2;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 13
    :goto_2
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 14
    :cond_7
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_b

    goto/16 :goto_9

    .line 15
    :catch_0
    :try_start_6
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2

    :goto_3
    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_b

    goto/16 :goto_9

    :catchall_0
    move-exception p1

    move-object p2, v1

    goto :goto_7

    :catch_1
    move-object p2, v1

    goto :goto_4

    :catch_2
    move-object p2, v1

    goto :goto_5

    :catch_3
    move-object p2, v1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_7

    .line 16
    :catch_4
    :goto_4
    :try_start_7
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz p2, :cond_9

    .line 17
    :try_start_8
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_b

    goto :goto_9

    .line 18
    :catch_5
    :try_start_9
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_b

    goto :goto_3

    .line 19
    :catch_6
    :goto_5
    :try_start_a
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    if-eqz p2, :cond_9

    .line 20
    :try_start_b
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_9

    .line 21
    :catch_7
    :try_start_c
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    goto :goto_3

    .line 22
    :catch_8
    :goto_6
    :try_start_d
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    if-eqz p2, :cond_9

    .line 23
    :try_start_e
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_b

    goto :goto_9

    .line 24
    :catch_9
    :try_start_f
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_b

    goto :goto_3

    :goto_7
    if-eqz p2, :cond_8

    .line 25
    :try_start_10
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_b

    goto :goto_8

    .line 26
    :catch_a
    :try_start_11
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mraidLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->store_picture_error:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_8
    :goto_8
    throw p1

    .line 28
    :cond_9
    :goto_9
    iget-object p1, p0, Lcom/beizi/ad/internal/view/f$2;->b:Lcom/beizi/ad/internal/view/f;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/f;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->c()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    goto :goto_a

    :catch_b
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_a
    return-void
.end method
