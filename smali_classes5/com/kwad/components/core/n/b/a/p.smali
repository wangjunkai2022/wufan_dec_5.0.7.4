.class final Lcom/kwad/components/core/n/b/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/core/api/IZipper;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final unZip(Ljava/io/InputStream;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/bw;->unZip(Ljava/io/InputStream;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final zip(Ljava/io/File;Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/bw;->zip(Ljava/io/File;Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public final zipFile(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/bw;->zipFile(Ljava/io/File;)V

    return-void
.end method
